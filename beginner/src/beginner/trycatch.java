package beginner;

import java.io.IOException;
import java.lang.reflect.Array;
public class trycatch {
public static void main(String[] args) throws IOException {
	int a=10,b=0;
	int a1[]= {2,3,5,7,9};
	String s="vemareddy";
	float f=132.454f;
	try {
		System.out.println(a1[2]);
		System.out.println(a1[3]/a);
		System.out.println(a);
		System.out.println(a/b);
		System.out.println(s);
	}catch(Exception e) {
		System.out.println(e);
	}finally{
		System.out.println("rest of the code");
	}System.out.println(s);
}
}
