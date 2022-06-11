package com.Servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("ServletDemo3")
public class ServletDemo3 extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException {
		res.setContentType("text/html");PrintWriter w=res.getWriter();
		w.print("<h1>Third Servlet Demo3</h1>");
		w.print("<h1>This Servlet 3 Demo</h1>");
	}


}
