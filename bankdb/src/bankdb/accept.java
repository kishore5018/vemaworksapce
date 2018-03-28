package bankdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class accept 
{
	static Scanner sc=new Scanner(System.in);
	static String pin;
	static String a="aaaa";

public static void m() throws ClassNotFoundException, SQLException
{
	System.out.println("create pin number");
	 pin=sc.nextLine();
	if(pin.length()==a.length())
	{			
	System.out.println("you entered correct input");
	}
	else
	{
		System.out.println("PLEASE CHOOSE FOUR NUMBERS");
	}
	Class.forName("oracle.jdbc.driver.OracleDriver"); 
	Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:xe","bank","bank");
	PreparedStatement stm=con.prepareStatement("insert into Bank values(?)"); 
	stm.setString(1,pin); 
   int i=stm.executeUpdate();
   if(i==1)
   {
	   System.out.println("your entered the pin");
	  loggedin.m2();
   }
}
}