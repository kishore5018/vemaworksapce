package beginner;
import java.io.*;
public class fileinput {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("D:\\svr1.txt");
BufferedInputStream bis=new BufferedInputStream(fis);
int i=bis.read();
while((i=bis.read())!=-1) {
	System.out.print((char)i);
}
fis.close();
	}
}
