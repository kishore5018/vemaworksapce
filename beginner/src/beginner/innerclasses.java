package beginner;

 class demo {
static class a{
	void v() {
		System.out.println("abhi");
		System.out.println("vema");
	}
}
}
class innerclasses{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo i=new demo();
		demo.a a=new demo.a();
		a.v();
	}
}

