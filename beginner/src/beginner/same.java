package beginner;

public class same extends Thread   
{
	public static void main(String[] args) throws InterruptedException 
	{
		int h,m,s;
		for(h=0;h<24;h++) 
		{
			for(m=0;m<=59;m++) 
			{
				for(s=0;s<=59;s++) 
				{
					Thread.sleep(1000);
					System.out.println(h+":"+m+":"+s);
				}
			}
		}
		
	}
}
