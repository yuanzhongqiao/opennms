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
package org.opennms.netmgt.provision.detector;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.net.UnknownHostException;
import java.util.Collections;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.opennms.core.spring.BeanUtils;
import org.opennms.core.test.MockLogAppender;
import org.opennms.core.test.OpenNMSJUnit4ClassRunner;
import org.opennms.core.test.snmp.annotations.JUnitSnmpAgent;
import org.opennms.core.utils.InetAddressUtils;
import org.opennms.netmgt.provision.DetectRequest;
import org.opennms.netmgt.provision.detector.snmp.HostResourceSWRunDetector;
import org.opennms.netmgt.provision.detector.snmp.HostResourceSWRunDetectorFactory;
import org.opennms.test.JUnitConfigurationEnvironment;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@RunWith(OpenNMSJUnit4ClassRunner.class)
@ContextConfiguration(locations={
        "classpath:/META-INF/opennms/applicationContext-soa.xml",
        "classpath:/META-INF/opennms/applicationContext-mockDao.xml",
        "classpath:/META-INF/opennms/applicationContext-proxy-snmp.xml",
        "classpath:/META-INF/opennms/detectors.xml"
})
@JUnitConfigurationEnvironment
@JUnitSnmpAgent(host=HostResourceSWRunDetectorTest.TEST_IP_ADDRESS, resource="classpath:/org/opennms/netmgt/provision/detector/hostResourceSwRunDetectorTestData.properties")
public class HostResourceSWRunDetectorTest implements InitializingBean {
    static final String TEST_IP_ADDRESS = "192.0.2.205";

    @Autowired
    private HostResourceSWRunDetectorFactory m_detectorFactory;
    
    private HostResourceSWRunDetector m_detector;

    private DetectRequest m_request;

    @Override
    public void afterPropertiesSet() throws Exception {
        BeanUtils.assertAutowiring(this);
    }

    @Before
    public void setUp() throws InterruptedException{
        MockLogAppender.setupLogging();
        m_detector = m_detectorFactory.createDetector(new HashMap<>());
        m_detector.setServiceToDetect(null);
        m_detector.setRetries(2);
        m_detector.setTimeout(500);
        m_request = m_detectorFactory.buildRequest(null, InetAddressUtils.addr(TEST_IP_ADDRESS), null, Collections.emptyMap());
    }

    @Test(timeout=20000)

    public void testDetectorFail() throws UnknownHostException{
        assertFalse(m_detector.detect(m_request).isServiceDetected());
    }

    @Test(timeout=20000)
    public void testDetectorSuccess() throws UnknownHostException{
        m_detector.setServiceToDetect("WindowServer");
        assertTrue(m_detector.detect(m_request).isServiceDetected());
    }

    @Test(timeout=20000)
    public void testLackOfCaseSensitivity() throws UnknownHostException{
        m_detector.setServiceToDetect("Omnitek XR.exe");
        assertTrue(m_detector.detect(m_request).isServiceDetected());
    }

    @Test(timeout=20000)
    public void testDetectCronSuccess() throws UnknownHostException{
        m_detector.setServiceToDetect("cron");
        assertTrue(m_detector.detect(m_request).isServiceDetected());
    }

    @Test(timeout=20000)
    public void testDetectRegexSuccess() throws UnknownHostException{
        m_detector.setServiceToDetect("~snmp.*");
        assertTrue(m_detector.detect(m_request).isServiceDetected());
    }
}
