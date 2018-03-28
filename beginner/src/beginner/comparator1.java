package beginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class comparator2{
	int age;
	int id;
	String name;
	public comparator2(int age, int id, String name) {
		super();
		this.age = age;
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "comparator2 [age=" + age + ", id=" + id + ", name=" + name + "]";
	}
}
class nameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		comparator2 c=(comparator2)o1;
		comparator2 c1=(comparator2)o2;
		return c.name.compareTo(c1.name);
	}
	
}
public class comparator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<comparator2> al=new ArrayList<>();
al.add(new comparator2(112,21,"vema"));
al.add(new comparator2(4,2,"ema"));
al.add(new comparator2(11,10,"ma"));
Collections.sort(al,new nameComparator());
Iterator<comparator2> itr=al.iterator();
while(itr.hasNext()) {
	comparator2 cc2 =(comparator2)itr.next();
	System.out.println(cc2.age+" "+cc2.id+" "+cc2.name);
}
	}

}
