package com.jdbc;
import java.sql.*;
import java.io.*;

public class connection {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/Jdbc";
		String username="root";
		String password="root";
		
		Connection con = DriverManager.getConnection(url,username,password);
		String query="insert into table1(tName,tcity) values(?,?)";
		PreparedStatement pstmt=con.prepareStatement(query);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name:");
		String name=br.readLine();
		System.out.println("Enter city:");
		String city=br.readLine();
		pstmt.setString(1, name);
		pstmt.setString(2, city);
		pstmt.executeUpdate();
		System.out.println("done");
		con.close();
	}
	
	
 	
	catch(Exception e){
		e.printStackTrace();
		
	}
	
	
}
}
