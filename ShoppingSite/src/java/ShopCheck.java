/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author suresh
 */
@WebServlet(name = "ShopCheck", urlPatterns = {"/ShopCheck"})
public class ShopCheck extends HttpServlet {



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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String Laptopimage[]={"images/image1.jpg","images/image2.jpg","images/image3.jpg","images/image4.jpg","images/image5.jpg"
        ,"images/image6.jpg"};
        String Mouseimage[]={"images/Mouseimage1.jpg","images/Mouseimage2.jpg","images/Mouseimage3.jpg","images/Mouseimage4.jpg"};
        String Speakerimage[]={"images/Speakerimage1.jpg","images/Speakerimage2.jpg","images/Speakerimage3.jpg","images/Speakerimage4.jpg"};
        String iname=request.getParameter("image");
        String name=request.getParameter("uname");
        String cate=request.getParameter("cat");
           try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
            
            
                Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","janani");
            
            
                /*
                 * Increments the count value for the category "Laptop" in the suggestiosn table.
                 */
         if(cate.equals("laptop")){
             int imageArray[]={0,0,0,0,0,0};
            for(int i=0;i<Laptopimage.length;i++){
                if(iname.equals(Laptopimage[i])){
                    imageArray[i]=imageArray[i]+1;
                    PreparedStatement s=conn.prepareStatement("select count from suggestions where user_id='"+name+"' and prod_id='"+Laptopimage[i]+"'");
                    ResultSet rs=s.executeQuery();
                    if(rs.next()){
                        
                        PreparedStatement ps=conn.prepareStatement("update suggestions set count=count+1 where user_id='"+name+"' and prod_id='"+Laptopimage[i]+"'");
                        ps.execute();
                        
                    }
                    else{
                    PreparedStatement st = conn.prepareStatement("insert into suggestions values('"+name+"','"+Laptopimage[i]+"',"+imageArray[i]+",'Laptop')");
                    st.executeQuery();
                    }
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet ImageCheck</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<img src="+Laptopimage[i]+" height=300px width=300px>");
                out.println("</body>");
                out.println("</html>");
                }
            }
         }
                /*
                 * Increments the count value for the category "Laptop" in the suggestiosn table.
                 */
         else if(cate.equals("mouse")){
             int mouseimageArray[]={0,0,0,0};
            for(int i=0;i<Mouseimage.length;i++){
                if(iname.equals(Mouseimage[i])){
                    mouseimageArray[i]=mouseimageArray[i]+1;
                    PreparedStatement s=conn.prepareStatement("select count from suggestions where user_id='"+name+"' and prod_id='"+Mouseimage[i]+"'");
                    ResultSet rs=s.executeQuery();
                    if(rs.next()){
                        
                        PreparedStatement ps=conn.prepareStatement("update suggestions set count=count+1 where user_id='"+name+"' and prod_id='"+Mouseimage[i]+"'");
                        ps.execute();
                        
                    }
                    else{
                    PreparedStatement st = conn.prepareStatement("insert into suggestions values('"+name+"','"+Mouseimage[i]+"',"+mouseimageArray[i]+",'Mouse')");
                    st.executeQuery();
                    }
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet ImageCheck</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<img src="+Mouseimage[i]+" height=300px width=300px>");
                out.println("</body>");
                out.println("</html>");
                }
            }
         }
         /*
          * Increments the count value for the category "Laptop" in the suggestiosn table.
          */
         else if(cate.equals("speaker")){
             int speakerimageArray[]={0,0,0,0};
            for(int i=0;i<Speakerimage.length;i++){
                if(iname.equals(Speakerimage[i])){
                    speakerimageArray[i]=speakerimageArray[i]+1;
                    PreparedStatement s=conn.prepareStatement("select count from suggestions where user_id='"+name+"' and prod_id='"+Speakerimage[i]+"'");
                    ResultSet rs=s.executeQuery();
                    if(rs.next()){
                        
                        PreparedStatement ps=conn.prepareStatement("update suggestions set count=count+1 where user_id='"+name+"' and prod_id='"+Speakerimage[i]+"'");
                        ps.execute();
                        
                    }
                    else{
                    PreparedStatement st = conn.prepareStatement("insert into suggestions values('"+name+"','"+Speakerimage[i]+"',"+speakerimageArray[i]+",'Speaker')");
                    st.executeQuery();
                    }
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet ImageCheck</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<img src="+Speakerimage[i]+" height=300px width=300px>");
                out.println("</body>");
                out.println("</html>");
                }
            }
         }
        } catch (Exception ex) {
            
        } finally {            
            out.close();
        }
    }

   
}
