package beginner;
import java.util.Scanner;
public class atm 
{
	int n,j=40000,k;
	int pin=1119;
	Scanner sc=new Scanner(System.in);
	void m2()
	{
	System.out.println("Enter your atm PIN number");
	n=sc.nextInt();
	if(n==pin)
	{
		System.out.println("welcome to AXIS bank ATM");
		System.out.println("1.balance enquiry");
		System.out.println("2.money withwral");
		System.out.println("3.deposit amount");
		System.out.println("4.change atm PIN");
			System.out.println("please choose your option");
			int n1=sc.nextInt();
			if(n1==1) 
			{
				System.out.println("your bal is:"+j);
			}
			else if(n1==2)
			{
				System.out.println("Enter amount to withwral");
				int n2=sc.nextInt();
				if(n2>j) {
					System.out.println("insufficient bal");
				}
				System.out.println("please collect your money");
			}
			else if(n1==3) 
			{
				System.out.println("Enter amount to deposite");
				int n3=sc.nextInt();
				System.out.println("now total amount in your account is:"+(j+n3));
			}
			else if(n1==4)
			{
				System.out.println("Enter four digit password to generate new pin");
				int n4=sc.nextInt();
				System.out.println("re login to new acount");
				pin=n4;
				m2();
			}
			else
			{
				System.out.println("incorrect credentials");
			}
			System.out.println("thankyou for visiting ATM");
	}
	else
             {
				System.out.println("incorrect pin");
				System.out.println("please try again");
				System.out.println("thank you for visiting ATM");
				m2();
				}
	}    
	public static void main(String[] args) 
	{
		atm a=new atm();
		a.m2();
	}
	}
		// TODO Auto-generated method stub


