package chapter2;

public class ConstructorOverloading {

	public static void main(String[] str) {
		
		Bus b1 = new Bus("SRT");
		Bus b2 = new Bus(70);
	}
}

class Bus {
	
	public Bus(String bus_name) {
		
		System.out.println("Bus Name : " + bus_name);
	}
	
	public Bus(int root_no) {
		
		System.out.println("Root No : " + root_no);
	}
}
