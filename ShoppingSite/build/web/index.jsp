<%-- 
    Document   : index
    Created on : 7 Nov, 2013, 9:52:00 PM
    Author     : suresh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
        <style>
            body{
                
                background:url(images/ecom.jpg);
            }
            h1{
                text-align: center;
                font-size: 80px;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Laptop Shopping</title>
    <h1>Laptop Shopping Site</h1>
    </head>
    <body>
        <form action="http://localhost:8084/Shopping1/LoginCheck" method=post>
            <div id="isuccess" style=" height: 200px ; width: 400px; float: right; border-style: solid;
                 background:url(images/isuccess.jpg)">
            <h2>I Suggestion Login</h2>
            <h3><b> UserId : <input type=text name="uname"><br></h3>
            <input type=submit value="Login">
            </div>
    </body>
</html>
