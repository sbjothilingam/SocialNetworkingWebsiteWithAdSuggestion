package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("        body{\n");
      out.write("             background:url(images/social-networking-sites.jpg);\n");
      out.write("             }\n");
      out.write("             h1{\n");
      out.write("                 color: #0000ff;\n");
      out.write("                 font-size: 60px;\n");
      out.write("             }\n");
      out.write("       </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registration</title>\n");
      out.write("    <h1 align=\"center\">Rgistration Page</h1>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"http://localhost:8084/BigData/Registration\" method=post>\n");
      out.write("            <div id=\"reg\" style=\"text-align: center; font-size: 20px; font-style: oblique;\">\n");
      out.write("        First Name          :<input type=\"text\" name=\"fname\"><br>\n");
      out.write("        Last Name           :<input type=\"text\" name=\"lname\"><br>\n");
      out.write("        Date of Birth       :<input type=\"date\" name=\"dob\"><br>\n");
      out.write("        Email               :<input type=\"text\" name=\"email\"><br>\n");
      out.write("        Phone no            :<input type=\"text\" name=\"pno\"><br>\n");
      out.write("        Choose a Username   :<input type=\"text\" name=\"uname\"><br>\n");
      out.write("        Password            :<input type=\"password\" name=\"pswrd\"><br>\n");
      out.write("        Re-enter Password   :<input type=\"password\" name=\"repswrd\"><br>\n");
      out.write("        Your Likes          :<input type=\"text\" name=\"likes\"><br>\n");
      out.write("        <input type=submit value=\"Submit\">\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
