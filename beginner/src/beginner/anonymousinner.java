package beginner;
class anonymousinner{
	 int j=10;
	void m1() {
		class anonymousinnerlocal 
		{
			void m2() 
			{
			int i=1;
			String s="vema";
			System.out.println(i+" "+s);
			System.out.println(j);
			}
		}
		anonymousinnerlocal t=new anonymousinnerlocal();
		t.m2();
	}
	public static void main(String[] args) {
		anonymousinner t=new anonymousinner();
		t.m1();
	}
}
