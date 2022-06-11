package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
public class getConnection {
	 private static  String Driver="com.mysql.cj.jdbc.Driver"; 
	 private static String url="jdbc:mysql://localhost:3306/connections";
	 private static String username="root";
	 private static String password="root";
	 public static Connection get_connection() {
		 Connection con=null;
		 
	
		try {
			Class.forName(Driver);
			con=DriverManager.getConnection(url,username,password);
		}	
		catch(Exception e) {
	e.printStackTrace();
		}
		return con;
	

}}
