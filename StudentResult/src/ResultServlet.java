import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
				response.setContentType("text/html");  
				PrintWriter out = response.getWriter();  
				try{  
					Class.forName("com.mysql.cj.jdbc.Driver");  
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root", "");
					PreparedStatement ps=con.prepareStatement("select * from student where roll_no=?");  
					ps.setInt(1, Integer.valueOf(request.getParameter("roll_no")));  
					out.print("<table width=50% border=1>");  
					out.print("<caption>Result:</caption>");  
					ResultSet rs=ps.executeQuery();  
					ResultSetMetaData rsmd=rs.getMetaData();  
					int total=rsmd.getColumnCount();  
					out.print("<tr>");  
					for(int i=1;i<=total;i++){  
						out.print("<th>"+rsmd.getColumnName(i)+"</th>");  
					}  
					out.print("</tr>");  
					while(rs.next()){  
						out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getInt(3)+"</td><td>"+rs.getInt(4)+"</td><td>"+rs.getInt(5)+"</td><td>"+rs.getInt(6)+"</td><td>"+rs.getInt(7)+"</td></tr>");  
                  
					}  
					out.print("</table>"); 
					ps.close();
					con.close();
				}
				catch (Exception e) {
					e.printStackTrace();
					out.println(e);
				}  
				finally{
					out.close();
				}  
	}  
}

