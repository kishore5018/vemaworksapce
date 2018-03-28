package beginner;
class tos{
	String s;
	 String s1;
	 public tos(String s, String s1) {
		super();
		this.s = s;
		this.s1 = s1;
	}	
@Override
	public String toString() {
		return s+" "+s1;
	}
public static void main(String[] args) {
	tos t= new tos("vema", "reddy");
	tos t1= new tos("nagi", "reddy");
	System.out.println(t);
	System.out.println(t1);
}
}