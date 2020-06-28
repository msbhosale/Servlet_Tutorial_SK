package in.happycoding.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		PrintWriter writer = response.getWriter();
		
		response.sendRedirect("Welcome?username="+username);
		
	}
}






