package beginner;

public class Encapsulation {
String name;
int id;
char ch;
double d;
float f;
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public char getCh() {
	return ch;
}
public void setCh(char ch) {
	this.ch = ch;
}
public double getD() {
	return d;
}
public void setD(double d) {
	this.d = d;
}
public float getF() {
	return f;
}
public void setF(float f) {
	this.f = f;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation e=new Encapsulation();
		e.setName("vemareddy");
		e.setCh('S');
		e.setD(1100.00);
		e.setF(12.00f);
		System.out.println(e.getCh());
		System.out.println(e.getName());
		System.out.println(e.getD());
		System.out.println(e.getF());
	}

}
