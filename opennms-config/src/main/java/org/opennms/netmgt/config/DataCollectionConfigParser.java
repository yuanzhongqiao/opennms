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
package org.opennms.netmgt.config;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.opennms.core.xml.JaxbUtils;
import org.opennms.netmgt.config.datacollection.DatacollectionGroup;
import org.opennms.netmgt.config.datacollection.Group;
import org.opennms.netmgt.config.datacollection.Groups;
import org.opennms.netmgt.config.datacollection.IncludeCollection;
import org.opennms.netmgt.config.datacollection.SnmpCollection;
import org.opennms.netmgt.config.datacollection.SystemDef;
import org.opennms.netmgt.config.datacollection.Systems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.dao.DataAccessResourceFailureException;

/**
 * DataCollectionConfigParser
 * 
 * @author <a href="mail:agalue@opennms.org">Alejandro Galue</a>
 */
// FIXME How to deal with duplications outside snmp-collection boundaries? That make sense?; for example: check externalGroupsMap?
// FIXME What are the real ways to validate if two elements are the same? Just the element name? additional parameters?
// FIXME How to apply rules about duplicates? Just warn?, Override?, Override with priorities? Silent ignore?
public class DataCollectionConfigParser {
    private static final Logger LOG = LoggerFactory.getLogger(DataCollectionConfigParser.class);
    
    private String configDirectory;
    
    private final Map<String,DatacollectionGroup> externalGroupsMap;
    
    public DataCollectionConfigParser(String configDirectory) {
        this.configDirectory = configDirectory;
        this.externalGroupsMap = new ConcurrentHashMap<String, DatacollectionGroup>();
    }
    
    protected Map<String,DatacollectionGroup> loadExternalGroupMap() {
        parseExternalResources();
        return externalGroupsMap;
    }
    
    /**
     * Update/Validate SNMP collection.
     * 
     * @param collection
     */
    public void parseCollection(SnmpCollection collection) {
        if (collection.getIncludeCollections().size() > 0) {
            checkCollection(collection);
            // Add systemDefs and dependencies
            for (IncludeCollection include : collection.getIncludeCollections()) {
                if (include.getDataCollectionGroup() != null) {
                    // Include All system definitions from a specific datacollection group
                    addDatacollectionGroup(collection, include.getDataCollectionGroup(), include.getExcludeFilters());
                } else {
                    if (include.getSystemDef() == null) {
                        throwException("You must specify at least the data collection group name or system definition name for the include-collection attribute", null);
                    } else {
                        // Include One system definition
                        SystemDef systemDef = getSystemDef(include.getSystemDef());
                        if (systemDef == null) {
                            throwException("Can't find system definition " + include.getSystemDef(), null);
                        }
                        addSystemDef(collection, systemDef, null);
                    }
                }
            }
        } else {
            LOG.info("parse: SNMP collection {} doesn't have any external reference.", collection.getName());
        }
    }

    /**
     * Verify the sub-groups of SNMP collection.
     * 
     * @param collection
     */
    private void checkCollection(SnmpCollection collection) {
        if (collection.getSystems() == null)
            collection.setSystems(new Systems());
        if (collection.getGroups() == null)
            collection.setGroups(new Groups());
    }

    /**
     * Verify if the groups list contains a specific group.
     * <p>One group will be considered the same as another one, if they have the same name.</p>
     * 
     * @param globalContainer
     * @param group
     * @return true, if the list contains the mib object group
     */
    private boolean contains(Collection<Group> groups, Group group) {
        for (Group g : groups) {
            if (group.getName().equals(g.getName()))
                return true;
        }
        return false;
    }
    
    /**
     * Verify if the systemDefs list contains a specific system definition.
     * <p>One system definition will be considered the same as another one, if they have the same name.</p>
     * 
     * @param globalContainer
     * @param systemDef
     * 
     * @return true, if the list contains the system definition
     */
    // TODO Include sysoid and sysoidMask on validation process
    private boolean contains(List<SystemDef> systemDefs, SystemDef systemDef) {
        for (SystemDef sd : systemDefs) {
            if (systemDef.getName().equals(sd.getName()))
                return true;
        }
        return false;
    }

    /**
     * Read all XML files from datacollection directory and parse them to create a list of DatacollectionGroup objects.
     */
    protected void parseExternalResources() {
        // Check configuration files repository
        File folder = new File(configDirectory);
        if (!folder.exists() || !folder.isDirectory()) {
            LOG.info("parseExternalResources: directory {} does not exist or is not a folder.", folder);
            return;
        }
        
        // Get external configuration files
        File[] listOfFiles = folder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File file, String name) {
                return name.endsWith(".xml");
            }
        });
        
        // Parse configuration files (populate external groups map)
        final CountDownLatch latch = new CountDownLatch(listOfFiles.length);
        int i = 0;
        for (final File file : listOfFiles) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        LOG.debug("parseExternalResources: parsing {}", file);
                        DatacollectionGroup group = JaxbUtils.unmarshal(DatacollectionGroup.class, new FileSystemResource(file));
                        // Synchronize around the map that holds the results
                        synchronized(externalGroupsMap) {
                            externalGroupsMap.put(group.getName(), group);
                        }
                    } catch (Throwable e) {
                        throwException("Can't parse XML file " + file + "; nested exception: " + e.getMessage(), e);
                    } finally {
                        latch.countDown();
                    }
                }
            }, "DataCollectionConfigParser-Thread-" + i++);
            thread.start();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            throwException("Exception while waiting for XML parsing threads to complete: " + e.getMessage(), e);
        }
    }

    /**
     * Get a system definition from datacollection-group map.
     * 
     * @param systemDefName the systemDef object name.
     * @return the systemDef object.
     */
    private SystemDef getSystemDef(String systemDefName) {
        for (DatacollectionGroup group : externalGroupsMap.values()) {
            for (SystemDef sd : group.getSystemDefs()) {
                if (sd.getName().equals(systemDefName)) {
                    return sd;
                }
            }
        }
        return null;
    }

    /**
     * Get a MIB object group from datacollection-group map.
     * 
     * @param groupName the group name
     * @param dataCollectionGroupName the data collection group name
     * @return the group object
     */
    private Group getMibObjectGroup(String groupName, String dataCollectionGroupName) {
        if (dataCollectionGroupName != null) {
            DatacollectionGroup dataGroup = externalGroupsMap.get(dataCollectionGroupName);
            if (dataGroup != null) {
                for (Group g : dataGroup.getGroups()) {
                    if (g.getName().equals(groupName)) {
                        return g;
                    }
                }
            }
        }
        for (DatacollectionGroup group : externalGroupsMap.values()) {
            for (Group g : group.getGroups()) {
                if (g.getName().equals(groupName)) {
                    return g;
                }
            }
        }
        return null;
    }

    /**
     * Add a specific system definition into a SNMP collection.
     * 
     * @param collection the target SNMP collection object.
     * @param systemDef the system definition object.
     * @Parm dataCollectionGroupName the data collection group name where the systemDef is defined
     */
    private void addSystemDef(SnmpCollection collection, SystemDef systemDef, String dataCollectionGroupName) {
        final String dcGroup = dataCollectionGroupName == null ? "N/A" : dataCollectionGroupName;
        LOG.debug("addSystemDef: merging system defintion {} into snmp-collection {}", systemDef.getName(), collection.getName());
        // Add System Definition to target SNMP collection
        if (contains(collection.getSystems().getSystemDefs(), systemDef)) {
            LOG.warn("addSystemDef: system definition {} from data collection group {} already exist on SNMP collection {}", systemDef.getName(), dcGroup, collection.getName());
        } else {
            LOG.debug("addSystemDef: adding system definition {} from data collection group {} to snmp-collection {}", systemDef.getName(), dcGroup, collection.getName());
            collection.getSystems().addSystemDef(systemDef);
            // Add Groups
            for (String groupName : systemDef.getCollect().getIncludeGroups()) {
                Group group = getMibObjectGroup(groupName, dataCollectionGroupName);
                if (group == null) {
                    LOG.warn("addSystemDef: group {} does not exist on any data collection group", groupName);
                } else {
                    if (contains(collection.getGroups().getGroups(), group)) {
                        LOG.debug("addSystemDef: group {} already exist on SNMP collection {}", groupName, collection.getName());
                    } else {
                        LOG.debug("addSystemDef: adding mib object group {} from data collection group {} to snmp-collection {}", group.getName(), dcGroup, collection.getName());
                        collection.getGroups().addGroup(group);
                    }
                }
            }
        }
    }

    /**
     * Add all system definitions defined on a specific data collection group, into a SNMP collection.
     * 
     * @param collection the target SNMP collection object.
     * @param dataCollectionGroupName the data collection group name.
     * @param excludeList the list of regular expression to exclude certain system definitions.
     */
    private void addDatacollectionGroup(SnmpCollection collection, String dataCollectionGroupName, List<String> excludeList) {
        DatacollectionGroup group = externalGroupsMap.get(dataCollectionGroupName);
        if (group == null) {
            throwException("Group " + dataCollectionGroupName + " does not exist.", null);
        }
        LOG.debug("addDatacollectionGroup: adding all definitions from group {} to snmp-collection {}", group.getName(), collection.getName());
        for (SystemDef systemDef : group.getSystemDefs()) {
            if (shouldAdd(systemDef.getName(), excludeList)) {
                addSystemDef(collection, systemDef, group.getName());
            }
        }
    }

    private boolean shouldAdd(String sysDef, List<String> excludeList) {
        if (excludeList != null) {
            for (String re : excludeList) {
                try {
                    final Pattern p = Pattern.compile(re);
                    final Matcher m = p.matcher(sysDef);
                    if (m.matches()) {
                        LOG.info("addDatacollectionGroup: system definition {} is blacklisted by filter {}", sysDef, re);
                        return false;
                    }
                } catch (PatternSyntaxException e) {
                    LOG.warn("the regular expression {} is invalid: ", re, e);
                }
            }
        }
        return true;
    }

    private void throwException(String msg, Throwable e) {
        if (e == null) {
            LOG.error(msg);
            throw new DataAccessResourceFailureException(msg);
        } else {
            LOG.error(msg, e);
            throw new DataAccessResourceFailureException(msg, e);            
        }
    }
}
