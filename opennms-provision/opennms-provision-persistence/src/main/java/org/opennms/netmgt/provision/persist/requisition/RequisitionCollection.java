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
package org.opennms.netmgt.provision.persist.requisition;

import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;
import org.opennms.core.config.api.JaxbListWrapper;
import org.opennms.core.xml.ValidateUsing;

@XmlRootElement(name="requisitions")
@JsonRootName("requisitions")
@ValidateUsing("model-import.xsd")
public class RequisitionCollection extends JaxbListWrapper<Requisition> {
    private static final long serialVersionUID = 1L;

    public RequisitionCollection() { super(); }
    public RequisitionCollection(final Collection<? extends Requisition> requisitions) {
        super(requisitions);
    }

    @XmlElement(name="model-import")
    @JsonProperty("model-import")
    public List<Requisition> getObjects() {
        return super.getObjects();
    }
}
