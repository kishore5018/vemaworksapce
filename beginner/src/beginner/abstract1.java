package beginner;

abstract class A {
void m1() {
	System.out.println("vema reddy");
}
}
class abstraction extends A{
void m2() {
	System.out.println("sajjala");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstraction a=new abstraction();
a.m1();
a.m2();
	}

}
