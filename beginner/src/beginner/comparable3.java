package beginner;

import java.util.ArrayList;
import java.util.Collections;

class comparable3 implements Comparable<comparable3>
{
		
		int id;
		String name;
		String book;
	comparable3(int id,String name,String book)
	{
		this.id=id;
		this.name=name;
		this.book=book;
	}
	public String toString() {
		return "comparator5 [id=" + id + ", name=" + name + ", book=" + book + "]";
}
	public static void main(String args[])
	{
		comparable3 cc=new comparable3(12,"vemareddy","java");
		comparable3 cc1=new comparable3(11,"abhinav","dotnet");
		comparable3 cc2=new comparable3(10,"kalam","testing");
		ArrayList<comparable3> al= new ArrayList<>();
		al.add(cc);
		al.add(cc1);
		al.add(cc2);
		Collections.sort(al);
		System.out.println(al.toString());
		}	
	
	public int compareTo(comparable3 o) {
		// TODO Auto-generated method stub
		return book.compareTo(o.book);
	}	
}

