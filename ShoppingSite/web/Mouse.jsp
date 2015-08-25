<%-- 
    Document   : Mouse
    Created on : Dec 5, 2013, 10:08:37 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mouse</title>
    </head>
    <body>
         <%
        Object uname=request.getAttribute("uname");
       %>
       <h1><%=uname%></h1>  
       <div id="leftobj1" style="height: 300px; width: 300px; float:left;">
           <form action="http://localhost:8084/Shopping1/ShopCheck" method=post>
            <input type="hidden" value=<%=uname%> name="uname"/> 
            <input type="hidden" value="mouse" name="cat"/> 
           <input type="image" src="images/Mouseimage1.jpg" name="image" value="images/Mouseimage1.jpg">
           </form>
       </div>
         <div id="leftobj12" style="height: 300px; width: 300px; float:left;">
           <form action="http://localhost:8084/Shopping1/ShopCheck" method=post>
            <input type="hidden" value=<%=uname%> name="uname"/> 
            <input type="hidden" value="mouse" name="cat"/> 
           <input type="image" src="images/Mouseimage2.jpg" name="image" value="images/Mouseimage2.jpg">
           </form>
       </div> 
        <div id="centerobj1" style="height: 300px; width: 300px; float:left;">
           <form action="http://localhost:8084/Shopping1/ShopCheck" method=post>
            <input type="hidden" value=<%=uname%> name="uname"/> 
            <input type="hidden" value="mouse" name="cat"/> 
           <input type="image" src="images/Mouseimage3.jpg" name="image" value="images/Mouseimage3.jpg">
           </form>
       </div>
        <div id="centerobj2" style="height: 300px; width: 300px; float:right;">
           <form action="http://localhost:8084/Shopping1/ShopCheck" method=post>
            <input type="hidden" value=<%=uname%> name="uname"/> 
            <input type="hidden" value="mouse" name="cat"/> 
           <input type="image" src="images/Mouseimage4.jpg" name="image" value="images/Mouseimage4.jpg">
           </form>
           </div>
    </body>
</html>
