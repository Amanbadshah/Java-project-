package com.pro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class servlet3 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter slr=res.getWriter();
		slr.print("<h1>Hello Thrid Generic Servlet </h1>");
		slr.print("<h1>Hello Welcome</h1>");
		
	}

}
