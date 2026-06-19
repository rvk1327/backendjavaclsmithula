package chapter2;

public class HierarchyInheritance {

	public static void main(String[] str) {
		
		HierarchyC hc = new HierarchyC();
		hc.display();
		hc.calc2();
		
		
		HierarchyB hb = new HierarchyB();
		hb.display();
		hb.calc1();		
	
		
	}
}

class HierarchyA {
	
	public void display() {
		System.out.println("Class Hierarchy-A");
	}
}

class HierarchyB extends HierarchyA {
	
	public void calc1() {
		System.out.println(100+200);
	}
}

class HierarchyC extends HierarchyA {
	
	public void calc2() {
		System.out.println(400+500);
	}
}
