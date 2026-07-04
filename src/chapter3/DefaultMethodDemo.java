package chapter3;

public class DefaultMethodDemo {

	public static void main(String[] str) {
		
		College clg = new College() {};
		clg.display();
	}
}


interface College {
	
	default public void display() {
		
		System.out.println("College Name : Ramakrishna Institute of Engineering and Technology");
		System.out.println("Location : Pachapalayam");
	}
}
