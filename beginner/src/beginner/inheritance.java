package beginner;
class vema{
	void v3() {
		int a=10,b=20;
		System.out.println("vemareddy");
		System.out.println("sum is:"+(a+b));
		System.out.println("product is:"+(a*b));
	}
}
 class inheritance1 extends vema {
	void v2() {
		System.out.println("sajjala");
	}
	}
 class inheritance2 extends inheritance1{
		void v1() {
			System.out.println("sajjala11");
		}
		}
 class inheritance extends inheritance2{
		final void v() {
			System.out.println("sajjala12");
		}
public static void main(String[] args) {
	// TODO Auto-generated method stub
inheritance i=new inheritance();
i.v();
i.v1();
 }
 }