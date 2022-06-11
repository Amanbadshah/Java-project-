package com.pro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {


	
	public void doPost(HttpServletRequest resq ,HttpServletResponse rsp )throws ServletException,IOException{
		rsp.setContentType("text/html");
		PrintWriter out=rsp.getWriter();
		out.println("<h2>Welcome to this Submit From</h2>");
		String name=resq.getParameter("user_name");
		String password=resq.getParameter("user_password");
		String email=resq.getParameter("user_email");
		String gender=resq.getParameter("user_gender");
		String Course=resq.getParameter("user_course");
		String Cond=resq.getParameter("condition");
		if(Cond!=null) {
		if(Cond.equals("checked")) {
			out.println("<h2> Name : "+ name + "</h2>");
			out.println("<h2> password : "+ password + "</h2>");
			out.println("<h2> Email : "+ email + " </h2>");
			out.println("<h2> gender : " + gender + " </h2>");
			out.println("<h2> Course: "+ Course + "</h2>");
	
		RequestDispatcher rd=resq.getRequestDispatcher("Next");
		rd.forward(resq, rsp);
		
		
		}else {
			out.println("please select trems and condition");
		}
		}
		else {
			out.println("<h3>please select trems and condition</h3>");
			//get the object requestobjectdispature
			RequestDispatcher	rd=resq.getRequestDispatcher("submit.html");
			//inculde method call
			rd.include(resq, rsp);
		}
		
	}

}
