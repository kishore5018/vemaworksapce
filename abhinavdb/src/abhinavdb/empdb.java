package abhinavdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class empdb 
{
public static void m()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter username");
	String username=sc.nextLine();
	System.out.println("enter password");
	String password=sc.nextLine();
	System.out.println("enter id");
	int id=sc.nextInt();
	try
{
	Class.forName("oracle.jdbc.driver.OracleDriver"); 
	Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:xe","abhinav","abhinav");
	PreparedStatement stm=con.prepareStatement("insert into EMPDATA values(?,?,?)"); 
	stm.setString(1, username); 
     stm.setString(2, password);
     stm.setInt(3,id);
      int i=stm.executeUpdate();
      if(i==1)
      {
    	  System.out.println("successfully stored");
    	  System.out.println("do you want go into the account");
    	  System.out.println("1.yes");
    	  System.out.println("2.no");
    	  if(i==1)
    	  {
    		 
    	  }
    	  else
    	  {
    		  System.out.println("you are logged out");
    		  System.exit(0);
    	  }
      }
      con.close();
}
catch(Exception ae)
{
	System.out.println(ae);
}

}
}
