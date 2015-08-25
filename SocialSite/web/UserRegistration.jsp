<%-- 
    Document   : UserRegistration
    Created on : 10 Oct, 2013, 7:37:35 PM
    Author     : suresh
--%>
/*User registration Page for new users */
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
        body{
             background:url(images/social-networking-sites.jpg);
             }
             h1{
                 color: #0000ff;
                 font-size: 60px;
             }
       </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    <h1 align="center">Rgistration Page</h1>
    </head>
    <body>
        <form action="http://localhost:8084/BigData/Registration" method=post>
            <div id="reg" style="text-align: center; font-size: 20px; font-style: oblique;">
        First Name          :<input type="text" name="fname"><br>
        Last Name           :<input type="text" name="lname"><br>
        Date of Birth       :<input type="date" name="dob"><br>
        Email               :<input type="text" name="email"><br>
        Phone no            :<input type="text" name="pno"><br>
        Choose a Username   :<input type="text" name="uname"><br>
        Password            :<input type="password" name="pswrd"><br>
        Re-enter Password   :<input type="password" name="repswrd"><br>
        Your Likes          :<input type="text" name="likes"><br>
        <input type=submit value="Submit">
            </div>
        
    </body>
</html>
