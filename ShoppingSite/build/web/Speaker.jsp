<%-- 
    Document   : Speaker
    Created on : Dec 5, 2013, 10:07:44 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Speaker</title>
    </head>
    <body>
         <%
        Object uname=request.getAttribute("uname");
       %>
       <h1><%=uname%></h1>  
       <div id="leftobj1" style="height: 300px; width: 300px; float:left;">
           <form action="http://localhost:8084/Shopping1/ShopCheck" method=post>
            <input type="hidden" value=<%=uname%> name="uname"/> 
            <input type="hidden" value="speaker" name="cat"/> 
           <input type="image" src="images/Speakerimage1.jpg" name="image" value="images/Speakerimage1.jpg">
           </form>
       </div>
         <div id="leftobj12" style="height: 300px; width: 300px; float:left;">
           <form action="http://localhost:8084/Shopping1/ShopCheck" method=post>
            <input type="hidden" value=<%=uname%> name="uname"/> 
            <input type="hidden" value="speaker" name="cat"/> 
           <input type="image" src="images/Speakerimage2.jpg" name="image" value="images/Speakerimage2.jpg">
           </form>
       </div> 
        <div id="centerobj1" style="height: 300px; width: 300px; float:left;">
           <form action="http://localhost:8084/Shopping1/ShopCheck" method=post>
            <input type="hidden" value=<%=uname%> name="uname"/> 
            <input type="hidden" value="speaker" name="cat"/> 
           <input type="image" src="images/Speakerimage3.jpg" name="image" value="images/Speakerimage3.jpg">
           </form>
       </div>
        <div id="centerobj2" style="height: 300px; width: 300px; float:right;">
           <form action="http://localhost:8084/Shopping1/ShopCheck" method=post>
            <input type="hidden" value=<%=uname%> name="uname"/> 
            <input type="hidden" value="speaker" name="cat"/> 
           <input type="image" src="images/Speakerimage4.jpg" name="image" value="images/Speakerimage4.jpg">
           </form>
           </div>
    </body>
</html>
