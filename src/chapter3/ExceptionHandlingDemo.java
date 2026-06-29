package chapter3;

public class ExceptionHandlingDemo {

	public static void main(String[] str) {
		
		System.out.println("Welcome");
		int[] x = new int[3];
		
		try {
			
			x[0] = 100;
			x[1] = 200;
			x[2] = 300;
			x[3] = 400; //catch and throw
		
		}catch(Exception obj) {
		
			obj.printStackTrace(); // print runtime error message
		
		}finally {
			
			System.out.println("This is finally block");
		}
		
		for(int i=0; i<x.length; i++) {
			System.out.println(x[i]);
		}
		
		System.out.println("Thank you");
	}
	
}
