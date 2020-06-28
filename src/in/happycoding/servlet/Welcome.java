package in.happycoding.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		System.out.println("do get called");

		PrintWriter writer = response.getWriter();

		String name = request.getParameter("name");

		writer.write("<h1> Welcome, " + name + " </h1>");
		writer.write("<p> My awesome paragraph goes here </p>");
		writer.write("<ul>");
		writer.write("<li> Item 1 </li>");
		writer.write("<li> Item 2 </li>");
		writer.write("<li> Item 3 </li>");
		writer.write("</ul>");
		
		writer.close();

	}

}
