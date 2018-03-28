package beginner;
import java.io.*;
public class Throws {
	void details() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("enter student name");
		String sname=br.readLine();
		System.out.println(sname);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Throws t=new Throws();
t.details();
	}

}
