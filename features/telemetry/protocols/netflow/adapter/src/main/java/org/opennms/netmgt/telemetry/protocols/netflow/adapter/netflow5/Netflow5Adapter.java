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
package org.opennms.netmgt.telemetry.protocols.netflow.adapter.netflow5;

import org.opennms.netmgt.flows.processing.Pipeline;
import org.opennms.netmgt.telemetry.config.api.AdapterDefinition;
import org.opennms.netmgt.telemetry.protocols.netflow.adapter.common.NetflowAdapter;

import com.codahale.metrics.MetricRegistry;

public class Netflow5Adapter extends NetflowAdapter {

    public Netflow5Adapter(final AdapterDefinition adapterConfig,
                           final MetricRegistry metricRegistry,
                           final Pipeline pipeline) {
        super(adapterConfig, metricRegistry, pipeline);
    }

}
