package beginner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;

public class differences
{

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String name="vema";
		int id=1118;
		float fee=120000f;
		try 
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vema","vema");
PreparedStatement stmt=con.prepareStatement("insert into STUDENTDATA values(?,?,?)");
stmt.setString(1, name);
stmt.setInt(2, id);
stmt.setFloat(3, fee);
int i=stmt.executeUpdate();
if(i==1)
{
	System.out.println("success");
}
else
{
	System.out.println("not");
}
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
			Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vema","vema");
	PreparedStatement stmt=con.prepareStatement("select *from STUDENTDATA");
	ResultSet rs=stmt.executeQuery();
	if(rs.next()) 
		System.out.println(rs.getInt(2)+" "+rs.getFloat(3)+" "+rs.getString(1));
	HashSet<Float> hs= new HashSet<>();
	while(rs.next()) 
	{
		hs.add(rs.getFloat("fee"));
	}
	if(hs.contains(fee)) {
		System.out.println("matched");
		String name1="reddy";
		int id1=1111;
	Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vema","vema");
PreparedStatement stmt1=con.prepareStatement("update studentdata set name=?,id=? where fee=?");
stmt1.setString(1, name1);
stmt1.setInt(2, id1);
stmt1.setFloat(3, fee);
int i=stmt1.executeUpdate();
if(i==1) {
	System.out.println("sucess");
}
	}else {
		System.out.println("not matched");
	}
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con2=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vema","vema");
	PreparedStatement stmt2=con.prepareStatement("select *from STUDENTDATA");
	ResultSet rs2=stmt.executeQuery();
	if(rs.next()) 
		System.out.println(rs.getInt(2)+" "+rs.getFloat(3)+" "+rs.getString(1));
	HashSet<Float> hs2= new HashSet<>();
	while(rs.next()) 
	{
		hs.add(rs.getFloat("fee"));
	}
	if(hs.contains(fee)) {
		System.out.println("matched");
		String name1="reddy";
		int id1=1111;
	Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vema","vema");
PreparedStatement stmt1=con.prepareStatement("delete from studentdata where fee=?");
stmt1.setFloat(1, fee);
int i=stmt1.executeUpdate();
if(i==1) {
	System.out.println("success");
}
	}
	}
	}

