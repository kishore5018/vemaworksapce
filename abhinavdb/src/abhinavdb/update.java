package abhinavdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class update 
{
public static void m1() throws ClassNotFoundException, SQLException
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter which name and id you want to change:");
	Class.forName("oracle.jdbc.driver.OracleDriver"); 
	Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:xe","abhinav","abhinav");
	System.out.println("enter id");
	int id=sc.nextInt();
	System.out.println("enter username");
	String username=sc.next();
	System.out.println("enter password");
	String password=sc.next();
	PreparedStatement stmt=con.prepareStatement("update EMPDATA set username=?,password=? where id=?");
	stmt.setString(1,username);
	stmt.setString(2,password);
	stmt.setInt(3,id);
	int i=stmt.executeUpdate();
	if(i==1)
	{
		System.out.println("successfully updated");
	}
}
}
