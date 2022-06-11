package com.Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	//out.println("Welcome");
	String no1 = req.getParameter("number_1");
	String no2 = req.getParameter("number_2");
	int int1 = Integer.parseInt(no1);
	int int2 = Integer.parseInt(no2);
	int int3=int1+int2;
	out.println("<h1>Total  : "+ int3 +"</h1>");
	}
	

}
