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
package org.opennms.netmgt.poller.monitors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NoRouteToHostException;
import java.net.Socket;
import java.util.Map;

import org.opennms.core.utils.InetAddressUtils;
import org.opennms.core.utils.ParameterMap;
import org.opennms.core.utils.TimeoutTracker;
import org.opennms.netmgt.poller.MonitoredService;
import org.opennms.netmgt.poller.PollStatus;
import org.opennms.netmgt.poller.support.AbstractServiceMonitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is designed to be used by the service poller framework to test the
 * availability of a generic TCP service on remote interfaces. The class
 * implements the ServiceMonitor interface that allows it to be used along with
 * other plug-ins by the service poller framework.
 *
 * @author Weave
 * @author <A HREF="mailto:tarus@opennms.org">Tarus Balog </A>
 * @author <A HREF="mike@opennms.org">Mike </A>
 * @author <A HREF="http://www.opennms.org/">OpenNMS </A>
 */
final public class TcpMonitor extends AbstractServiceMonitor {

    public static final Logger LOG = LoggerFactory.getLogger(TcpMonitor.class);

    /**
     * Default port.
     */
    private static final int DEFAULT_PORT = -1;

    /**
     * Default retries.
     */
    private static final int DEFAULT_RETRY = 0;

    /**
     * Default timeout. Specifies how long (in milliseconds) to block waiting
     * for data from the monitored interface.
     */
    private static final int DEFAULT_TIMEOUT = 3000; // 3 second timeout on
                                                        // read()

    public static final String PARAMETER_BANNER = "banner";
    public static final String PARAMETER_PORT = "port";

    /**
     * {@inheritDoc}
     *
     * Poll the specified address for service availability.
     *
     * During the poll an attempt is made to connect on the specified port. If
     * the connection request is successful, the banner line generated by the
     * interface is parsed and if the banner text indicates that we are talking
     * to Provided that the interface's response is valid we set the service
     * status to SERVICE_AVAILABLE and return.
     */
    @Override
    public PollStatus poll(MonitoredService svc, Map<String, Object> parameters) {
        //
        // Process parameters
        //

        //
        // Get interface address from NetworkInterface
        //
        TimeoutTracker tracker = new TimeoutTracker(parameters, DEFAULT_RETRY, DEFAULT_TIMEOUT);

        // Port
        //
        int port = ParameterMap.getKeyedInteger(parameters, PARAMETER_PORT, DEFAULT_PORT);
        if (port == DEFAULT_PORT) {
            throw new RuntimeException("TcpMonitor: required parameter 'port' is not present in supplied properties.");
        }

        // BannerMatch
        //
        String strBannerMatch = ParameterMap.getKeyedString(parameters, PARAMETER_BANNER, null);

        // Get the address instance.
        //
        InetAddress ipAddr = svc.getAddress();

        final String hostAddress = InetAddressUtils.str(ipAddr);
	LOG.debug("poll: address = {}, port = {}, {}", hostAddress, port, tracker);

        // Give it a whirl
        //
        PollStatus serviceStatus = PollStatus.unavailable();

        for (tracker.reset(); tracker.shouldRetry() && !serviceStatus.isAvailable(); tracker.nextAttempt()) {
            Socket socket = null;
            try {
                
                tracker.startAttempt();

                socket = new Socket();
                socket.connect(new InetSocketAddress(ipAddr, port), tracker.getConnectionTimeout());
                socket.setSoTimeout(tracker.getSoTimeout());
                LOG.debug("TcpMonitor: connected to host: {} on port: {}", ipAddr, port);

                // We're connected, so upgrade status to unresponsive
                serviceStatus = PollStatus.unresponsive();

                if (strBannerMatch == null || strBannerMatch.length() == 0 || strBannerMatch.equals("*")) {
                    serviceStatus = PollStatus.available(tracker.elapsedTimeInMillis());
                    break;
                }

                BufferedReader rdr = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                //
                // Tokenize the Banner Line, and check the first
                // line for a valid return.
                //
                String response = rdr.readLine();
                double responseTime = tracker.elapsedTimeInMillis();

                if (response == null)
                    continue;
                LOG.debug("poll: banner = {}", response);
                LOG.debug("poll: responseTime= {}ms", responseTime);

                //Could it be a regex?
                if (strBannerMatch.charAt(0)=='~'){
                  if (!response.matches(strBannerMatch.substring(1)))
                    serviceStatus = PollStatus.unavailable("Banner does not match Regex '"+strBannerMatch+"'");
                  else
                    serviceStatus = PollStatus.available(responseTime);
                }
                else {
                  if (response.indexOf(strBannerMatch) > -1) {
                    serviceStatus = PollStatus.available(responseTime);
                  }
                  else {
                    serviceStatus = PollStatus.unavailable("Banner: '"+response+"' does not contain match string '"+strBannerMatch+"'");
                  }
                }

            } catch (NoRouteToHostException e) {
            	String reason = "No route to host exception for address " + hostAddress;
                LOG.debug(reason, e);
                serviceStatus = PollStatus.unavailable(reason);
                break; // Break out of for(;;)
            } catch (InterruptedIOException e) {
            	String reason = "did not connect to host with " + tracker;
                LOG.debug(reason);
                serviceStatus = PollStatus.unavailable(reason);
            } catch (ConnectException e) {
            	String reason = "Connection exception for address: " + ipAddr;
                LOG.debug(reason, e);
                serviceStatus = PollStatus.unavailable(reason);
            } catch (IOException e) {
            	String reason = "IOException while polling address: " + ipAddr;
                LOG.debug(reason, e);
                serviceStatus = PollStatus.unavailable(reason);
            } finally {
                try {
                    // Close the socket
                    if (socket != null)
                        socket.close();
                } catch (IOException e) {
                    e.fillInStackTrace();
                    LOG.debug("poll: Error closing socket.", e);
                }
            }
        }

        //
        // return the status of the service
        //
        return serviceStatus;
    }

}
