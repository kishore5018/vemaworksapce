package arrays;
public class calling 
{
	void m1() 
	{
		class fun
		{
			void m2()
			{
				System.out.println("vema");
			}
		}
		fun f=new fun();
		f.m2();
	}
public static void main(String[] args) {
	calling c=new calling();
	c.m1();
	
}
}
