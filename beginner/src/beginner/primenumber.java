package beginner;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
if(n==0||n==1) {
	System.out.println("not prime");
}
for(i=2;i<n;i++) {
	if(n%i==0) {
		System.out.println("not prime");
		break;
	}
}if(n==i) {
	System.out.println("prime");
}
	}

}
