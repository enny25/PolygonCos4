<%-- 
    Document   : Login
    Created on : Apr 13, 2016, 1:19:59 PM
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
        <h1>Login</h1>
        <form action="Servlet">
            <input type="hidden" name="action" value="createCustomer" />
            <br>Name:<input type="text" name="name" value="" /><br>
            <br>Password:<input type="password" name="password" value="" /><br>
            <br><input type="submit" name="Submit" value="Submit" /><br>
        </form>
    </body>
</html>
