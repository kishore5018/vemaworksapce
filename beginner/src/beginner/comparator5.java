package beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class comparator5
{
	int id;
	String name;
	String book;
comparator5(int id,String name,String book)
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
comparator5 c5=new comparator5(112,"abhinav","java");
comparator5 c6=new comparator5(111,"vema","dotnet");
comparator5 c7=new comparator5(110,"kiran","lime");
ArrayList<comparator5> al=new ArrayList<>();
al.add(c5);
al.add(c6);
al.add(c7);
Comparator<comparator5> idc=new Comparator<comparator5>()
{
	@Override
	public int compare(comparator5 o1, comparator5 o2) 
	{
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}
};
	Collections.sort(al,idc);
  System.out.println(al.toString());
  Comparator<comparator5> name=new Comparator<comparator5>()
  {
  	@Override
  	public int compare(comparator5 o1, comparator5 o2) 
  	{
  		// TODO Auto-generated method stub
  		return o1.name.compareTo(o2.name);
  	}
  };
  	Collections.sort(al,name);
    System.out.println(al.toString());

}

 }
