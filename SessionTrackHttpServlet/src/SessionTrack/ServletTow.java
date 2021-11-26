package SessionTrack;
import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class ServletTow extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
			res.setContentType("text/html");
			PrintWriter out =res.getWriter();
			HttpSession s = req.getSession(false);
			String user = (String) s.getAttribute("user");
			out.println("Hello "+ user);
			out.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
