package chapter1;

public class ForLoopDemo {

	public static void main(String[] str) {
		
		// Ending point : 5
	   //  Starting point : 1
	  //   Steps : 1
		
		for(int i=1; i<=5; i++) {
			System.out.print(i + "  ");
		}
		System.out.println();		
		
		for(int i=10; i<=15; i++) {
			System.out.print(i+"  ");
		}
		System.out.println();
		
		for(int i=20; i<=40; i+=2) {
			System.out.print(i+"  ");
		}
		System.out.println();
		
		for(int i=5; i>=1; i--) {
			System.out.print(i +"   ");
		}
		System.out.println();
		
		for(char i='A'; i<='Z'; i++) {
			System.out.print(i+"   ");
		}
		System.out.println();
	}
}
