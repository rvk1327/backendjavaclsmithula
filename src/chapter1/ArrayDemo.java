package chapter1;

public class ArrayDemo {

	public static void main(String[] str) {
		
		//Method #1
		int[]  x = new int[4];
		
		x[1] = 30;
		x[2] = 50;
		//x[4] = 70;
		
		//Method #2
		int[]  y = {10,20,30,40,50};
		
		//Accessing an array
		// find length of an array
		// array_variable.length
		
		int lenx  = x.length;
		int leny  = y.length;
		
		System.out.println("Length of X : " + lenx);
		System.out.println("Length of Y : " + leny);
		
		System.out.println(y[2]);
		
		System.out.println("Elements of X...");
		
		for(int index = 0; index < lenx; index++) {
			
			int value = x[index];
			System.out.println(value);
		}
		
		System.out.println("Elements of Y ...");
		
		for(int index = 0; index < leny; index++) {
			
			int value = y[index];
			System.out.println(value);
		}
	}
}





