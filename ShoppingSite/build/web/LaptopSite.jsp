

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Laptop</title>
    </head>
    <body>
        <%
        Object uname=request.getAttribute("uname");
       %>
       <h1><%=uname%></h1>  
       <div id="leftobj1" style="height: 200px; width: 200px; float:left;">
           <form action="http://localhost:8084/Shopping1/ShopCheck" method=post>
            <input type="hidden" value=<%=uname%> name="uname"/> 
            <input type="hidden" value="laptop" name="cat"/> 
           <input type="image" src="images/image1.jpg" name="image" value="images/image1.jpg">
           </form>
       </div>
         <div id="leftobj12" style="height: 200px; width: 200px; float:left;">
           <form action="http://localhost:8084/Shopping1/ShopCheck" method=post>
            <input type="hidden" value=<%=uname%> name="uname"/> 
            <input type="hidden" value="laptop" name="cat"/> 
           <input type="image" src="images/image2.jpg" name="image" value="images/image2.jpg">
           </form>
       </div> 
        <div id="centerobj1" style="height: 200px; width: 200px; float:left;">
           <form action="http://localhost:8084/Shopping1/ShopCheck" method=post>
            <input type="hidden" value=<%=uname%> name="uname"/> 
            <input type="hidden" value="laptop" name="cat"/> 
           <input type="image" src="images/image3.jpg" name="image" value="images/image3.jpg">
           </form>
       </div>
        <div id="centerobj2" style="height: 200px; width: 200px; float:right;">
           <form action="http://localhost:8084/Shopping1/ShopCheck" method=post>
            <input type="hidden" value=<%=uname%> name="uname"/> 
            <input type="hidden" value="laptop" name="cat"/> 
           <input type="image" src="images/image4.jpg" name="image" value="images/image4.jpg">
           </form>
           </div>
           <div id="rightobj1" style="height: 200px; width: 200px; float:right;">
           <form action="http://localhost:8084/Shopping1/ShopCheck" method=post>
            <input type="hidden" value=<%=uname%> name="uname"/> 
            <input type="hidden" value="laptop" name="cat"/> 
           <input type="image" src="images/image5.jpg" name="image" value="images/image5.jpg">
           </form>
       </div>
           <div id="rightobj1" style="height: 200px; width: 200px; float:right;">
           <form action="http://localhost:8084/Shopping1/ShopCheck" method=post>
            <input type="hidden" value=<%=uname%> name="uname"/> 
            <input type="hidden" value="laptop" name="cat"/> 
           <input type="image" src="images/image6.jpg" name="image" value="images/image6.jpg">
           </form>
       </div>
    </body>
</html>
