
package com.jdbc;
import java.sql.*;
import java.io.*;
public class connection2 {

	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/Jdbc";
			String username="root";
			String password="root";
			
			Connection con = DriverManager.getConnection(url,username,password);
			String q="insert into table1(tName,tcity) values(?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setString(1, "Shahruk");
			pstmt.setString(2, "Kolkata");
			pstmt.executeUpdate();
			con.close();
			System.out.println("Done ko");
		}

		catch (Exception e) {
		
			e.printStackTrace();
			// TODO: handle exception
		}
}}