package Student.Mange;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Test1 {
	public static void main(String[] args) {
		try {
			
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
	  // String query="delete from table1 where tid=10";
	   //PreparedStatement statement = con.prepareStatement(query);
   //statement.executeUpdate();
		String query="Select * from table1";
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery(query);
		while(result.next()) {
			int id = result.getInt("tid");
		
		String Name=result.getString("tName");
		String city=result.getString("tcity");
		System.out.println(id + " " + Name + " " + city);
	
		
		}
		
		
		
	   System.out.println("Done");
	   
	   
	   
	   
	   
	   
	   con.close();
		
		
		
		
		}
		
		
		catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		}

}
