package beginner;
import java.util.*;
public class calculator {
	public static void main() {
		// TODO Auto-generated method stub
double i,j,result;
Scanner s=new Scanner(System.in);
System.out.println("enter first number");
i=s.nextDouble();
System.out.println("enter second number");
j=s.nextDouble();
System.out.println("enter an operator(+,-,*,/,%)");
char operator=s.next().charAt(0);
switch(operator) {
case '+':
	result=i+j;
break;
case '-':result=i-j;
break;
case '*':result=i*j;
break;
case '/':result=i/j;
break;
case '%':result=i%j;
break;
default:
	System.out.println("invalid operator");
	return;
}
System.out.println(i+""+operator+" "+j+"="+result);
}
	public static void main(String[] args) {
		calculator c=new calculator();
		c.main();
	}
	}


