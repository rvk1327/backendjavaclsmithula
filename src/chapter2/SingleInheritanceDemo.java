package chapter2;

public class SingleInheritanceDemo {

	public static void main(String[] str) {
	
		SingleB sb = new SingleB();
		System.out.println(sb.stname);
		sb.displayName();
		SingleB.showStudent();
		sb.additionalInfo();
	}
}


class SingleA {
	
	String stname  = "abc";
	
	public SingleA(int x) {
		System.out.println("Class Single-A");
		System.out.println("Value : " + x);
	}
	
	public void displayName() {
		System.out.println("Welcome " + stname);
	}
	
	public static void showStudent() {
		System.out.println("Roll No : ST_1");
		System.out.println("Email ID : abc@gmail.com");
	}
}


class SingleB extends SingleA {
	
	public SingleB() {
		super(100);
		System.out.println("Class Single-B");
	}
	
	public void additionalInfo() {
		System.out.println("Rank : 1");
		System.out.println("Mark : 95.78");
	}
}

