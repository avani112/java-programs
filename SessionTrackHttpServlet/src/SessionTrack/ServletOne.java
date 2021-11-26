package SessionTrack;
import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
			res.setContentType("text/html");
			PrintWriter out =res.getWriter();
			String user = req.getParameter("user");
			out.println("Welcome "+ user);
			HttpSession s = req.getSession();
			s.setAttribute("user",user);
			out.println("<a href = 'two'> visit </a>");
			out.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
