<%-- 
    Document   : CreateCustomer
    Created on : Mar 31, 2016, 2:34:02 PM
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
        <h1>Register customer</h1>
        <form action="Servlet">
            <input type="hidden" name="action" value="register" />
            <br>Name:<input type="text" name="name" value="" /><br>
            <br>Password:<input type="password" name="password" value="" /><br>
            <br>Address:<input type="text" name="address" value="" /><br>
            <br>Sign-up date:<input type="date" name="sign-upDate" value="" /><br>
            <br><input type="submit" name="Submit" value="Submit" /><br>
            <br><input type="submit" name="Submit" value="back" />
        </form>
    </body>
</html>
