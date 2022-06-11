package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class selectdata {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);
			String query = "select * from table1";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(query);
			while (set.next()) {
				int tid = set.getInt(1);
				String tName = set.getString(2);
				String tcity = set.getString(3);
				System.out.println(tid + "  " + tName + "   " + tcity);

			}
			con.close();

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
