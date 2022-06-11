package Student.Mange;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	
	 public static boolean insertStudentToDB (Student st) {
		boolean f=false;
		try {
			
		Connection con=scp.Createc();
		String query="insert into student(Name,Age) values(?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, st.getStudentName());
		pst.setString(2, st.getStudentAge());
		pst.executeUpdate();
		f=true;
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	 }
		public static boolean deleteStudent(int userId) {
			// TODO Auto-generated method stub
			
		
		 boolean f=false;
			try {
				
			Connection con=scp.Createc();
			String query="delete from student where id=?";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setLong(1,userId );
			
			pst.executeUpdate();
			f=true;
}

	  catch(Exception e) {
		e.printStackTrace();  
	  }
	  return f;
	 }
		public static void showAllStudent() {
			// TODO Auto-generated method stub
			
			
	
				try {
					
				Connection con=scp.Createc();
				String query="select * from student";
				 Statement stmt=con.createStatement();				
				ResultSet set=stmt.executeQuery(query);
				while(set.next()){
					int id=set.getInt(1);
					String Name=set.getString(2);
					String Age=set.getString(3);
					System.out.println("ID:" +id);
					System.out.println("Name:" +Name );
					System.out.println("Age:" +Age);
					System.out.println("+++++++++++++++");
	}}

		  catch(Exception e) {
			e.printStackTrace();  
		  }
		  
		 
			
			
		}
}