package beginner;
import java.io.*;
 class studentdetails implements Serializable{
int id;
String name;
int age;
	public studentdetails(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
}
class student{
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		studentdetails s=new studentdetails(11,"VEMA REDDY",25);
		FileOutputStream fis=new FileOutputStream("C:\\SVR\\abcd.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fis);
		FileInputStream fis1=new FileInputStream("C:\\SVR\\abcd.txt");
		ObjectInputStream oos1=new ObjectInputStream(fis1);
		oos.writeObject(s);
		oos1.readObject();
		oos.close();
		System.out.println(s);
	}
}
