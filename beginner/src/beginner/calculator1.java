package beginner;

import java.util.Scanner;
public class calculator1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i,j,result;
		Scanner s=new Scanner(System.in);
		i=s.nextDouble();
		char c=s.next().charAt(0);
		switch(c){
		case '+':
			break;
		case '-':
			break;
		case '*':
			break;
		case '/':
			break;
			default:System.out.println("invalid opetation");
				break;
		}
		j=s.nextDouble();
		System.out.println(i+" "+c+" "+j);
	}

}
