package chapter2;

public class StaticFunctionDemo {

	public static void main(String[] str) {
		
		StaticFunction sf = new StaticFunction();
		sf.display1();
		StaticFunction.display2();
		sf.display2();
	}
}


class StaticFunction {
	
	static int x = 100;
	
	public void display1() {
		
		System.out.println("This is normal function");
	}
	
	public static void display2() {
		
		System.out.println("This is static function " + x);
	}
}
