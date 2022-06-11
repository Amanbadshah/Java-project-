package com.pro.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Dbconnection {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/Crud";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "root";
	
		
	

	public static Connection getConnection() {
		Connection con = null;
					
						try {
							Class.forName(DRIVER);
							con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

	
		
	return con;
	
}
}
