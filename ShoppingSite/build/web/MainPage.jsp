<%-- 
    Document   : MainPage
    Created on : Dec 5, 2013, 10:09:31 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Page</title>
    </head>
    <body>
         <%
        Object uname=request.getAttribute("uname");
         %>
        <h3><%=uname%></h3></br>  
        <h1><b>Categories</b></h1>
       <div id="leftobj1" style="height: 500px; width: 500px; float: left">
           <form action="http://localhost:8084/Shopping1/Navigate" method=post>
               <input type="image" src="images/Laptop.jpg" name="image">
            <input type="hidden" value=<%=uname%> name="uname"/> 
            <input type="hidden" value="laptop" name="site"/> 
           </form>
       </div>
         <div id="leftobj12" style="height: 500px; width: 500px; float: right">
           <form action="http://localhost:8084/Shopping1/Navigate" method=post>
               <input type="image" src="images/Mouse.jpg" name="image" >
            <input type="hidden" value=<%=uname%> name="uname"/> 
            <input type="hidden" value="mouse" name="site"/> 
           </form>
       </div> 
        <div id="centerobj1" style="height: 500px; width: 500px; float: left">
           <form action="http://localhost:8084/Shopping1/Navigate" method=post>
               <input type="image" src="images/Speaker.jpg" name="image">
            <input type="hidden" value=<%=uname%> name="uname"/> 
            <input type="hidden" value="speaker" name="site"/> 
           </form>
       </div>
    </body>
</html>
