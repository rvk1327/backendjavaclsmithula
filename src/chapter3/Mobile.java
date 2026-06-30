package chapter3;

public class Mobile {

	synchronized void display(int x) {
		
		for(int i=1; i<=5; i++) {
			
			System.out.println(x+i);
			
			try {
				
				Thread.sleep(3000);
				
			}catch(Exception obj) {
				
				obj.printStackTrace();
			}
		}
	}
}
