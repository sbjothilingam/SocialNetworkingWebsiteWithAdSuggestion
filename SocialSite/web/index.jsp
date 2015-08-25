<%-- 
    Document   : index
    Created on : 10 Oct, 2013, 2:36:14 PM
    Author     : suresh
--%>
/* Login page for the Social Site- I-Suggestions */
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            body{
                background:url(images/social-networking-sites.jpg);
                }
                h1{
                    text-align: center ;
                    font-size: 50px;
                    color: #0000ff;
                }
               </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Big Data Project</title>
        <h1 >I SUGGESTION</h1>
    </head>
    <body>
        <form action="http://localhost:8084/BigData/LoginServlet" method=post>
            <div id="login" style=" height: 200px ; width: 400px; float: right; border-style: solid;">
            <h3> Username : <input type=text name="uname"><br></h3>
            <h3> Password : <input type=password name="pwd"><br></h3>
        <input type=submit value="Login">
        <a href="UserRegistration.jsp">New User?</a>
            </div>
        </form>
    </body>
</html>
