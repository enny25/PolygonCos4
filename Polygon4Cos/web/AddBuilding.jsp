<%-- 
    Document   : AddBuilding
    Created on : Feb 25, 2016, 10:06:21 AM
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Building</h1>
        <form action="Servlet">
            <input type="hidden" name="action" onsubmit="return validateBuildingName()" value="addBuilding" />
            <br>Building Name:<input type="text" name="name" value="" /><br>
            <br>Building Address:<input type="text" name="address" value="" /><br>
            <br>Customer ID:<input type="text" name="customerID" value="" /><br>
            <br>Building Size (m2):<input type="text" name="size" value="" /><br>
            <br><input type="submit" name="Submit" value="Submit" /><br>
            <br><input type="submit" name="Submit" value="back" />
        </form>
        
        <!--<h1>Add Match</h1>
        <form action="Servlet">
            <input type="hidden" name="action" value="addMatch" />
            Team 1 Name:<input type="text" name="team1" value="" /><br>
            Team 2 Name:<input type="text" name="team2" value="" /><br>
            <input type="submit" name="Submit" value="Submit" /><br>
        </form>
        
        <h1>Add Goal</h1>
        <form action="Servlet">
            <input type="hidden" name="action" value="addGoal" />
            Player Name:<input type="text" name="pname" value="" /><br>
            Match id:<input type="text" name="match_id" value="" /><br>
            <input type="submit" name="Submit" value="Submit" /><br>
        </form>-->
        
    </body>
</html>
