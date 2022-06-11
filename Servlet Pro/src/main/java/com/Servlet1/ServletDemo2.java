package com.Servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletDemo2 extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html"); PrintWriter o=res.getWriter();
		o.print("<h1>Second Demo Servlet</h1>");
		o.print("<h2>HELLO</h2>");
		o.print("<button>clicjk me</button>");
		
		
		

}
}