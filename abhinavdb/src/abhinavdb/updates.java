package abhinavdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Scanner;

public class updates 
{
public static void m() throws ClassNotFoundException,SQLException
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the UserName to Update:::");
		String username=sc.nextLine();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","abhinav","abhinav");
		PreparedStatement pstmt=conn.prepareStatement("select * from EMPDATA");
	    ResultSet rs=pstmt.executeQuery();
		HashSet<String> hs=new HashSet<>();
		while(rs.next()) {
			hs.add(rs.getString("username"));
		}
		if(hs.contains(username)) {
			System.out.println("Record Found");
			System.out.println("Enter the Details to Update::");
			System.out.println("Enter the PassWord:::");
			String password=sc.nextLine();
			System.out.println("Enter the Id:::::::::");
			int id=sc.nextInt();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","abhinav","abhinav");
			PreparedStatement pstmt1=conn1.prepareStatement("update EMPDATA set password=?,id=? where username=?");
			pstmt1.setString(1, password);
			pstmt1.setInt(2, id);
			pstmt1.setString(3, username);
			int i=pstmt1.executeUpdate();
			if(i==1) {
				System.out.println("update success");
			}else {
				System.out.println("update not success");
			}	
		}
		else
		{
			System.out.println("Record Not Found");
		}
}
}
		
		

