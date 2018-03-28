package arrays;
import java.util.Scanner;
public class array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= new int[5][5];
int b[]= {5,3,2,1};
System.out.println(b.getClass().getName());
System.out.println(a.length);
Scanner s=new Scanner(System.in);
for(int i=0;i<a.length;i++) {
	System.out.println("enter i values");
	a[i][i]=s.nextInt();
}for(int[] a1:a) {
	System.out.println(a1);
}
	}
}
