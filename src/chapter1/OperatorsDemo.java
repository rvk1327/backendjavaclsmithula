package chapter1;

public class OperatorsDemo {

	public static void main(String[] str) {
		
		//Arithmetic Operators
		System.out.println(5+5);
		System.out.println(5-3);
		System.out.println(5*3);
		System.out.println((float)5/2);
		System.out.println(5%2);
		
		//Comparison Operators
		System.out.println(5>2);
		System.out.println(2<5);
		System.out.println(5<=2);
		System.out.println(5>=2);
		System.out.println(5==2);
		System.out.println(5!=2);
		
		//Logical operator
		System.out.println((5<2) && (2>3));
		System.out.println((5<2) || (2>3));
		
		//Binary Operator
		int x = 10;
		System.out.println(x++);
		System.out.println(--x);
		
		//Ternary operator
		int y = 10;
		System.out.println(y+=5);
		
		//Bitwise operator
		int a = 65, b = 66;
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println(~a);	
	}
}
