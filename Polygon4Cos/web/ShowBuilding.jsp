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
        <h1>Show buildings</h1>
         <form action="Servlet">
             <table border="1" id="Building">
        <thead>
             <tr>
                        <th>Building Id</th>           
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${requestScope.Building}" var = "Building">
                    <tr>
                        <td>${Building.buildingID}</td>     
                    </tr>
                    </c:forEach>
                </tbody>
             </table>
                    <br><input type="submit" name="Submit" value="back" />
            </form>
    </body>
</html>
