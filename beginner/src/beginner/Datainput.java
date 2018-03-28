package beginner;
import java.io.*;
public class Datainput {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("D:\\svr3.txt");
		DataInputStream dis=new DataInputStream(fis);
		int i=fis.available();
		byte[] ary = new byte[i];
		dis.read(ary);
		for(byte b:ary) {
			char ch=(char)b;
			System.out.print(ch);
		}
		
	}

}
