package beginner;
class Dynamicbinding 
{
public void m() 
{
	System.out.println("dinamicbinding1");
}
}
class Dynamic1 extends Dynamicbinding
{
	public void m() 
	{
	
		System.out.println("Dynamic binding 2");
	}
	public static void main(String[] args)
	{
		
	Dynamicbinding d=new Dynamic1();
	Dynamicbinding d1=new Dynamicbinding();
	d.m();
	d1.m();
	}
}