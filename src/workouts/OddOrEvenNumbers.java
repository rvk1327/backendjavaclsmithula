package workouts;

public class OddOrEvenNumbers {

	public static void main(String[] str) {
		
		int[] x = {15,11,48,68,42,30,15,17,62,63};
		
		for(int i=0; i<x.length; i++) {
			
			if(x[i] %2 ==0) {
				
				System.out.println(x[i]);
			}
		}
	}
}
