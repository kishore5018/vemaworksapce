import java.sql.SQLException;
import java.util.Scanner;

public class comapny 
{
public static void main(String args[]) throws ClassNotFoundException, SQLException
{
	companydetails.ab();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the given input following");
	System.out.println("1.adding company details");
	System.out.println("2.getting company details");
	System.out.println("3.enter company name to get details");
	System.out.println("4.altering company info");
	System.out.println("5.deleting company info");
	int i=sc.nextInt();
	switch(i)
	{
	case 1:companydetails.m();
	break;
	case 2:companydetails.m1();
	break;
	case 3:companydetails.m2();
	break;
	case 4:companydetails.m3();
	break;
	case 5:companydetails.m4();
   break;
	}
}
}
