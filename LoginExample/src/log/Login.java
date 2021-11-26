package log;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Login extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("user");
		String pass = req.getParameter("pass");
		if(pass.equals("servlet")) {
			RequestDispatcher r = req.getRequestDispatcher("servlet2");
			r.forward(req, res);
		}
		else {
			out.println("wrong username/password");
			RequestDispatcher r= req.getRequestDispatcher("/index.html");
			r.include(req, res);
		}
	}
}

