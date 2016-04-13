<%-- 
    Document   : addORshow
    Created on : Apr 13, 2016, 1:28:50 PM
    Author     : Diana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            ul {
                list-style-type: none;                
                margin: 0;
                padding: 0;
                overflow: hidden;
                border: 1px solid lightblue;
                background-color: lightblue;
            }

            li {
                float: left;
            }

            li a {
                display: block;
                color: black;
                text-align: center;
                padding: 14px;
                text-decoration: none;
            }

            li a:hover:not(.header) {
                background-color: gray;
            }


            /*            li a.active {
                            color: white;
                            background-color: #4CAF50;
                        }*/


        </style>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>

        <h1>Polygon</h1>
        <ul>
            <li><a href="ShowBuilding.jsp">show building</a></li>
            <li><a href="AddBuilding.jsp">add building</a></li>
        </ul>
