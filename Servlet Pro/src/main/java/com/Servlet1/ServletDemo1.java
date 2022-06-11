package com.Servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletDemo1 extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter writer = res.getWriter();
		System.out.println("This servlet using Genric servlet");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>This servlet First progaram Genric servlet</h1>");
		out.print("<h1>This is Demo </h1>");

	}

}
