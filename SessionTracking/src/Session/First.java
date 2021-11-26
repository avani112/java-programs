package Session;
import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
			res.setContentType("text/html");
			PrintWriter out =res.getWriter();
			String user = req.getParameter("user");
			out.println("Welcome "+ user);
			out.println("<a href='second?user="+user+"'> visit</a>");
			out.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
