/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
             {
        response.setContentType("text/html;charset=UTF-8");
        PreparedStatement pv;
        Connection conn=null;
        PrintWriter out;
        try {
        /*
         * Checks for username and password
         */
        out = response.getWriter();
        String uname=request.getParameter("uname");
        String pwd=request.getParameter("pwd");
        
            /*
             * Connecting to the database.
             */
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","janani"); 
        PreparedStatement st = conn.prepareStatement("select *from LoginDetails where user_id='"+uname+"' and password='"+pwd+"'");
        ResultSet rs =st.executeQuery();
               if(rs.next()){
                    RequestDispatcher rd=getServletConfig().getServletContext().getRequestDispatcher("/LoginSuccess");
                    String lname=rs.getString("lname");
                    request.setAttribute("lname", lname);
                    request.setAttribute("name", uname);
                    rd.forward(request, response);
                    
                }
               
            out.close();
       }
        catch(Exception e){
            
        }
             }
    }

    
   

