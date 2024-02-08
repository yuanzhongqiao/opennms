/*
 * Licensed to The OpenNMS Group, Inc (TOG) under one or more
 * contributor license agreements.  See the LICENSE.md file
 * distributed with this work for additional information
 * regarding copyright ownership.
 *
 * TOG licenses this file to You under the GNU Affero General
 * Public License Version 3 (the "License") or (at your option)
 * any later version.  You may not use this file except in
 * compliance with the License.  You may obtain a copy of the
 * License at:
 *
 *      https://www.gnu.org/licenses/agpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied.  See the License for the specific
 * language governing permissions and limitations under the
 * License.
 */
package org.opennms.netmgt.dao.support;

import static org.mockito.Mockito.*;

import java.io.File;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.opennms.core.test.ConfigurationTestUtils;
import org.opennms.core.utils.InetAddressUtils;
import org.opennms.netmgt.config.CollectdConfigFactory;
import org.opennms.netmgt.config.api.ResourceTypesDao;
import org.opennms.netmgt.config.datacollection.ResourceType;
import org.opennms.netmgt.dao.api.NodeDao;
import org.opennms.netmgt.filter.FilterDaoFactory;
import org.opennms.netmgt.filter.api.FilterDao;
import org.opennms.netmgt.model.OnmsIpInterface;
import org.opennms.netmgt.model.OnmsNode;
import org.opennms.netmgt.model.OnmsResource;
import org.opennms.netmgt.model.ResourceTypeUtils;
import org.opennms.netmgt.rrd.RrdStrategy;
import org.opennms.netmgt.rrd.jrobin.JRobinRrdStrategy;
import org.opennms.test.FileAnticipator;

public class FindTopLevelResourcesTest {
    private NodeDao m_nodeDao;
    private CollectdConfigFactory m_collectdConfig;
    private ResourceTypesDao m_resourceTypesDao;
    private DefaultResourceDao m_resourceDao;
    private FilesystemResourceStorageDao m_resourceStorageDao = new FilesystemResourceStorageDao();

    private FileAnticipator m_fileAnticipator;

    private FilterDao m_filterDao;

    private String m_rrdFileExtension;

    @Before
    public void setUp() throws Exception {
        m_fileAnticipator = new FileAnticipator();

        m_nodeDao = mock(NodeDao.class);
        m_resourceTypesDao = mock(ResourceTypesDao.class);
        m_filterDao = mock(FilterDao.class);

        FilterDaoFactory.setInstance(m_filterDao);

        when(m_filterDao.getActiveIPAddressList("IPADDR IPLIKE *.*.*.*")).thenReturn(new ArrayList<InetAddress>(0));

        RrdStrategy<?, ?> rrdStrategy = new JRobinRrdStrategy();
        m_rrdFileExtension = rrdStrategy.getDefaultFileExtension();

        m_resourceStorageDao.setRrdDirectory(m_fileAnticipator.getTempDir());
        m_resourceStorageDao.setRrdStrategy(rrdStrategy);

        InputStream stream = ConfigurationTestUtils.getInputStreamForResource(this, "/collectdconfiguration-testdata.xml");
        m_collectdConfig = new CollectdConfigFactory(stream);

        m_resourceDao = new DefaultResourceDao();
        m_resourceDao.setNodeDao(m_nodeDao);
        m_resourceDao.setCollectdConfig(m_collectdConfig);
        m_resourceDao.setResourceTypesDao(m_resourceTypesDao);
        m_resourceDao.setResourceStorageDao(m_resourceStorageDao);
    }

    @After
    public void tearDown() {
        verifyNoMoreInteractions(m_nodeDao);
        verifyNoMoreInteractions(m_resourceTypesDao);
        verifyNoMoreInteractions(m_filterDao);

        m_fileAnticipator.tearDown();
        setStoreByForeignSource(false);
    }

    private void setStoreByForeignSource(boolean storeByForeignSource) {
        System.setProperty("org.opennms.rrd.storeByForeignSource", Boolean.toString(storeByForeignSource));
    }

    @Test
    public void testFindTopLevelResources_discoveredNodesWithoutStoreByForeignSource() throws Exception {
        setStoreByForeignSource(false);
        execute_testFindTopLevelResources_discoveredNodes();
    }

    @Test
    public void testFindTopLevelResources_discoveredNodesWithStoreByForeignSource() throws Exception {
        setStoreByForeignSource(true);
        execute_testFindTopLevelResources_discoveredNodes();
    }

    /*
     * On environments where all the nodes have been discovered (i.e. they are not part of a requisition),
     * the top level resources are always going to be built using NodeResourceType.
     * no matter if storeByForeignSource is enabled or not.
     */
    private void execute_testFindTopLevelResources_discoveredNodes() throws Exception {
        final List<OnmsNode> nodes = new ArrayList<>();

        OnmsNode n1 = createNode(1, "node1", null, null, "10.0.0.1"); // Node on the DB with RRD Data
        nodes.add(n1);
        OnmsNode n2 = createNode(2, "node2", null, null, "10.0.0.2"); // Node on the DB with No RRD Data
        nodes.add(n2);

        when(m_resourceTypesDao.getLastUpdate()).thenReturn(new Date(System.currentTimeMillis()));
        when(m_resourceTypesDao.getResourceTypes()).thenReturn(new HashMap<String, ResourceType>());
        when(m_nodeDao.findAll()).thenReturn(nodes);

        // Common directories
        File snmpDir = m_fileAnticipator.tempDir(ResourceTypeUtils.SNMP_DIRECTORY);
        File responseDir = m_fileAnticipator.tempDir(ResourceTypeUtils.RESPONSE_DIRECTORY);

        // RRD Directory for n1
        File nodeDir = m_fileAnticipator.tempDir(snmpDir, n1.getId().toString());
        m_fileAnticipator.tempFile(nodeDir, "data" + m_rrdFileExtension);

        // RRD Directory for an orphan node
        File orphanDir = m_fileAnticipator.tempDir(snmpDir, "100");
        m_fileAnticipator.tempFile(orphanDir, "data" + m_rrdFileExtension);

        // Response Time RRD Directory for n1
        File ipDir = m_fileAnticipator.tempDir(responseDir, n1.getIpInterfaces().iterator().next().getIpAddress().getHostAddress());
        m_fileAnticipator.tempFile(ipDir, "icmp" + m_rrdFileExtension);

        m_resourceDao.afterPropertiesSet();

        // Verify node1
        List<OnmsResource> resources = m_resourceDao.findTopLevelResources();
        Assert.assertNotNull(resources);
        Collections.sort(resources);
        Assert.assertEquals(1, resources.size());
        List<OnmsResource> children = resources.get(0).getChildResources();
        Collections.sort(children, Comparator.comparing(OnmsResource::getName));
        Assert.assertEquals(2, children.size());
        Assert.assertEquals("node[1].nodeSnmp[]", children.get(0).getId().toString());
        Assert.assertEquals("node[1].responseTime[10.0.0.1]", children.get(1).getId().toString());

        verify(m_resourceTypesDao, atLeastOnce()).getLastUpdate();
        verify(m_resourceTypesDao, atLeastOnce()).getResourceTypes();
        verify(m_nodeDao, atLeastOnce()).findAll();
    }

    @Test
    public void testFindTopLevelResources_provisionedNodesWithoutStoreByForeignSource() throws Exception {
        execute_testFindTopLevelResources_provisionedNodes(false);
    }

    @Test
    public void testFindTopLevelResources_provisionedNodesWithStoreByForeignSource() throws Exception {
        execute_testFindTopLevelResources_provisionedNodes(true);
    }

    /*
     * On environments where all the nodes are part of a requisition (i.e. they have been provisioned)
     * the top level resources are always going to be built using NodeSourceResourceType only
     * if storeByForeignSource is enabled, otherwise they are all going to built using NodeResourceType.
     */
    private void execute_testFindTopLevelResources_provisionedNodes(boolean storeByForeignSource) throws Exception {
        setStoreByForeignSource(storeByForeignSource);
        final List<OnmsNode> nodes = new ArrayList<>();
        final String foreignSource = "Junit";

        OnmsNode n1 = createNode(1, "node1", foreignSource, "node1", "10.0.0.1"); // Node on the DB with RRD Data with Response Time
        nodes.add(n1);
        OnmsNode n2 = createNode(2, "node2", foreignSource, "node2", "10.0.0.2"); // Node on the DB with RRD Data without Response Time
        nodes.add(n2);
        OnmsNode n3 = createNode(3, "node3", foreignSource, "node3", "10.0.0.3"); // Node on the DB with No RRD Data or Response Time
        nodes.add(n3);

        when(m_resourceTypesDao.getLastUpdate()).thenReturn(new Date(System.currentTimeMillis()));
        when(m_resourceTypesDao.getResourceTypes()).thenReturn(new HashMap<String, ResourceType>());
        when(m_nodeDao.findAll()).thenReturn(nodes);

        // Common directories
        File snmpDir = m_fileAnticipator.tempDir(ResourceTypeUtils.SNMP_DIRECTORY);
        File responseDir = m_fileAnticipator.tempDir(ResourceTypeUtils.RESPONSE_DIRECTORY);
        File fsDir = m_fileAnticipator.tempDir(snmpDir, ResourceTypeUtils.FOREIGN_SOURCE_DIRECTORY);
        File foreignSourceDir = m_fileAnticipator.tempDir(fsDir, foreignSource);

        // RRD Directory for n1
        File nodeDir = null;
        if (storeByForeignSource) {
            nodeDir = m_fileAnticipator.tempDir(foreignSourceDir, n1.getForeignId());
        } else {
            nodeDir = m_fileAnticipator.tempDir(snmpDir, n1.getId().toString());
        }
        m_fileAnticipator.tempFile(nodeDir, "data" + m_rrdFileExtension);

        // RRD Directory for n2
        if (storeByForeignSource) {
            nodeDir = m_fileAnticipator.tempDir(foreignSourceDir, n2.getForeignId());
        } else {
            nodeDir = m_fileAnticipator.tempDir(snmpDir, n2.getId().toString());
        }
        m_fileAnticipator.tempFile(nodeDir, "data" + m_rrdFileExtension);

        // RRD Directory for an orphan node
        if (storeByForeignSource) {
            nodeDir = m_fileAnticipator.tempDir(foreignSourceDir, "orphan_node");
        } else {
            nodeDir = m_fileAnticipator.tempDir(snmpDir, "100");
        }
        m_fileAnticipator.tempFile(nodeDir, "data" + m_rrdFileExtension);

        // Response Time RRD Directory for n1
        File ipDir = m_fileAnticipator.tempDir(responseDir, n1.getIpInterfaces().iterator().next().getIpAddress().getHostAddress());
        m_fileAnticipator.tempFile(ipDir, "icmp" + m_rrdFileExtension);

        walkin(m_fileAnticipator.getTempDir());
        m_resourceDao.afterPropertiesSet();

        List<OnmsResource> resources = m_resourceDao.findTopLevelResources();
        Assert.assertNotNull(resources);
        Collections.sort(resources);
        Assert.assertEquals(2, resources.size());

        // Node 1
        List<OnmsResource> children = resources.get(0).getChildResources();
        Collections.sort(children, Comparator.comparing(OnmsResource::getName));
        Assert.assertEquals(2, children.size());
        Assert.assertEquals("node[Junit:node1].nodeSnmp[]", children.get(0).getId().toString());
        Assert.assertEquals("node[Junit:node1].responseTime[10.0.0.1]", children.get(1).getId().toString());

        // Node 2
        children = resources.get(1).getChildResources();
        Collections.sort(children, Comparator.comparing(OnmsResource::getName));
        Assert.assertEquals(1, children.size());
        Assert.assertEquals("node[Junit:node2].nodeSnmp[]", children.get(0).getId().toString());

        verify(m_nodeDao, times(1)).findAll();
        verify(m_resourceTypesDao, times(1)).getResourceTypes();
        verify(m_resourceTypesDao, times(6)).getLastUpdate();
    }

    @Test
    public void testFindTopLevelResources_hybridNodesWithoutStoreByForeignSource() throws Exception {
        execute_testFindTopLevelResources_hybridNodes(false);
    }

    @Test
    public void testGetTopLevelResources_hybridNodesWithStoreByForeignSource() throws Exception {
        execute_testFindTopLevelResources_hybridNodes(true);
    }

    /*
     * On hybrid environments where some nodes have been discovered and other nodes are part of a requisition,
     * the top level resources are always going to be built using NodeResourceType only if storeByForeignSource
     * is disabled.
     * But, if storeByForeignSource is enabled, the resources associated with discovered nodes are going to be
     * built by NodeResourceType, and the resources associated with requisitioned nodes are going to be built by
     * NodeSourceResourceType.
     */
    private void execute_testFindTopLevelResources_hybridNodes(boolean storeByForeignSource) throws Exception {
        setStoreByForeignSource(storeByForeignSource);
        final String foreignSource = "Junit";
        final List<OnmsNode> nodes = new ArrayList<>();

        OnmsNode n1 = createNode(1, "node1", null, null, "10.0.0.1"); // Discovered node on the DB with RRD Data
        nodes.add(n1);
        OnmsNode n2 = createNode(2, "node2", foreignSource, "node2", "10.0.0.2"); // Requisitioned node on the DB with RRD Data
        nodes.add(n2);
        OnmsNode n3 = createNode(3, "node3", null, null, "10.0.0.3"); // Discovered node on the DB with No RRD Data
        nodes.add(n3);
        OnmsNode n4 = createNode(4, "node4", foreignSource, "node4", "10.0.0.4"); // Requisitioned node on the DB with RRD Data
        nodes.add(n4);

        when(m_resourceTypesDao.getLastUpdate()).thenReturn(new Date(System.currentTimeMillis()));
        when(m_resourceTypesDao.getResourceTypes()).thenReturn(new HashMap<String, ResourceType>());
        when(m_nodeDao.findAll()).thenReturn(nodes);

        // Common directories
        File snmpDir = m_fileAnticipator.tempDir(ResourceTypeUtils.SNMP_DIRECTORY);
        File responseDir = m_fileAnticipator.tempDir(ResourceTypeUtils.RESPONSE_DIRECTORY);
        File featureDir = m_fileAnticipator.tempDir(snmpDir, ResourceTypeUtils.FOREIGN_SOURCE_DIRECTORY);
        File fsDir = m_fileAnticipator.tempDir(featureDir, foreignSource);

        // RRD Directory for n1
        File node1Dir = m_fileAnticipator.tempDir(snmpDir, n1.getId().toString());
        m_fileAnticipator.tempFile(node1Dir, "data" + m_rrdFileExtension);

        // RRD Directory for n2
        File node2Dir = null;
        if (storeByForeignSource) {
            node2Dir = m_fileAnticipator.tempDir(fsDir, n2.getForeignId());
        } else {
            node2Dir = m_fileAnticipator.tempDir(snmpDir, n2.getId().toString());
        }
        m_fileAnticipator.tempFile(node2Dir, "data" + m_rrdFileExtension);

        // RRD Directory for an orphan discovered node
        m_fileAnticipator.tempFile(m_fileAnticipator.tempDir(snmpDir, "100"), "data" + m_rrdFileExtension);

        // RRD Directory for an orphan requisitioned node
        File orphanDir = null;
        if (storeByForeignSource) {
            orphanDir = m_fileAnticipator.tempDir(fsDir, "orphan_node");
        } else {
            orphanDir = m_fileAnticipator.tempDir(snmpDir, "101");
        }
        m_fileAnticipator.tempFile(orphanDir, "data" + m_rrdFileExtension);

        // Response Time RRD Directory for n1
        File ip1Dir = m_fileAnticipator.tempDir(responseDir, n1.getIpInterfaces().iterator().next().getIpAddress().getHostAddress());
        m_fileAnticipator.tempFile(ip1Dir, "icmp" + m_rrdFileExtension);

        // Response Time RRD Directory for n2
        File ip2Dir = m_fileAnticipator.tempDir(responseDir, n2.getIpInterfaces().iterator().next().getIpAddress().getHostAddress());
        m_fileAnticipator.tempFile(ip2Dir, "icmp" + m_rrdFileExtension);

        m_resourceDao.afterPropertiesSet();

        List<OnmsResource> resources = m_resourceDao.findTopLevelResources();
        Assert.assertNotNull(resources);
        Collections.sort(resources);
        Assert.assertEquals(2, resources.size());

        OnmsResource r1 = resources.get(0); // parent resource for the discovered node
        Assert.assertEquals("node[1]", r1.getId().toString());
        List<OnmsResource> children2 = r1.getChildResources();
        Collections.sort(children2, Comparator.comparing(OnmsResource::getName));
        Assert.assertEquals(2, children2.size());
        Assert.assertEquals("node[1].nodeSnmp[]", children2.get(0).getId().toString());
        Assert.assertEquals("node[1].responseTime[10.0.0.1]", children2.get(1).getId().toString());

        OnmsResource r2 = resources.get(1); // parent resource for the provisioned node 
        List<OnmsResource> children1 = r2.getChildResources();
        Collections.sort(children1, Comparator.comparing(OnmsResource::getName));
        Assert.assertEquals("node[Junit:node2]", r2.getId().toString());
        Assert.assertEquals("node[Junit:node2].nodeSnmp[]", children1.get(0).getId().toString());
        Assert.assertEquals("node[Junit:node2].responseTime[10.0.0.2]", children1.get(1).getId().toString());

        verify(m_nodeDao, times(1)).findAll();
        verify(m_resourceTypesDao, times(1)).getResourceTypes();
        verify(m_resourceTypesDao, times(7)).getLastUpdate();
    }

    private OnmsNode createNode(int nodeId, String nodelabel, String foreignSource, String foreignId, String ipAddress) {
        OnmsNode n = new OnmsNode();
        n.setId(nodeId);
        n.setLabel(nodelabel);
        if (foreignSource != null) {
            n.setForeignSource(foreignSource);
        }
        if (foreignId != null) {
            n.setForeignId(foreignId);
        }
        OnmsIpInterface ip = new OnmsIpInterface();
        ip.setId(10 + nodeId);
        ip.setIpAddress(InetAddressUtils.addr(ipAddress));
        ip.setNode(n);
        n.addIpInterface(ip);
        return n;
    }
    
    public void walkin(File dir) {
        File listFile[] = dir.listFiles();
        if (listFile != null) {
            for (int i=0; i<listFile.length; i++) {
                if (listFile[i].isDirectory()) {
                  walkin(listFile[i]);
                } else {
                    System.out.println(listFile[i]);
                }
            }
        }
    }
}
