
public class shortpalindrome1 
{
public static void main(String args[])
{
String a="praveen";
String string1 = "";
String string2="";
String string3="null";
int a1=a.length();
a1=a1-1;
int d=a1;
while(0<=a1)
{
	while(0<=a1)
	{
	if(a1>=1)
	{
	char ch=a.charAt(a1);
	string1 = Character.toString(ch);
	string3=string2.concat(string1);
	string2=string3;
	a1=a1--;
	}
	}
    if(d>a1)
    {
    	char ch=a.charAt(a1);
    	string1 = Character.toString(ch);
    	string3=string2.concat(string1);
    	string2=string3;
    	a1++;
    }
}
System.out.println(string3);
}
}

