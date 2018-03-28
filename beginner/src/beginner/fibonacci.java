package beginner;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b=0,c=1,d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int no=sc.nextInt();
for( a=0;a<=no;a++) {
	System.out.println(b);
	d=b+c;
	b=c;
	c=d;
}
	}

}
