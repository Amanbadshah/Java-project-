package com.jdbc;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class update {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/Jdbc";
			String username="root";
			String password="root";
			Connection con= DriverManager.getConnection(url,username,password);
			String query="update table1 set tName=?, tcity=? where tid=?";
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Etner name:");
			String tName=br.readLine();
			System.out.println("Enter city");
			String tcity=br.readLine();
			System.out.println("Enter id:");
			int tid=Integer.parseInt(br.readLine());
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, tName);
			pstmt.setString(2, tcity);
			pstmt.setLong(3, tid);
			pstmt.executeUpdate();
			con.close();
			System.out.println("Upadet query....");
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	

}
