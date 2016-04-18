<%-- 
    Document   : EditBuilding
    Created on : Apr 14, 2016, 12:57:59 PM
    Author     : Diana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Edit Building</h1>
        <form action="Servlet">
            <input type="hidden" name="action" value="addBuilding" />
            <br>Building Name:<input type="text" name="name" value="" /><br>
            <br>Building Address:<input type="text" name="address" value="" /><br>
            <br>Customer ID:<input type="text" name="customerID" value="" /><br>
            <br>Building Size (m2):<input type="text" name="size" value="" /><br>
            <br><input type="submit" name="Submit" value="Submit" /><br>
            <br><input type="submit" name="Submit" value="back" />
        </form>
    </body>
</html>
