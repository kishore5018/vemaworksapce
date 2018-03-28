package beginner;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,arm=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		a=n;
		while(n>0) {
			b=n%10;
			n=n/10;
			arm=arm+b*b*b;
		}if(arm==a) {
			System.out.println("its a armstrong");
		}else {
			System.out.println("not armstrong");
		}
	}

}
