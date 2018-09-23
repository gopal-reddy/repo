import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class server2 extends HttpServlet{
public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
String id=req.getParameter("id");
String name=req.getParameter("name");
String em=req.getParameter("user");
String pa=req.getParameter("pass");
try{
  Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/srinu","root","");
      PreparedStatement p=con.prepareStatement("insert into data values(?,?,?,?)");
      p.setString(1,id);
      p.setString(2,name);
      p.setString(3,em);
      p.setString(4,pa);
int i=p.executeUpdate();

      if(i>0)pw.print("wel"+na);
}
catch(Exception e){System.out.print(e);}   
}
} 
 