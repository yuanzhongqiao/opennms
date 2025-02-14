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
package org.opennms.web.rest.v2;

import java.util.Date;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.opennms.core.test.MockLogAppender;
import org.opennms.core.test.OpenNMSJUnit4ClassRunner;
import org.opennms.core.test.db.annotations.JUnitTemporaryDatabase;
import org.opennms.core.test.rest.AbstractSpringJerseyRestTestCase;
import org.opennms.netmgt.dao.DatabasePopulator;
import org.opennms.netmgt.model.NetworkBuilder;
import org.opennms.netmgt.model.OnmsCategory;
import org.opennms.netmgt.model.OnmsEvent;
import org.opennms.netmgt.model.OnmsNode;
import org.opennms.netmgt.model.OnmsNode.NodeType;
import org.opennms.netmgt.model.OnmsServiceType;
import org.opennms.netmgt.model.OnmsSeverity;
import org.opennms.test.JUnitConfigurationEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(OpenNMSJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={
        "classpath:/META-INF/opennms/applicationContext-soa.xml",
        "classpath:/META-INF/opennms/applicationContext-commonConfigs.xml",
        "classpath:/META-INF/opennms/applicationContext-minimal-conf.xml",
        "classpath:/META-INF/opennms/applicationContext-dao.xml",
        "classpath:/META-INF/opennms/applicationContext-mockConfigManager.xml",
        "classpath*:/META-INF/opennms/component-service.xml",
        "classpath*:/META-INF/opennms/component-dao.xml",
        "classpath:/META-INF/opennms/applicationContext-databasePopulator.xml",
        "classpath:/META-INF/opennms/mockEventIpcManager.xml",
        "file:src/main/webapp/WEB-INF/applicationContext-svclayer.xml",
        "file:src/main/webapp/WEB-INF/applicationContext-cxf-common.xml"
})
@JUnitConfigurationEnvironment
@JUnitTemporaryDatabase
@Transactional
public class EventRestServiceIT extends AbstractSpringJerseyRestTestCase {

    public EventRestServiceIT() {
        super(CXF_REST_V2_CONTEXT_PATH);
    }

    @Autowired
    private DatabasePopulator m_databasePopulator;

    @Override
    protected void afterServletStart() throws Exception {
        MockLogAppender.setupLogging(true, "DEBUG");

        final OnmsCategory linux = createCategory("Linux");
        final OnmsCategory macOS = createCategory("macOS");

        final OnmsServiceType icmp = new OnmsServiceType("ICMP");
        m_databasePopulator.getServiceTypeDao().save(icmp);
        m_databasePopulator.getServiceTypeDao().flush();

        final NetworkBuilder builder = new NetworkBuilder();

        final OnmsNode node1 = createNode(builder, "server01", "192.168.1.1", linux);
        final OnmsNode node2 = createNode(builder, "server02", "192.168.1.2", macOS);

        createEvent(node1, "uei.opennms.org/test/somethingWentWrong", OnmsSeverity.MAJOR);
        createEvent(node1, "uei.opennms.org/test/somethingIsStillHappening", OnmsSeverity.WARNING);
        createEvent(node1, "uei.opennms.org/test/somethingIsOkNow", OnmsSeverity.NORMAL);

        createEvent(node2, "uei.opennms.org/test/somethingWentWrong", OnmsSeverity.MAJOR);
        createEvent(node2, "uei.opennms.org/test/somethingIsStillHappening", OnmsSeverity.WARNING);
        createEvent(node2, "uei.opennms.org/test/somethingIsOkNow", OnmsSeverity.NORMAL);
    }

    @Test
    @JUnitTemporaryDatabase
    public void testEvents() throws Exception {
        String url = "/events";

        JSONObject object = new JSONObject(sendRequest(GET, url, 200));
        Assert.assertEquals(6, object.getInt("totalCount"));

        object = new JSONObject(sendRequest(GET, url, parseParamData("_s=node.label==server01"), 200));
        Assert.assertEquals(3, object.getInt("totalCount"));

        object = new JSONObject(sendRequest(GET, url, parseParamData("_s=event.uei==*somethingWentWrong"), 200));
        Assert.assertEquals(2, object.getInt("totalCount"));

        object = new JSONObject(sendRequest(GET, url, parseParamData("_s=category.name==Linux"), 200));
        Assert.assertEquals(3, object.getInt("totalCount"));

        object = new JSONObject(sendRequest(GET, url, parseParamData("_s=category.name==Linux;event.uei==*somethingWentWrong"), 200));
        Assert.assertEquals(1, object.getInt("totalCount"));
    }

    @Test
    @JUnitTemporaryDatabase
    public void testAddEvent() throws Exception {
        String url = "/events";
        String event = "<event><uei>uei.opennms.org/testEvent</uei></event>";
        sendPost(url, event, 204);
    }

    private OnmsNode createNode(final NetworkBuilder builder, final String label, final String ipAddress, final OnmsCategory category) {
        builder.addNode(label).setForeignSource("JUnit").setForeignId(label).setType(NodeType.ACTIVE);
        builder.addCategory(category);
        builder.setBuilding("HQ");
        builder.addSnmpInterface(1)
        .setCollectionEnabled(true)
        .setIfOperStatus(1)
        .setIfSpeed(10000000)
        .setIfName("eth0")
        .setIfType(6)
        .setPhysAddr("C9D2DFC7CB68")
        .addIpInterface(ipAddress).setIsManaged("M").setIsSnmpPrimary("S");
        builder.addService(m_databasePopulator.getServiceTypeDao().findByName("ICMP"));
        final OnmsNode node = builder.getCurrentNode();
        m_databasePopulator.getNodeDao().save(node);
        return node;
    }

    private OnmsCategory createCategory(final String categoryName) {
        final OnmsCategory cat = new OnmsCategory(categoryName);
        m_databasePopulator.getCategoryDao().save(cat);
        m_databasePopulator.getCategoryDao().flush();
        return cat;
    }

    private void createEvent(final OnmsNode node, final String eventUei, final OnmsSeverity severity) {
        final OnmsEvent event = new OnmsEvent();
        event.setDistPoller(m_databasePopulator.getDistPollerDao().whoami());
        event.setEventCreateTime(new Date());
        event.setEventDisplay("Y");
        event.setEventHost("127.0.0.1");
        event.setEventLog("Y");
        event.setEventSeverity(OnmsSeverity.INDETERMINATE.getId());
        event.setEventSource("JUnit");
        event.setEventTime(new Date());
        event.setEventUei(eventUei);
        event.setIpAddr(node.getIpInterfaces().iterator().next().getIpAddress());
        event.setNode(node);
        event.setServiceType(m_databasePopulator.getServiceTypeDao().findByName("ICMP"));
        event.setEventSeverity(severity.getId());
        m_databasePopulator.getEventDao().save(event);
        m_databasePopulator.getEventDao().flush();
    }
}
