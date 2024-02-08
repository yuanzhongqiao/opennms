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
package org.opennms.netmgt.events.api.model;

import java.util.List;

/**
 * A definition corresponding to POJO '{@link org.opennms.netmgt.xml.event.AlarmData}'.
 *
 * The 'has...()' methods exist since the corresponding 'get...()' methods will return a default value if null.
 * Using the 'has...()' method is the only means to determine if the backing value is null.
 */
public interface IAlarmData {
    Integer getAlarmType();
    boolean hasAlarmType();
    Boolean getAutoClean();
    boolean hasAutoClean();
    String getClearKey();
    String getReductionKey();
    String getX733AlarmType();
    Integer getX733ProbableCause();
    boolean hasX733ProbableCause();
    Boolean isAutoClean();
    List<IUpdateField> getUpdateFieldList();
    Boolean hasUpdateFields();
    IManagedObject getManagedObject();
}
