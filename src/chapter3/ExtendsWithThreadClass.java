package chapter3;

public class ExtendsWithThreadClass {

	public static void main(String[] str) {
		
		ExtThread e1 = new ExtThread(100);
		e1.start(); // 101 102 103 104 105
		
		ExtThread e2 = new ExtThread(50);
		e2.start(); //51 52 53 54 55
	}
}



class ExtThread extends Thread {
	
	int x;
	
	public ExtThread(int x1) {
		x  = x1;
	}
	
	public void run() {
		
		for(int i=1; i<=5; i++) {
			
			System.out.println(x+i); // 101 102 103 104 105
			
			try {
				
				Thread.sleep(3000);
			
			}catch(Exception obj) {
				obj.printStackTrace();
			}
		}
	}
}








