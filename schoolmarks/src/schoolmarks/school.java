package schoolmarks;

import java.sql.SQLException;
import java.util.*;

public class school
{
public static void main(String args[]) throws ClassNotFoundException, SQLException
{
	marks.mm();
	int i;
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the input");
	System.out.println("1.enter the student marks");
	System.out.println("2.get the student details");
	try
	{
	 i=sc.nextInt();
	switch(i)
	{
	case 1:marks.m();
	break;
	case 2:marks.m1();
	}
	}
	catch(InputMismatchException ae)
	{
		System.out.println("enter numbers");
	}
	
}
}
