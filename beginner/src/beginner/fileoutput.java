package beginner;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileoutput {

	public static void main(String[] args) throws IOException {	// TODO Auto-generated method stub
FileOutputStream fos=new FileOutputStream("D:\\svr1.txt");
BufferedOutputStream bos=new BufferedOutputStream(fos);
String s="wellcome to java";
String s1="vemaeddy";
byte b[]=s.getBytes();
byte b1[]=s1.getBytes();
bos.write(b);
bos.write(b1);
bos.flush();
fos.close();
System.out.print("success");
	}
}
