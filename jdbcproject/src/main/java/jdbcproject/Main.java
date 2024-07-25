package jdbcproject;

import java.sql.Connection;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Connection conn = Connectionclass.getConnection();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:Crudoperation.insertation(sc);
				
				break;
			case 2:Crudoperation.updatation(sc);
			break;
			case 3:Crudoperation.Fetchdata();
			break;
			case 4:Crudoperation.deletation(sc);
			break;

			default:
				break;
			}
			
		
					
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
}
		


