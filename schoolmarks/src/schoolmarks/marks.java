package schoolmarks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Scanner;
public class marks
{
	static Connection con;
	public static void mm() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con1=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:xe","abhinav","abhinav");
		con=con1;
	}
public static void m() throws ClassNotFoundException, SQLException
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter username");
	String name=sc.nextLine();
	System.out.println("enter password");
	String password=sc.nextLine();
	System.out.println("enter telugu marks");
	int telugu=sc.nextInt();
	System.out.println("enter hindi marks");
	int hindi=sc.nextInt();
	System.out.println("enter english marks");
	int english=sc.nextInt();
	System.out.println("enter maths marks");
	int maths=sc.nextInt();
	System.out.println("enter science marks");
	int science=sc.nextInt();
	System.out.println("enter social marks");
	int social=sc.nextInt();
	PreparedStatement ps=con.prepareStatement("insert into STUDATA values(?,?,?,?,?,?,?,?)");
	ps.setString(1,name);
	ps.setString(2,password);
	ps.setInt(3, telugu);
	ps.setInt(4, hindi);
	ps.setInt(5, english);
	ps.setInt(6, maths);
	ps.setInt(7, science);
	ps.setInt(8, social);
	int i=ps.executeUpdate();
	if(i==1)
	{
		System.out.println("record inserted success");
		
	}
	else
	{
		System.out.println("record inserted not success");
	}
	
}
public static void m1() throws ClassNotFoundException, SQLException
{
	System.out.println("enter id and password");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter user id");
	String name1=sc.nextLine();
	System.out.println("enter password");
	String password=sc.nextLine();
	PreparedStatement ps=con.prepareStatement("select * from studata");
	HashSet<String> h=new HashSet<>();
	HashSet<String> h1=new HashSet<>();
	ResultSet rs=ps.executeQuery();
	while(rs.next())
	{
		h.add(rs.getString("username"));
	}
	while(rs.next())
	{
		h1.add(rs.getString("password"));
	}
	if(h.contains(name1)&&h1.contains(password));
	{
		float total=0,k,l;
		int i=3,j=8;
		 
		PreparedStatement ps1=con.prepareStatement("select * from studata where username=?");
		       ps1.setString(1,name1);
		       ResultSet rs1=ps1.executeQuery();
		       if(rs1.next())
		       {
		    	   while(j>=i)
		    	   {	   
		    	   total=total+rs1.getInt(i);
		    	   i++;
		    	   }
				System.out.println(rs1.getString(1)+" "+"marks:"+" "
		    	   +"telugu:"+rs1.getInt(3)+
		    	   " "+"hindi:"+rs1.getInt(4)+
		    	   " "+"english:"+rs1.getInt(5)+
		    	   " "+"maths:"+rs1.getInt(6)+
		    	   " "+"science:"+rs1.getInt(7)+
		           " "+"social:"+rs1.getInt(8));
				System.out.println("total:"+" "+total);
				  l=total/600;
				 k=l*100;
				 System.out.println("percentage:"+k);
			}
		         else
		    		{
		    			System.out.println("enter coeect login details");
		    		}
		       		       
		       }
	
	}
}
