package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class s1
 */
//@WebServlet(name = "AibaNo1", urlPatterns = { "/AibaNo1" })
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try{  
			  
			res.setContentType("text/html");  
			PrintWriter out=res.getWriter();  
			  String parameter = req.getParameter("name");
			  out.println(parameter);
			ServletContext context=getServletContext();  
			context.setAttribute("company","HP");  
			  
			out.println("Welcome to first servlet");  
			out.println("<a href='AibaNo2'>visit</a>");  
			out.close();  
			  
			}catch(Exception e){
				e.printStackTrace();
				}  
			  
			}
	}


