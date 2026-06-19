package chapter2;

public class MultiLevelInheritance {

	public static void main(String[] str) {
		
		MultiC mc = new MultiC();
		mc.disp3();
		mc.disp2();
		mc.disp1();
	}
}

class MultiA {
	
	public void disp1() {
		System.out.println("Multi-A");
	}
}

class MultiB extends MultiA {
	
	public void disp2() {
		System.out.println("Multi-B");
	}
}

class MultiC extends MultiB {
	
	public void disp3() {
		System.out.println("Multi-C");
	}
}
