import java.util.*;
public class timebomb extends Thread 
{
	void m(int i) throws InterruptedException
	{
	while(i>0)
	{
	 	Thread.sleep(500);	
	 	i--;
	}
	System.out.println("boom");
	}
	
public static void main(String args[]) throws InterruptedException
{
	timebomb tb=new timebomb();
	System.out.println("enter seconds to start time");
	Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
	System.out.println("seconds started");
	tb.m(k);	
}
}
