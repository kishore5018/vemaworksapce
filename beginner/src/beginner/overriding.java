package beginner;
class over{
	int rateofintrest()
	{
		return 0;
	}
}
class SBI extends over
{
	int rateofintrest()
	{
		return 7;
	}
}
class ICICI extends SBI
{
	int rateofintrest() 
	{
		return 8;
	}
}
	class AXIS extends ICICI
	{
		int rateofintrest() 
		{
			return 9;
		}
	}
class overriding{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AXIS a=new AXIS();
		ICICI i=new ICICI();
		SBI s=new SBI();
		System.out.println("rate of interst:"+a.rateofintrest());
		System.out.println("rate of interst:"+i.rateofintrest());
		System.out.println("rate of interst:"+a.rateofintrest());
		
	}
}