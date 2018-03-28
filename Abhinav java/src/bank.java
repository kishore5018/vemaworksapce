import java.time.LocalTime;
import java.util.Scanner; 
class Bank
{	
	Scanner sc=new Scanner(System.in);
	String s;
	String a="aaaa";
	void m1()
	{
		System.out.println("create pin number");
		String s1 =sc.nextLine();
		s=s1;		
		if(s.length()==a.length())
		{			
		m(1);
		}
		else
			System.out.println("PLEASE CHOOSE FOUR NUMBERS");
			m1();
	}
void m(int count)
{	
if(count<4)
{ 
int i=40000;
System.out.println("enter your created pin number:");
String o=sc.nextLine();
if(s.equals(o))
{
	LocalTime time = LocalTime.now();   
System.out.println("you are logged time is"+" "+time);
System.out.println("1.account balance");
System.out.println("2.cashwith drawl");
System.out.println("3.add money");
System.out.println("please enter your option");
int j=sc.nextInt();
switch(j)
{
case 1:System.out.println("your balance is:"+i+"rs");
break;
case 2:System.out.println("your balance is:"+i+"rs");
	System.out.println("how much money you want to withdraw"); 
int k=sc.nextInt();
if(k>i)
{
System.out.println("insufficinet bal");
}
else
{
System.out.println("withdrawl amount is:"+k+"rs");
System.out.println("available amount is:"+(i-k)+"rs");
}
break;	

case 3:
	try
	{
System.out.println("your balance is:"+i+"rs");
System.out.println("How much money you want to add");
int k1=sc.nextInt();
System.out.println("your added amount is:"+k1+"rs");
System.out.println("your account balance is now:"+(i+k1)+"rs");
}
catch(Exception aw)
{
	System.out.println("minmum balance you can add 1lakh");
}
break;
default:System.out.println("please chose correct option");
}
m2();
}
else 
{
System.out.println("you entered wrong pin");
if(count==3)
{
System.out.println("your account is declined");
m2();
}
else
{
count++;
m(count);
}
}
}
}
void m2()
{
	System.out.println("thank you for visting Abhinav Bank...:-)");	
	System.exit(1);
}	
public static void main(String args[])
{
Bank b=new Bank();
b.m1();
}
}