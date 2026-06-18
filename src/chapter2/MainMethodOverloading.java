package chapter2;

public class MainMethodOverloading {

	public static void main(String[] str) {
		
		System.out.println("Welcome");
		main();
		main("dsgfsf");
	}
	
	public static void main() {
		
		System.out.println("Hello");
	}
	
	public static void main(String st) {
		
		System.out.println("Java");
	}
}
