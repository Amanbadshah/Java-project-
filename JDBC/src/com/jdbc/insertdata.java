package com.jdbc;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import  java.sql.*;
public class insertdata {
public static void main(String[] args) {
	try {
		Connection con=getConnection.get_connection();
		String query="insert into testj (Name,city) values(?,?)";
		PreparedStatement pstm=con.prepareStatement(query);
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Name:");
		String Name=bf.readLine();
		System.out.println("Enter City Name:");
		String city=bf.readLine();
		pstm.setString(1, Name);
		pstm.setString(2, city);
		pstm.executeUpdate();
		System.out.println("Done");
		con.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
