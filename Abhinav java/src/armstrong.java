
public class armstrong 
{
public static void main(String args[])
{
	int n=152;
    int temp=n;
    int l=0,d=0;
    while(temp>=1)
    {
    int k=temp%10;
     d=d+(k*k*k);
     temp=temp/10;
    }
    System.out.println(d);
    if(d==n)
    {
    	System.out.println("given number is armstrong");
    }
    else
    {
    	System.out.println("given number is not armstrong");
    }
}
}
