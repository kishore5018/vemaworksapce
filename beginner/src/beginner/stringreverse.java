package beginner;
class string1{
	void m1() {
		String s1="PATHAMAGULURU";
		//System.out.println(s1.length());
		StringBuilder sb=new StringBuilder();
		sb.append(s1);
		sb=sb.reverse();
		for(int i=0;i<sb.length();i++) {
			System.out.println(sb.charAt(i));
		}
	}
}
public class stringreverse extends string1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringreverse sr=new stringreverse();
		sr.m1();
String s="SAJJALA VEMAREDDY";
String s1="NAGIREDDY";
char ch1[]=s1.toCharArray();
char ch[]=s.toCharArray();
for(int i1=s1.length()-1;i1>=0;i1--)
System.out.print(ch1[i1]);
System.out.println(s.length());
for(int i=s.length()-1;i>=0;i--)
	System.out.print(ch[i]);

	}

}
