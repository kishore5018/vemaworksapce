import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serial implements Serializable 
{
int id;
String name;
void m(int id,String name)
{
	this.id=id;
	this.name=name;
}
public static void main(String args[]) throws IOException
{
	serial s=new serial();
	s.m(11,"abhinav");
	s.m(12, "kiran");
	FileOutputStream fos=new FileOutputStream("d:/ab.txt");
	ObjectOutputStream out=new ObjectOutputStream(fos);
	out.writeObject(s);
	out.flush();
	System.out.println("success");
}
}
