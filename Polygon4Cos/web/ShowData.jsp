<%-- 
    Document   : ShowData
    Created on : Feb 26, 2016, 8:50:50 AM
    Author     : 
--%>

<%@page import="java.util.List"%>
<%@page import="domain.Building"%>
<%@page import="domain.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buildings</title>
    </head>
    <body>
        <h1>Buildings</h1>
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
                <td><%=buildings.get(i).getSize()%></td>
            </tr>
            <%} //end of for loop%>
        </table>
        <h2>Customers</h2>
        <table>
            <tr>
                <th>Name</th>
                <th>Address</th>
                <th>Customer ID</th>
                <th>Sign-up date</th>
            </tr>
             <%
                List<Customer> customers = (List<Customer>) request.getAttribute("customers");

                for (int i = 0; i < customers.size(); i++) {


            %>
            <tr>
                <td><%= customers.get(i).getName()%><td>
                <td><%= customers.get(i).getAddress()%></td>
                <td><%= customers.get(i).getCustomerId()%></td>
                <td><%=customers.get(i).getSignupDate()%></td>
            </tr>
        </table>
    </body>
</html>
