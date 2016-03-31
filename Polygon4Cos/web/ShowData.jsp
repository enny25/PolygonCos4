<%-- 
    Document   : ShowData
    Created on : Feb 26, 2016, 8:50:50 AM
    Author     : Minerva
--%>

<%@page import="java.util.List"%>
<%@page import="domain.Player"%>
<%@page import="domain.Team"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Players</title>
    </head>
    <body>
        <h1>Players</h1>
        <table>
            <tr>
            <th>Name</th>
            <th>Position</th>
            <th>Number</th>
            <th>Team</th>
            </tr>
      <%
	List<Player> players = (List<Player>) request.getAttribute("players");
        
        for (int i =0; i < players.size(); i ++ ){
            
        

        %>
    <tr>
    <td><%= players.get(i).getName()%><td>
    <td><%= players.get(i).getPosition()%></td>
    <td><%= players.get(i).getNumber()%></td>
    <td><%=players.get(i).getTeam().getTeamName()%></td>
    </tr>
 <%} //end of for loop%>
        </table>
    </body>
</html>
