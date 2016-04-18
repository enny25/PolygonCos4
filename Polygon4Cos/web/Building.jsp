<%-- 
    Document   : Building
    Created on : Apr 14, 2016, 1:09:22 PM
    Author     : Diana
--%>

<%@page import="java.util.List"%>
<%@page import="domain.Building"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <th>Name</th>
                <th>Address</th>
                <th>Building ID</th>
                <th>Size</th>
            </tr>
            <%
                List<Building> buildings = (List<Building>) request.getAttribute("buildings");

                for (int i = 0; i < buildings.size(); i++) {


            %>
            <tr>
                <td><%= buildings.get(i).getName()%><td>
                <td><%= buildings.get(i).getAddress()%></td>
                <td><%= buildings.get(i).getBuildingID()%></td>
                <td><%= buildings.get(i).getCustomerID()%></td>
                <td><%=buildings.get(i).getSize()%></td>
            </tr>
            <%} //end of for loop%>
            
        </table>
            <input type="hidden" name="whereTo" value="back" />
    </body>
</html>
