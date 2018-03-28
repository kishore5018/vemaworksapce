package bankdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class loggedin 
{
	static Scanner sc=new Scanner(System.in);
public static void m2() throws ClassNotFoundException, SQLException
{
	System.out.println("enter your created pin number:");
	String o=sc.nextLine();
	String s=null;
	Class.forName("oracle.jdbc.driver.OracleDriver"); 
	Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:xe","bank","bank");
	Statement stm=con.createStatement();
	ResultSet rs=stm.executeQuery("select * from bank");  
	while(rs.next()) 
    {
     s=rs.getString(1);
    if(s.equals(o))
    {
   	 System.out.println("you are logged in");
    }
}
}
}
