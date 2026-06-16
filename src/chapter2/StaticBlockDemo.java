package chapter2;

public class StaticBlockDemo {

	static int x = 100;
	public static void main(String[] str) {
		
		System.out.println("Welcome " + x);
	}
	
	static {
		
		System.out.println("Hello " + x);
	}
	
	static {
		
		System.out.println("Java");
	}
}
