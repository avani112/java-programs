package Employee;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected static Connection initializeDatabase() throws SQLException, ClassNotFoundException{ 
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee",
                "root", "");
	        return con; 
	} 

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		PrintWriter out = response.getWriter();
			           try { 
			        	   Connection con = initializeDatabase();
			               PreparedStatement st = con.prepareStatement("insert into employee.emp values(?,?,?);"); 
			               st.setInt(1, Integer.valueOf(request.getParameter("e_id")));
			               st.setString(2, request.getParameter("e_name"));
			               st.setInt(3, Integer.valueOf(request.getParameter("desig_id")));
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
