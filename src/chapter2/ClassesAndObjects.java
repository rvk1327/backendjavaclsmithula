package chapter2;

public class ClassesAndObjects {

	public static void main(String[] str) {
		
		//Method #1
		Hello h1 = new Hello();
		
		//Method #2
		Hello h2;
		h2 = new Hello();
		
		//Method #3
		Hello h3 = h2;
		
		//Access class variables and functions
		int valuex = h1.x;
		int valuey = h1.y;
		
		System.out.println(valuex);
		System.out.println(valuey);
		
		h1.calc1(); // 300
		h1.calc2();
		
		ClassesAndObjects obj = new ClassesAndObjects();
		obj.display();
		obj.display1();
	}
	
	public void display() {
		
		System.out.println("class ClassesAndObjects");
	}
	
	public void display1() {
		
		display();
	}
	
}

//class ClassesAndObjects end


class Hello {
	
	//class variables
	int x = 100, y = 200;
	
	//Functions
	public void calc1() {
		
		System.out.println(x+y); //300
		x = 200;
		
	}
	
	//calc1() : 300
	//calc2() : 
	
	public void calc2() {
		
		int z = 300; //local variable
		System.out.println(x+y+z);
	}
	
	/*int b;
	Thread t2;
	public void calc3(Thread t1) {
		
		b = 100;
		t2 = new Thread();
		
	} */
	
}
