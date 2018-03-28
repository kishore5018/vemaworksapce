package abhinavdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class retrieve {

	public static void m4() throws ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:xe","abhinav","abhinav");
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("select * from EMPDATA");  
	      if(rs.next()) 
	      {
	      int t=rs.getInt("id");
	      System.out.println(t);
	}
	}

}
