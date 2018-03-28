import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparator 
{
int id;
String name;
comparator(int id,String name)
{
	this.id=id;
	this.name=name;
}

@Override
public String toString() {
	return id+name;
}

public static void main(String[] args) 
{
	comparator c=new comparator(11,"abhinav");
	comparator c1=new comparator(15,"vema reddy");
	comparator c2=new comparator(14,"khareem");
	ArrayList<comparator> ac=new ArrayList<>();
	Comparator<comparator> aac=new Comparator<comparator>()
			{
		@Override
			
				public int compare(comparator o1, comparator o2) {
					// TODO Auto-generated method stub
					return o1.id-o2.id;
				}
			};
			
	Collections.sort(ac,aac);
	System.out.println(ac.toString());
}



}
