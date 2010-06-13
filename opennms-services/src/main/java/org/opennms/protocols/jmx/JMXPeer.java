//
// This file is part of the OpenNMS(R) Application.
//
// OpenNMS(R) is Copyright (C) 2006 The OpenNMS Group, Inc.  All rights reserved.
// OpenNMS(R) is a derivative work, containing both original code, included code and modified
// code that was published under the GNU General Public License. Copyrights for modified
// and included code are below.
//
// OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
//
// Original code base Copyright (C) 1999-2001 Oculan Corp.  All rights reserved.
//
// This program is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
//
// For more information contact:
//      OpenNMS Licensing       <license@opennms.org>
//      http://www.opennms.org/
//      http://www.opennms.com/
//
/*
 * Created on Mar 3, 2005
 *
 */
package org.opennms.protocols.jmx;

import java.net.InetAddress;

public class JMXPeer extends Object implements Cloneable {
    /**
     * The internet address of the peer
     */
    private InetAddress m_peer; // the remote agent

    /**
     * The remote port of the agent. By default this is usually 161, but it can
     * change.
     */
    private int m_port; // the remote port

    /**
     * The local port of the agent. By default this is usually 0 when acting as
     * manager, 161 as agent
     */
    private int m_serverport = 0; // the local server port

    /**
     * The number of time to resend the datagram to the host.
     */
    private int m_retries; // # of retries

    /**
     * The length of time to wait on the remote agent to respond. The time is
     * measured in milliseconds (1/1000th of a second).
     */
    private int m_timeout; // in milliseconds

    /**
     * The default remote port. On most systems this is port 161, the default
     * trap receiver is on port 162.
     */
    public static final int defaultRemotePort = 9004;

    /**
     * The library default for the number of retries.
     */
    public static final int defaultRetries = 3;

    /**
     * The library default for the number of milliseconds to wait for a reply
     * from the remote agent.
     */
    public static final int defaultTimeout = 8000; // .8 seconds

    /**
     * Class constructor. Constructs a JMXPeer to the passed remote agent.
     * 
     * @param peer
     *            The remote internet address
     */
    public JMXPeer(InetAddress peer) {
        m_peer = peer;
        m_port = defaultRemotePort;
        m_timeout = defaultTimeout;
        m_retries = defaultRetries;
    }

    /**
     * Class constructor. Constructs a peer object with the specified internet
     * address and port.
     * 
     * @param peer
     *            The remote agent address
     * @param port
     *            The port on the remote
     * 
     */
    public JMXPeer(InetAddress peer, int port) {
        this(peer);
        m_port = port;
    }

    /**
     * Class copy constructor. Constructs a JMXPeer object that is identical to
     * the passed JMXPeer object.
     * 
     * @param second
     *            The peer object to copy.
     * 
     */
    public JMXPeer(JMXPeer second) {
        m_peer = second.m_peer;
        m_port = second.m_port;
        m_timeout = second.m_timeout;
        m_retries = second.m_retries;
    }

    /**
     * Returns the peer agent's internet address to the caller
     * 
     * @return The peer's internet address
     * 
     */
    public InetAddress getPeer() {
        return m_peer;
    }

    /**
     * Used to set the peer's internet address for the remote agent.
     * 
     * @param addr
     *            The remote agents internet address
     * 
     */
    public void setPeer(InetAddress addr) {
        m_peer = addr;
    }

    /**
     * Used to set the peer's internet address and port for communications.
     * 
     * @param addr
     *            The remote agent's internet address
     * @param port
     *            The remote agent's port
     * 
     */
    public void setPeer(InetAddress addr, int port) {
        m_peer = addr;
        m_port = port;
    }

    /**
     * Returns the remote agent's port for communications
     * 
     * @return The remote agent's port
     */
    public int getPort() {
        return m_port;
    }

    /**
     * Used to set the remote communication port
     * 
     * @param port
     *            The remote communication port
     * 
     */
    public void setPort(int port) {
        m_port = port;
    }

    /**
     * Returns the local agent's port for communications
     * 
     * @return The local agent's port
     */
    public int getServerPort() {
        return m_serverport;
    }

    /**
     * Used to set the local communication port
     * 
     * @param port
     *            The local communication port
     * 
     */
    public void setServerPort(int port) {
        m_serverport = port;
    }

    /**
     * Returns the currently set number of retries defined by this peer
     * 
     * @return The currently configured number of retries.
     */
    public int getRetries() {
        return m_retries;
    }

    /**
     * Used to set the default number of retries for this peer agent.
     * 
     * @param retry
     *            The new number of retries for the peer
     * 
     */
    public void setRetries(int retry) {
        m_retries = retry;
    }

    /**
     * Retreives the currently configured timeout for the remote agent in
     * milliseconds (1/1000th second).
     * 
     * @return The timeout value in milliseconds.
     * 
     */
    public int getTimeout() {
        return m_timeout;
    }

    /**
     * Sets the millisecond timeout for the communications with the remote
     * agent.
     * 
     * @param timeout
     *            The timeout in milliseconds
     * 
     */
    public void setTimeout(int timeout) {
        m_timeout = timeout;
    }

    /**
     * Used to get a newly created copy of the current object.
     * 
     * @return A duplicate peer object.
     * 
     */
    @Override
    public Object clone() {
        return new JMXPeer(this);
    }
}
