package beginner;

public class overloading {
	overloading(int a,String name) {
	System.out.println(a);
	System.out.println(name);
}
 overloading(int a,int b,float salary) {
	System.out.println(a);
	System.out.println(b);
	System.out.println(salary);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading o=new overloading(5,"vema");
		overloading o1=new overloading(1,2,1000.3f);
	}

}
