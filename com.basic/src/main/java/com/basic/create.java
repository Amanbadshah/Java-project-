package com.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class create
 */
@WebServlet("/create")
public class create extends HttpServlet {
	private Connection con; 
public void init() {
	try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		String firstname = request.getParameter("first_name");
		String lastname = request.getParameter("last_name");
		String gmail = request.getParameter("gmail");
		String password = request.getParameter("password");
		try {
			Statement stmt = con.createStatement();
			int update = stmt.executeUpdate("insert into user values('"+firstname+"','"+lastname+"','"+gmail+"','"+password+"')");
		PrintWriter out = response.getWriter();
		if(update>0) {
			out.println("<h1>NEW USER UPDATE</h1>");
		}
		else {
			out.println("<h1>ERROR</h1>");
		}
		
		
		}
		catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void destory() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}