package chapter3;

public class MultipleCatchStatement {

	public static void main(String[] str) {
		
		int[] x = new int[3];
		
		try {
			

			int value = 0/100;
			System.out.println(value);
			
			x[0] = 100;
			x[1] = 200;
			x[2] = 300;
			x[3] = 400;
			
		
		}catch(ArithmeticException obj) {
			obj.printStackTrace();
		
		}catch(ArrayIndexOutOfBoundsException obj) {
			obj.printStackTrace();
		
		}catch(Exception obj) {
			obj.printStackTrace();
		}
		
 		for(int i=0; i<x.length; i++) {
			System.out.println(x[i]);
		}
			
	}
}
