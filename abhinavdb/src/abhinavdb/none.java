package abhinavdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class none 
{
public static void m() throws ClassNotFoundException, SQLException
{
	String s="gfdgdf";
	Scanner sc=new Scanner(System.in);
	Class.forName("oracle.jdbc.driver.OracleDriver"); 
	Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:xe","none","none");
	Statement stm=con.createStatement(); 
	ResultSet rs=stm.executeQuery("select * from none");
	 while(rs.next()) 
     {
     String t=rs.getString(1);
     if(s.equals(t))
     {
    	 System.out.println(t);
     }
}
}
}
