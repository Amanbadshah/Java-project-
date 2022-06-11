package Student.Mange;
import java.sql.*;
public class scp {
	static Connection con;
	public static Connection Createc() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/manegment";
		String username="root";
		String password="root";
		con=DriverManager.getConnection(url,username,password);
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;

}}
 