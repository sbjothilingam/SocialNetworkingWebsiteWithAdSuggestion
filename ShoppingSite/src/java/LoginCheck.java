/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * Checks for the authenticity of the user.
 */
@WebServlet(name = "LoginCheck", urlPatterns = {"/LoginCheck"})
public class LoginCheck extends HttpServlet {

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String uname=request.getParameter("uname");
        String pwd=request.getParameter("pwd");
        Connection conn=null;
        PreparedStatement st;
        PrintWriter out ;
        try {
            out=response.getWriter();
          Class.forName("oracle.jdbc.driver.OracleDriver");
          conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","janani"); 
          st = conn.prepareStatement("select *from LoginDetails where user_id='"+uname+"'");
          ResultSet rs =st.executeQuery();
            if(rs.next()){
           RequestDispatcher rd=getServletConfig().getServletContext().getRequestDispatcher("/MainPage.jsp");
            request.setAttribute("uname", uname);
            rd.forward(request, response);
            }
            
        }
        catch(Exception e){}
        
    }

   
   

    
 
}
