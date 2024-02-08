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
package org.opennms.netmgt.flows.elastic;

import org.opennms.integration.api.v1.flows.Flow;

import com.google.gson.annotations.SerializedName;

public enum SamplingAlgorithm {
    @SerializedName("Unassigned")
    Unassigned,
    @SerializedName("SystematicCountBasedSampling")
    SystematicCountBasedSampling,
    @SerializedName("SystematicTimeBasedSampling")
    SystematicTimeBasedSampling,
    @SerializedName("RandomNoutOfNSampling")
    RandomNoutOfNSampling,
    @SerializedName("UniformProbabilisticSampling")
    UniformProbabilisticSampling,
    @SerializedName("PropertyMatchFiltering")
    PropertyMatchFiltering,
    @SerializedName("HashBasedFiltering")
    HashBasedFiltering,
    @SerializedName("FlowStateDependentIntermediateFlowSelectionProcess")
    FlowStateDependentIntermediateFlowSelectionProcess;

    public static SamplingAlgorithm from(final Flow.SamplingAlgorithm samplingAlgorithm) {
        if (samplingAlgorithm == null) {
            return Unassigned;
        }

        switch (samplingAlgorithm) {
            case Unassigned:
                return Unassigned;
            case SystematicCountBasedSampling:
                return SystematicCountBasedSampling;
            case SystematicTimeBasedSampling:
                return SystematicTimeBasedSampling;
            case RandomNOutOfNSampling:
                return RandomNoutOfNSampling;
            case UniformProbabilisticSampling:
                return UniformProbabilisticSampling;
            case PropertyMatchFiltering:
                return PropertyMatchFiltering;
            case HashBasedFiltering:
                return HashBasedFiltering;
            case FlowStateDependentIntermediateFlowSelectionProcess:
                return FlowStateDependentIntermediateFlowSelectionProcess;
            default:
                throw new IllegalArgumentException("Unknown sampling algorithm: " + samplingAlgorithm.name());
        }
    }
}
