package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionclass {
	public static Connection getConnection() {
		
		try {
			Connection conn;
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dharm","root","07061996");
			System.out.println("sucess");
			return conn;
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
		
	}
	

}
