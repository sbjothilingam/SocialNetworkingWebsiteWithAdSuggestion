/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * 
 */
@WebServlet(name = "Navigate", urlPatterns = {"/Navigate"})
public class Navigate extends HttpServlet {

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
    /*
     * Takes the user to appropriate category he chooses.
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name=request.getParameter("uname");
        String site=request.getParameter("site");
        if(site.equals("laptop")){
        RequestDispatcher rd=getServletConfig().getServletContext().getRequestDispatcher("/LaptopSite.jsp");
        request.setAttribute("uname", name);
        rd.forward(request, response);
        }
        else if(site.equals("mouse")){
          RequestDispatcher rd=getServletConfig().getServletContext().getRequestDispatcher("/Mouse.jsp");
        request.setAttribute("uname", name);
        rd.forward(request, response);  
        }
        else{
          RequestDispatcher rd=getServletConfig().getServletContext().getRequestDispatcher("/Speaker.jsp");
        request.setAttribute("uname", name);
        rd.forward(request, response);  
        }
    }


}
