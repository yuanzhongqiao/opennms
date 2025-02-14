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
package org.opennms.netmgt.telemetry.protocols.bmp.adapter.stats;

import static org.junit.Assert.assertThat;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Test;

public class RouteInfoClientTest {


    @Test
    public void testRouteInfoClient() throws URISyntaxException {
        URL resourceURL = getClass().getResource("/routeinfo/bmp-test.db");
        RouteInfoClient routeInfoClient = new RouteInfoClient(resourceURL.getPath());
        List<RouteInfo> routeInfoList = routeInfoClient.parseEachFile(Paths.get(resourceURL.toURI()));
        assertThat(routeInfoList, Matchers.hasSize(2705));
    }
}
