

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/*
 * For new users who sign up into the I-suggestions
 */
@WebServlet(name = "Registration", urlPatterns = {"/Registration"})
public class Registration extends HttpServlet {

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
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection cn=null;
        String fname,lname,email;
        String uname,pswrd;
        String likes,dob;
        int hash;
        PreparedStatement pv;
        try {
          Class.forName("oracle.jdbc.driver.OracleDriver");
          cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","suresh","suresh"); 
          fname=request.getParameter("fname");
          lname=request.getParameter("lname");
          email=request.getParameter("email");
          uname=request.getParameter("uname");
          pswrd=request.getParameter("pswrd");
          likes=request.getParameter("likes");
          dob=request.getParameter("dob");
          hash=uname.hashCode();
          response.setContentType("text/html");
          pv=cn.prepareStatement("insert into userprofilee values("+hash+",?,?,?,?,?,?,?)");
          pv.setString(2,fname);
          pv.setString(3,lname);
          pv.setString(4,dob);
          pv.setString(5,email);
          pv.setString(6,likes );
          pv.setString(7,uname);
          pv.setString(8,pswrd);
          pv.executeUpdate();
          if(pv.executeUpdate()==1){
              out.println("<html>");
              out.println("<body>");
              out.println("<B>REGISTRATION SUCCESSFULL</B>");
              out.println("<a href=index.jsp>click here to go back to login page</a>");
              out.println("</body>");
              out.println("</html>");
              
          }
          else{
              out.println("<B>Registration not Successfull</B>");
          }
        }
        catch(Exception e){
        e.printStackTrace();
        }
        finally {      
            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
