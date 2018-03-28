import java.util.Scanner;
public class prime
{
	public static void main(String[] args)
	{
 Scanner sc=new Scanner(System.in);
 System.out.println("click the number is prime or not");
 int d=0;
 int a=sc.nextInt();
 if(a==0||a==1)
 {
	 System.out.println("given number is prime or not prime number");
 }
for(int i=2;i<=a;i++)
{
	if(a%i==0)
	{
		d++;
	}
}
if(d==1)
{
	System.out.println("given  number is prime");
}
else
	{
	System.out.println("given number is not prime");
}
	}

}
