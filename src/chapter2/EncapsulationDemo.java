package chapter2;

public class EncapsulationDemo {
 
	public static void main(String[] str) {
		
		LooselyCoupled lc = new LooselyCoupled();
		lc.display2();
		System.out.println(lc.stname);
		lc.display1();
		
		TightlyCoupled tc = new TightlyCoupled();
		//tc.func1();
		tc.func2();
	}
}


class TightlyCoupled {
	
	String stname;
	
	public void func1() {
		stname = "vijay";
	}
	
	public void func2() {
		System.out.println("Hi " + stname);
	}
}



class LooselyCoupled {
	
	String stname = "Mithula";
	
	public void display1() {
		System.out.println("Welcome " + stname);
	}
	
	public void display2() {
		System.out.println("Hello " + stname);
	}
}