package Student;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected static Connection initializeDatabase() throws SQLException, ClassNotFoundException{ 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "");
	        return con; 
	} 
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		 PrintWriter out = response.getWriter();
			           try { 
			        	   Connection con = initializeDatabase();
			               PreparedStatement st = con.prepareStatement("insert into studentdb.student values(?, ?, ?, ?, ?, ?, ?);"); 
			               st.setInt(1, Integer.valueOf(request.getParameter("roll_no"))); 
			               st.setString(2, request.getParameter("stud_name"));
			               st.setInt(3, Integer.valueOf(request.getParameter("hindi"))); 
			               st.setInt(4, Integer.valueOf(request.getParameter("eng")));
			               st.setInt(5, Integer.valueOf(request.getParameter("phy")));
			               st.setInt(6, Integer.valueOf(request.getParameter("chem"))); 
			               st.setInt(7, Integer.valueOf(request.getParameter("maths"))); 
			               st.executeUpdate(); 
			               st.close(); 
			               con.close(); 
			               out.println("<html><body>db updated</body></html>");
			           } 
			           catch (Exception e) { 
			        	   out.println(e);
			               e.printStackTrace(); 
			           } 
			       } 

}
