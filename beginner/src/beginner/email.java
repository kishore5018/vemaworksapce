package beginner;

import java.util.Scanner;

public class email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String emailid="vemareddy119@gmail.com";
String password="reddy@119";
Scanner sc=new Scanner(System.in);
System.out.println("Enter your email id");
String n=sc.next();
Scanner sc1=new Scanner(System.in);
System.out.println("Enter password");
String n1=sc1.next();
if(emailid.equals(n)&&password.equals(n1)) {
	System.out.println("your successfully loging");
}else if(emailid.equalsIgnoreCase(n)) {
	System.out.println("incorect password ");
}else if(password.equalsIgnoreCase(n1)) {
	System.out.println("login id incorret");
}
	}

}
