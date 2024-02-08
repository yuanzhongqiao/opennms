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
package org.opennms.netmgt.config.poller.outages;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized.Parameters;
import org.opennms.core.test.xml.XmlTestNoCastor;

public class InterfaceTest extends XmlTestNoCastor<Interface> {

    public InterfaceTest(final Interface sampleObject, final String sampleXml, final String schemaFile) {
        super(sampleObject, sampleXml, schemaFile);
    }
    
    @Parameters
    public static Collection<Object[]> data() throws ParseException {
        final Interface intf1 = new Interface();
        intf1.setAddress("100.10.0.1");
        final Interface intf2 = new Interface();
        intf2.setAddress("2001:100::1");
        final Interface intf3 = new Interface();
        intf3.setAddress("match-any");
        
        return Arrays.asList(new Object[][] {
            {
                intf1,
                "<interface address='100.10.0.1'/>\n",
                "target/classes/xsds/poll-outages.xsd"
            },
            {
                intf2,
                "<interface address='2001:100::1'/>\n",
                "target/classes/xsds/poll-outages.xsd"
            },
            {
                intf3,
                "<interface address='match-any'/>\n",
                "target/classes/xsds/poll-outages.xsd"
            }
        });
    }

}
