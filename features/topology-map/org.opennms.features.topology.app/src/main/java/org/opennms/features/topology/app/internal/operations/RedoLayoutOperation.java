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
package org.opennms.features.topology.app.internal.operations;

import java.util.List;

import org.opennms.features.topology.api.GraphContainer;
import org.opennms.features.topology.api.Operation;
import org.opennms.features.topology.api.OperationContext;
import org.opennms.features.topology.api.OperationContext.DisplayLocation;
import org.opennms.features.topology.api.topo.VertexRef;
import org.opennms.features.topology.app.internal.TopologyUI;

public class RedoLayoutOperation implements Operation {

    public void execute(final GraphContainer graphContainer) {
            graphContainer.setDirty(true);
            graphContainer.redoLayout();
            TopologyUI.getCurrent().markAsDirtyRecursive();
    }

    @Override
    public void execute(List<VertexRef> targets, OperationContext operationContext) {
        if (operationContext != null && operationContext.getGraphContainer() != null) {
            execute(operationContext.getGraphContainer());
        }
    }

    @Override
    public boolean display(List<VertexRef> targets, OperationContext operationContext) {
        return (operationContext.getDisplayLocation() == DisplayLocation.MENUBAR)
        		|| (targets != null && targets.size() == 0);
    }

    @Override
    public boolean enabled(List<VertexRef> targets, OperationContext operationContext) {
        return true;
    }

    @Override
    public String getId() {
        return "Refresh";
    }
}
