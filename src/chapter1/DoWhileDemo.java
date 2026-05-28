package chapter1;

public class DoWhileDemo {

	public static void main(String[] str) {
		
		int x = 30;
		
		do {
			
			System.out.println(x); // 30
			
			x = x  + 2;
		
		}while(x <= 20);
	}
}

/*
		Do while does not check the condition at very first time
*/