import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class compemp implements Comparable<compemp> 
{
int id;
String name;
String role;
compemp(int id,String name,String role)
{
	this.id=id;
	this.name=name;
	this.role=role;
}


@Override
public String toString() {
	return "compemp [id=" + id + ", name=" + name + ", role=" + role + "]";
}


@SuppressWarnings("unchecked")
public static void main(String args[])
{
	compemp c1=new compemp(15,"abhinav","java");
	compemp c2=new compemp(12,"vema","dotnet");
	compemp c3=new compemp(14,"kareem","testing");
	ArrayList<compemp> t=new ArrayList<>();
	t.add(c1);
	t.add(c2);
	t.add(c3);
    Collections.sort(t);
	System.out.println(t);
}
@Override
public int compareTo(compemp o) {
	// TODO Auto-generated method stub
	return o.id-this.id;
}

}


