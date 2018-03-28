public class palindrome
{
		public static void main(String args[])
		{
			int n=232;
		    int temp=n;
		    int d=0;
		    while(temp>=1)
		    {
		    int k=temp%10;
		    d=(d*10)+k;
		    temp=temp/10;
		    }
		    if(d==n)
		    {
		    	System.out.println("given number is palindrome");
		    }
		    else
		    {
		    	System.out.println("given number is not palindrome");
		    }
		}
		}