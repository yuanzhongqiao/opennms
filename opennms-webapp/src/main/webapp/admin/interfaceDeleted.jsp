<%--
/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2002-2014 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2014 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

--%>

<%@page language="java"
	contentType="text/html"
	session="true"
	import="
		org.opennms.core.utils.WebSecurityUtils,
		org.opennms.web.servlet.MissingParameterException
	"
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%
	
    String nodeIdString = request.getParameter( "node" );
    String ipAddr = request.getParameter( "intf" );
    String ifIndexString = request.getParameter("ifindex");

    if( nodeIdString == null ) {
        throw new MissingParameterException( "node", new String[] { "node", "intf or ifindex" } );
    }

    if( ipAddr == null && ifIndexString == null ) {
        throw new MissingParameterException( "intf or ifindex", new String[] { "node", "intf or ifindex" } );
    }

    int nodeId = -1;

    try {
        nodeId = WebSecurityUtils.safeParseInt( nodeIdString );
    }
    catch( NumberFormatException e ) {
        //throw new WrongParameterDataTypeException
        throw new ServletException( "Wrong data type, should be integer but got '"+nodeIdString+"'", e );
    }
    
    int ifIndex = -1;
    if (ifIndexString != null && ifIndexString.length() != 0) {
        try {
            ifIndex = WebSecurityUtils.safeParseInt( ifIndexString );
        }
        catch( NumberFormatException e ) {
            //throw new WrongParameterDataTypeException
            throw new ServletException( "Wrong data type, should be integer but got '"+ifIndexString+"'", e );
        }
    }
	
%>

<c:url var="nodeLink" value="element/node.jsp">
  <c:param name="node" value="<%=String.valueOf(nodeId)%>"/>
</c:url>
<c:url var="interfaceLink" value="element/interface.jsp">
  <c:param name="node" value="<%=String.valueOf(nodeId)%>"/>
  <c:param name="intf" value="<%=WebSecurityUtils.sanitizeString(ipAddr)%>"/>
</c:url>

<%@ page import="org.opennms.web.utils.Bootstrap" %>
<% Bootstrap.with(pageContext)
          .headTitle(WebSecurityUtils.sanitizeString(ipAddr))
          .breadcrumb("Search", "element/index.jsp")
          .breadcrumb("Node", "${nodeLink}")
          .breadcrumb("Interface", "${interfaceLink}")
          .breadcrumb("Interface Deleted")
          .build(request);
%>
<jsp:directive.include file="/includes/bootstrap.jsp" />

<div class="card">
  <div class="card-header">
    <% if (ifIndex == -1) { %>
    <span>Finished Deleting Interface <%= WebSecurityUtils.sanitizeString(ipAddr) %></span>
    <% } else if (!"0.0.0.0".equals(ipAddr) && ipAddr != null && ipAddr.length() !=0){ %>
    <span>Finished Deleting Interface <%= WebSecurityUtils.sanitizeString(ipAddr) %> with ifIndex <%= ifIndex %></span>
    <% } else { %>
    <span>Finished Deleting Interface with ifIndex <%= ifIndex %></span>
    <% } %>
  </div>
  <div class="card-body">
    <p>
      OpenNMS should not need to be restarted, but it may take a moment for
      the Categories to be updated.
    </p>
  </div>
</div> <!-- panel -->

<jsp:include page="/includes/bootstrap-footer.jsp" flush="false" />
