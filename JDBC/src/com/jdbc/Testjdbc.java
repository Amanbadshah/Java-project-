package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class Testjdbc {
	public static void main(String[] args) {
		try {
			Connection con=getConnection.get_connection();
			String query="create table Testj(id int(100) primary key auto_increment,Name varchar(150) not null,city varchar(100))";
			Statement tmt = con.createStatement();
			tmt.executeUpdate(query);
			System.out.println("Table is create");
			con.close();
			
			
	}
		catch(Exception e) {
			e.printStackTrace();
		}

	}}
