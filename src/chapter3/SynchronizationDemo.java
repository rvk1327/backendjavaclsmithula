package chapter3;

public class SynchronizationDemo {

	public static void main(String[] str) {
		
		Mobile m = new Mobile();
		
		Airtel a = new Airtel(m);
		
		Jio j = new Jio(m);
		
		a.start();
		
		j.start();
	}
}


class Airtel extends Thread {
	
	Mobile m2;
	
	public Airtel(Mobile m1) {
		
		m2 = m1;
	}
	
	public void run() {
		
		m2.display(100);
	}
}


class Jio extends Thread {
	
	Mobile m2;
	
	public Jio(Mobile m1) {
		
		m2 = m1;
	}
	
	
	public void run() {
		
		m2.display(50);
	}
}
