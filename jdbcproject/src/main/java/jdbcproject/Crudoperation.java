package jdbcproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Crudoperation {
public static void insertation(Scanner sc) {
	String query="insert into crudtable(id,name,address)values(?,?,?)";
	
	try {
		Connection conn=Connectionclass.getConnection();
		PreparedStatement psmt=conn.prepareStatement(query);
		System.out.println("enter your id");
		int id=sc.nextInt();
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter your address");
		String address=sc.next();
		psmt.setInt(1, id);
		psmt.setString(2, name);
		psmt.setString(3, address);
		psmt.executeUpdate();
		System.out.println("successful insertion");
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void updatation(Scanner sc) {
	String query="update crudtable set name=? where id=?";
	Connection conn=Connectionclass.getConnection();
	try {
		PreparedStatement psmt=conn.prepareStatement(query);
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter your id");
		int id=sc.nextInt();
		psmt.setString(1,name);
		psmt.setInt(2, id);
		psmt.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}public static void Fetchdata() {
	try {
		String query="select * from crudtable"; 
		Connection conn=Connectionclass.getConnection();
		PreparedStatement psmt=conn.prepareStatement(query);
		
		
	    ResultSet rs = psmt.executeQuery();
	    while (rs.next())
	    {
	        System.out.println(rs.getInt(1));
	        System.out.println(rs.getString(2));
	        System.out.println(rs.getString(3));
	       

	} }catch (Exception e) {
		// TODO: handle exception
	} 
	
    }
public static void deletation(Scanner sc) {
	String query="delete from crudtable where id=?"; 
	Connection conn=Connectionclass.getConnection();
	try {
		PreparedStatement psmt=conn.prepareStatement(query);
		System.out.println("enter delete data");
		int id=sc.nextInt();
		psmt.setInt(1, id);
		int k=psmt.executeUpdate();
		if(k>0) {
			System.out.println("Suceesfully delete");
		}else {
			System.out.println("not delete data");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}

}
