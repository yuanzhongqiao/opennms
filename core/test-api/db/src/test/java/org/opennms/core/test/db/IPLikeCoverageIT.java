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
package org.opennms.core.test.db;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.opennms.core.utils.DBUtils;

public class IPLikeCoverageIT {
    private TemporaryDatabasePostgreSQL m_db;

    @Before
    public void setUp() throws Exception {
        m_db = new TemporaryDatabasePostgreSQL(null, false);
        m_db.setPlpgsqlIplike(true);
        m_db.setPopulateSchema(true);
        m_db.setupDatabase();
    }
    
    @After
    public void tearDown() throws Exception {
        m_db.destroyTestDatabase();
    }

    /*
     * This set of coverage data matches that in https://github.com/OpenNMS/iplike/blob/master/tests.dat
     */
    @Test
    public void testIplikeCoverage() throws Exception {
        // IPv4 basic matches
        checkIplikeRule("1.2.3.4","1.2.3.4",true);
        checkIplikeRule("1.2.3.4","1.2.3.5",false);
        checkIplikeRule("1.2.3.4","1.2.3.*",true);
        checkIplikeRule("1.2.3.4","1.*.3.4",true);
        checkIplikeRule("1.2.3.4","1.*.3.5",false);

        // IPv4 range matches
        checkIplikeRule("192.168.10.11","192.168.10.10-11",true);
        checkIplikeRule("192.168.10.12","192.168.10.10-11",false);
        checkIplikeRule("192.168.223.9","192.168.216-223.*",true);
        checkIplikeRule("192.168.224.9","192.168.216-223.*",false);

        // IPv4 list matches
        checkIplikeRule("192.168.1.9","192.168.0,1,2.*",true);
        checkIplikeRule("192.168.1.9","192.168.1,2,0.*",true);
        checkIplikeRule("192.168.1.9","192.168.2,0,1.*",true);
        checkIplikeRule("192.168.3.9","192.168.0,1,2.*",false);
        checkIplikeRule("192.168.3.9","192.168.1,2,0.*",false);
        checkIplikeRule("192.168.3.9","192.168.2,0,1.*",false);
        checkIplikeRule("192.168.3.9","192.168.*,1,2.*",true);
        checkIplikeRule("192.168.3.9","192.168.0,*,2.*",true);
        checkIplikeRule("192.168.3.9","192.168.0,1,*.*",true);

        // IPv4 list and range in separate octet
        checkIplikeRule("192.168.1.9","192.168.0,1,2.0-20",true);
        checkIplikeRule("192.168.1.21","192.168.0,1,2.0-20",false);

        // IPv4 list and range in same octet
        checkIplikeRule("192.168.1.9","192.168.0,1,2-4.0-20",true);
        checkIplikeRule("192.168.3.9","192.168.0,1,2-4.0-20",true);
        checkIplikeRule("192.168.5.9","192.168.0,1,2-4.0-20",false);
        checkIplikeRule("192.168.1.21","192.168.0,1,2,3-4.0-20",false);
        checkIplikeRule("192.168.0.1","192.168.1-2,5.*",false);

        // IPv6 tests
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd","*:*:*:*:*:*:*:*",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd%4","*:*:*:*:*:*:*:*",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd%4","*:*:*:*:*:*:*:*%4",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd","*:*:*:*:*:*:*:*%4",false);

        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd","fe80:*:*:*:*:*:*:*",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd%45","fe80:*:*:*:*:*:*:*",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd%45","fe80:*:*:*:*:*:*:*%45",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd","fe80:*:*:*:*:*:*:*%45",false);

        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd","*:*:*:0:*:*:*:*",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd%4","*:*:*:0:*:*:*:*",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd%4","*:*:*:0:*:*:*:*%4",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd","*:*:*:0:*:*:*:*%4",false);

        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd","*:*:*:*:*:bbbb:*:*",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd%4","*:*:*:*:*:bbbb:*:*",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd%4","*:*:*:*:*:bbbb:*:*%4",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd%4","*:*:*:*:*:bbbb:*:*%5",false);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd","*:*:*:*:*:bbbb:*:*%4",false);

        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd","*:*:*:*:*:bbb0-bbbf:*:*",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd%4","*:*:*:*:*:bbb0-bbbf:*:*",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd%4","*:*:*:*:*:bbb0-bbbf:*:*%4",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd","*:*:*:*:*:bbb0-bbbf:*:*%4",false);

        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd","fe80:0000:0000:0000:aaaa:bbb0-bbbf:cccc:dddd",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd%4","fe80:0000:0000:0000:aaaa:bbb0-bbbf:cccc:dddd",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd%4","fe80:0000:0000:0000:aaaa:bbb0-bbbf:cccc:dddd%4",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd","fe80:0000:0000:0000:aaaa:bbb0-bbbf:cccc:dddd%4",false);

        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd","fe20,fe70-fe90:0000:0000:0000:*:bbb0,bbb1,bbb2,bbb3,bbb4,bbbb,bbbc:cccc:dddd",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd%4","fe20,fe70-fe90:0000:0000:0000:*:bbb0,bbb1,bbb2,bbb3,bbb4,bbbb,bbbc:cccc:dddd",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd%4","fe20,fe70-fe90:0000:0000:0000:*:bbb0,bbb1,bbb2,bbb3,bbb4,bbbb,bbbc:cccc:dddd%4",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd","fe20,fe70-fe90:0000:0000:0000:*:bbb0,bbb1,bbb2,bbb3,bbb4,bbbb,bbbc:cccc:dddd%4",false);

        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd","fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd%4","fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd%4","fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd%4",true);
        checkIplikeRule("fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd","fe80:0000:0000:0000:aaaa:bbbb:cccc:dddd%4",false);
    }

    private void checkIplikeRule(final String value, final String rule, final boolean expected) throws Exception {
        final DBUtils util = new DBUtils();

        Connection c = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            c = m_db.getDataSource().getConnection();
            util.watch(c);

            st = c.prepareStatement("SELECT iplike(CAST(? AS TEXT),CAST(? AS TEXT))");
            util.watch(st);
            st.setString(1, value);
            st.setString(2, rule);

            st.execute();

            rs = st.getResultSet();
            util.watch(rs);
            rs.next();
            final boolean result = rs.getBoolean(1);
            assertEquals("SELECT iplike(" + value + "," + rule + ") === " + expected, expected, result);
        } finally {
            util.cleanUp();
        }
    }

}
