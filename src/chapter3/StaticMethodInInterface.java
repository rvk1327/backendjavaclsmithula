package chapter3;

public class StaticMethodInInterface {

	public static void main(String[] str) {
		
		Bus.busInfo();
	}
}

interface Bus {
	
	public static void busInfo() {
		
		System.out.println("Bus N0 : 70");
		System.out.println("From : Maruthamalai");
		System.out.println("To : Gandhipuram");
	}
}
