import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serial1 
{
public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException
{	
	ObjectInputStream out=new ObjectInputStream(new FileInputStream("d:/ab.txt"));
	serial s=(serial) out.readObject();
	System.out.println(s.id+" "+s.name);
}
}
