package abhinavdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class delete 
{
	public static void m2() throws ClassNotFoundException, SQLException
	{
    Scanner sc=new Scanner(System.in);
    System.out.println("which id you want to delete");
     int id=sc.nextInt();
     Class.forName("oracle.jdbc.driver.OracleDriver"); 
 	Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:xe","abhinav","abhinav");
 	PreparedStatement stmt=con.prepareStatement("delete from EMPDATA where id=?");
 	stmt.setInt(1,id);
 	int i=stmt.executeUpdate();
 	if(i==1)
 	{
 		System.out.println("seccesfully deleted");
 	}
	}

}
