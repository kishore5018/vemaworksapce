package arrays;

public class matrix {
void m1(int c,int b) {
	System.out.println(c);
	System.out.println(b);
}
void m2(int b,float f) {
	System.out.println(b);
	System.out.println(f);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  a[][]= {{1,2,3},{4,5,6},{7,8,9}};
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a[i].length;j++) {
		System.out.println(a[i][j]+" ");
	}
	System.out.println();
}
int  c=10,b=20;
float f=10.0f;
matrix m=new matrix();
m.m1(c, b);
m.m2(b, f);
	}
	

}
