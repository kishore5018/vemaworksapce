import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Scanner;
public class companydetails 
{
	static Connection con1;
	
	public static void ab() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		  Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:xe","abhinav","abhinav");
		  con1=con;
		}
	public static void m() throws ClassNotFoundException, SQLException
{	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter companyname");
	String name=sc.nextLine();
	System.out.println("enter establish year");
	int year=sc.nextInt();
	System.out.println("enter how many employees are there");
	int employeesstrength=sc.nextInt();
	PreparedStatement ps=con1.prepareStatement("insert into company values(?,?,?)");
	ps.setString(1, name); 
    ps.setInt(2, year);
    ps.setInt(3,employeesstrength);
	int i=ps.executeUpdate();
	if(i==1)
	{
		System.out.println("record added");
	}
	else
	{
		System.out.println("record not added");
	}
}
public static void m1() throws ClassNotFoundException, SQLException
{
	PreparedStatement ps=con1.prepareStatement("select * from company");
	ResultSet rs=ps.executeQuery();
	while(rs.next())
	{
		System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3));
	}
	
}
public static void m2() throws ClassNotFoundException, SQLException
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the company name to get details");
	String name1=sc.nextLine();
	PreparedStatement ps=con1.prepareStatement("select * from company where companyname=?");
	ps.setString(1,name1);
	ResultSet rs=ps.executeQuery();
	if(rs.next())
	{
    System.out.println("company name:"+rs.getString(1)+",company year:"+rs.getInt(2)+",company strength:"+rs.getInt(3));
	}
}
	public static void m3() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the company name to alter the details");
		String name2=sc.nextLine();
		PreparedStatement ps=con1.prepareStatement("select * from company");
		HashSet<String> hs=new HashSet<>();
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			hs.add(rs.getString("companyname"));
		}
		if(hs.contains(name2))
		{
	    System.out.println("enter year you want to change");
	    int i=sc.nextInt();
	    System.out.println("enter company Strength to change");
	    int j=sc.nextInt();
	    Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection con3=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:xe","abhinav","abhinav");
		PreparedStatement ps1=con3.prepareStatement("update company set year=?,strength=? where companyname=?");
		ps1.setInt(1, i);
		ps1.setInt(2, j);
		ps1.setString(3, name2);
	    int i1=ps1.executeUpdate();
	    if(i1==1)
	    {
	    	System.out.println("record updated");
	    }
	    else
	    {
	    	System.out.println("reord not updated");
	    }
		}
}
	public static void m4() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter which company you want to delete");
		String n=sc.nextLine();
		PreparedStatement ps=con1.prepareStatement("delete company where companyname=?");
		ps.setString(1, n);
         int i=ps.executeUpdate();
         if(i==1)
         {
        	 System.out.println("successfully deleted");
         }
         else
         {
        	 System.out.println("not deleted");
         }
	}
}
