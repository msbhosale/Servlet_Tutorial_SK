package in.happycoding.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FifthClass extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletContext context = getServletContext();
		ServletConfig config = getServletConfig();
		
		String schoolName = context.getInitParameter("School Name");
		String teacher = config.getInitParameter("Teacher");
		
		System.out.println(schoolName);
		System.out.println(teacher);
		
	}

}
