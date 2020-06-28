package in.happycoding.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.happycoding.dao.UserDAO;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		UserDAO ud = new UserDAO();
		
		boolean result = ud.checkUser(username, password);
		
		if(result == true) {
			System.out.println("Valid User");
		}else {
			System.out.println("Invalid User");
		}

	}

}
