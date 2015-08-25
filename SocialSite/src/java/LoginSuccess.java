
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map.Entry;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * User's profile page where the deals would be displayed.
 */

@WebServlet(name = "LoginSuccess", urlPatterns = {"/LoginSuccess"})
public class LoginSuccess extends HttpServlet {

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
        /*
         * 
         */
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ArrayList<String> imageName=new ArrayList<String>();
        String Laptopimage[]={"images/image1.jpg","images/image2.jpg","images/image3.jpg","images/image4.jpg","images/image5.jpg"
        ,"images/image6.jpg"};
        String Mouseimage[]={"images/Mouseimage1.jpg","images/Mouseimage2.jpg","images/Mouseimage3.jpg","images/Mouseimage4.jpg"};
        String Speakerimage[]={"images/Speakerimage1.jpg","images/Speakerimage2.jpg","images/Speakerimage3.jpg","images/Speakerimage4.jpg"};
        PreparedStatement pv;
        Connection conn=null;
        Connection conn1=null;
        int laptopCount,mouseCount,speakerCount;
        ArrayList<Integer> catCount=new ArrayList<Integer>();
        Map<Integer,String> countCat=new HashMap<Integer,String>();
        ArrayList<String> deals=new ArrayList<String>();
        //ArrayList<String> imageName=new ArrayList<String>();
        ResultSet rs,rs1,rsdeals;
        int count1=0;
        int count2=0;
        String name=(String) request.getAttribute("lname");
        String uname=(String) request.getAttribute("name");
        try {
          Class.forName("oracle.jdbc.driver.OracleDriver");
          conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","janani"); 
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginSuccess</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div style=float:left;>");
            out.println("<div style=background:darkorange;>");
            out.println("<div style=height:600px;>");
            out.println("<div style=width:200px;>");
            out.println("<h1>Hi "+name+"</h1>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("<div style=float:right;>");
            out.println("<div style=height:800px;>");
            out.println("<div style=width:200px;>");
            out.println("<h2><b>Ad Suggestions</b></h2><br>");
           /*
            * Selects the product that has the largest count value for laptop category to display its deals.
            */
            PreparedStatement st1= conn.prepareStatement("select sum(count) from suggestions where user_id='"+uname+"' and category='Laptop'");
            rs1=st1.executeQuery();
            if(rs1.next()){
                laptopCount=rs1.getInt(1);
                catCount.add(laptopCount);
                countCat.put(laptopCount, "Laptop");
            }
           /*
            * Selects the product that has the largest count value for mouse category to display its deals.
            */
            PreparedStatement st2= conn.prepareStatement("select sum(count) from suggestions where user_id='"+uname+"' and category='Mouse'");
            rs1=st2.executeQuery();
            if(rs1.next()){
                mouseCount=rs1.getInt(1);
                catCount.add(mouseCount);
                countCat.put(mouseCount, "Mouse");
            }
           /*
            * Selects the product that has the largest count value for speaker category to display its deals.
            */
            PreparedStatement st3= conn.prepareStatement("select sum(count) from suggestions where user_id='"+uname+"' and category='Speaker'");
            rs1=st3.executeQuery();
            if(rs1.next()){
                speakerCount=rs1.getInt(1);
                catCount.add(speakerCount);
                countCat.put(speakerCount, "Speaker");
            }
            
            Collections.sort(catCount);
            String cat=countCat.get(catCount.get(catCount.size()-1));
            if(cat.equals("Laptop")){
                for(int i=0;i<3;i++){
                  
                  int rand=(int)(Math.random()*Laptopimage.length); 
                  imageName.add(Laptopimage[rand]);
           /*
            * Selects deals related to laptop from deals table and displays it.
            */
                  PreparedStatement st4= conn.prepareStatement("select * from deals where prod_id='"+Laptopimage[rand]+"'");
                  rsdeals=st4.executeQuery();
             
                  while(rsdeals.next()){
                  
                      deals.add(rsdeals.getString(3));
                  }
                }
                for(int i=0;i<imageName.size();i++){
                    out.println("<img src="+imageName.get(i)+" height=100px width=100px></br>");
                    out.println("<h4>"+deals.get(i)+"</h4></br>");
                }
            }
           /*
            * Selects deals related to mouse from deals table and displays it.
            */
            else if(cat.equals("Mouse")){
                for(int i=0;i<3;i++){
                  int rand=(int)(Math.random()*Mouseimage.length); 
                  imageName.add(Mouseimage[rand]);
                  PreparedStatement st4= conn.prepareStatement("select * from deals where prod_id='"+Mouseimage[rand]+"'");
                  rsdeals=st4.executeQuery();
                  while(rsdeals.next()){
                    deals.add(rsdeals.getString(3));
                  }
                }
                for(int i=0;i<imageName.size();i++){
                    out.println("<img src="+imageName.get(i)+" height=100px width=100px></br>");
                    out.println("<h4>"+deals.get(i)+"</h4></br>");
                }
            }
           /*
            * Selects deals related to speaker from deals table and displays it.
            */
            else{
                for(int i=0;i<3;i++){
                  int rand=(int)(Math.random()*Speakerimage.length); 
                  imageName.add(Speakerimage[rand]);
                  PreparedStatement st4= conn.prepareStatement("select * from deals where prod_id='"+Speakerimage[rand]+"'");
                  rsdeals=st4.executeQuery();
                  while(rsdeals.next()){
                    deals.add(rsdeals.getString(3));
                  }
                }
                for(int i=0;i<imageName.size();i++){
                    out.println("<img src="+imageName.get(i)+" height=100px width=100px></br>");
                    out.println("<h4>"+deals.get(i)+"</h4></br>");
                }
            }
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        } 
        catch(Exception e){}
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
