package in.happycoding.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter writer = response.getWriter();

		HttpSession session = request.getSession();
		
		String username = (String)session.getAttribute("username");
		
		if(username == null) {
			response.sendRedirect("login.html");
		}else {
			writer.write("<h1>Welcome, " + username+"</h1>");
			writer.write("<a href='LogOutServlet'> Logout </a>");
		}


	}

}
