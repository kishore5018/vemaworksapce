package beginner;
import java.io.*;
public class DataOtput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fis=new FileOutputStream("D:\\svr2.txt");
DataOutputStream dis=new DataOutputStream(fis);
dis.writeChars("sajjala vemareddy");
dis.close();
System.out.print("success");
	}

}
