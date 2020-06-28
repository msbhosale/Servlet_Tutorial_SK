package in.happycoding.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Maths extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String number = request.getParameter("number");
		String name = request.getParameter("name");
		
		int myNumber = Integer.parseInt(number);
		
		
		System.out.println("Number is : "+myNumber);
		System.out.println("Name is : "+name);
	}

}
