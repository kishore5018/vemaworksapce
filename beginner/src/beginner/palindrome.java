package beginner;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,palin=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
a=n;
while(n>0) {
	b=n%10;
	n=n/10;
	palin=palin*10+b;
}if(palin==a) {
	System.out.println("its a palindrome");
}else {
	System.out.println("not palindrome");
}
	}
}
