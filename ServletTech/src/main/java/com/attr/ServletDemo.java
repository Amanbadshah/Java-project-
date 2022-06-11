package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		
	protected void  doPost(HttpServletRequest req ,HttpServletResponse reso)throws ServletException,IOException{
		
	
	try {
		reso.setContentType("text/html");
		PrintWriter dis=reso.getWriter();
		
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}}

	/**
	 * 
	 */
	

}
