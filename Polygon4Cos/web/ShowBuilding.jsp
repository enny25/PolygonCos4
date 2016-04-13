<%-- 
    Document   : ShowData
    Created on : Mar 31, 2016, 2:34:02 PM
    Author     : Diana
--%>
<%@page import="java.util.List"%>
<%@page import="domain.Report"%>
<%@page import="domain.ReportConclusion"%>
<%@page import="domain.RoomReport"%>
<%@page import="domain.Building"%>
<%@page import="domain.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Show building</h1>
         <form action="Servlet">
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
            </form>
    </body>
</html>
