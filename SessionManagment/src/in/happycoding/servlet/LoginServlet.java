package in.happycoding.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		// check user
		
		HttpSession session = request.getSession();
		
		session.setAttribute("username", username);
		
		response.sendRedirect("Welcome");
		
	}
}






