package beginner;

import java.util.ArrayList;
import java.util.Collections;

 class comparable2 implements Comparable<comparable2> {
int id;
String name;
int age;
	public comparable2(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
	@Override
	public String toString() {
		return "comparable2 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(comparable2 o) {
		// TODO Auto-generated method stub
		return  id-o.id;
	}
	
	
}
	class comparable1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		comparable2 c=new comparable2(113,"abhinav",25);
		comparable2 c1=new comparable2(111,"kiran",21);
		comparable2 c2=new comparable2(156,"bhargav",5);
		ArrayList<comparable2> al= new ArrayList<>();
		al.add(c);
		al.add(c1);
		al.add(c2);
		Collections.sort(al);
		for(comparable2 cc:al) {
			System.out.println(cc.age+" "+cc.name+" "+cc.id);
		}
	}

}

