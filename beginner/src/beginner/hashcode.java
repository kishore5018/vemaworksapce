package beginner;

public class hashcode {
int i=10;
int j=50;
String str="reddy";
String str1="reddy";

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + i;
	result = prime * result + j;
	result = prime * result + ((str == null) ? 0 : str.hashCode());
	result = prime * result + ((str1 == null) ? 0 : str1.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	hashcode other = (hashcode) obj;
	if (i != other.i)
		return false;
	if (j != other.j)
		return false;
	if (str == null) {
		if (other.str != null)
			return false;
	} else if (!str.equals(other.str))
		return false;
	if (str1 == null) {
		if (other.str1 != null)
			return false;
	} else if (!str1.equals(other.str1))
		return false;
	return true;
}

public static void main(String[] args) 
{
	String s="vema";
	String s1="vema";
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());
	hashcode s3=new hashcode();
	hashcode s4=new hashcode();
	hashcode str=new hashcode();
	hashcode str1=new hashcode();
	System.out.println(s3.i);
	System.out.println(s4.j);
	System.out.println(s3.hashCode());
	System.out.println(s4.hashCode());
	System.out.println(str.hashCode());
	System.out.println(str1.hashCode());
}
}