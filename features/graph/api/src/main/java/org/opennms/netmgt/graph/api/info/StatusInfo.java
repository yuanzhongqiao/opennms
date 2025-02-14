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
package org.opennms.netmgt.graph.api.info;

import static com.google.common.base.Preconditions.checkArgument;

import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;

import org.opennms.netmgt.model.OnmsSeverity;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

/**
 * Immutable object to store the status of a vertex/edge.
 */
public class StatusInfo {

    interface Properties {
        String Severity = "severity";
        String Count = "count";
    }

    private final ImmutableMap<String, Object> properties;

    public StatusInfo(final StatusInfoBuilder builder) {
        this.properties = ImmutableMap.copyOf(builder.properties);
    }

    public Severity getSeverity() {
        return getProperty(Properties.Severity);
    }

    public Long getCount() {
        return getProperty(Properties.Count);
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public <T> T getProperty(String name) {
        Objects.requireNonNull(name);
        return (T) properties.get(name);
    }

    public static StatusInfoBuilder defaultStatus() {
        return StatusInfo.builder(Severity.Normal);
    }

    public static StatusInfoBuilder builder(final Severity severity) {
        Objects.requireNonNull(severity);
        return new StatusInfoBuilder().severity(severity).count(0);
    }

    public static StatusInfoBuilder builder(final OnmsSeverity severity) {
        Objects.requireNonNull(severity);
        return builder(Severity.createFrom(severity));
    }

    public static StatusInfoBuilder from(final StatusInfo status) {
        return new StatusInfoBuilder().properties(status.getProperties());
    }

    public static final class StatusInfoBuilder {
        private final Map<String, Object> properties = Maps.newHashMap();

        private StatusInfoBuilder() {

        }

        public StatusInfoBuilder severity(OnmsSeverity severity) {
            severity(Severity.createFrom(severity));
            return this;
        }

        public StatusInfoBuilder severity(Severity severity) {
            property(Properties.Severity, severity);
            return this;
        }

        public StatusInfoBuilder count(long count) {
            checkArgument(count >= 0, "count must be >= 0");
            property(Properties.Count, count);
            return this;
        }

        public <T> StatusInfoBuilder property(String name, T value) {
            Objects.requireNonNull(name);
            Objects.requireNonNull(value);
            properties.put(name, value);
            return this;
        }

        public StatusInfoBuilder properties(Map<String, Object> properties) {
            Objects.requireNonNull(properties);
            if (!properties.containsKey("severity")) {
                throw new IllegalArgumentException("Severity must be set");
            }
            this.properties.putAll(properties);
            return this;
        }

        public <T> T getProperty(String name) {
            Objects.requireNonNull(name);
            return (T) properties.get(name);
        }

        public StatusInfo build() {
            return new StatusInfo(this);
        }

        public Severity getSeverity() {
            return getProperty(Properties.Severity);
        }

        public Long getCount() {
            final Object value = getProperty(Properties.Count);
            if (value != null) {
                return (Long) value;
            }
            return 0L;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatusInfo that = (StatusInfo) o;
        return Objects.equals(properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", StatusInfo.class.getSimpleName() + "[", "]")
                .add("severity=" + getSeverity())
                .add("count=" + getCount())
                .toString();
    }
}
