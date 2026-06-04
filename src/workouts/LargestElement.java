package workouts;

public class LargestElement {

	public static void main(String[] str) {
		
		int[] x = {26,23,85,57,87};  //
		
		int max_value = x[0];
		
		for(int i=1; i<x.length; i++) {
			
			if(x[i] > max_value) {
				
				max_value = x[i];
			}
		}
		
		System.out.println("Max Value : " + max_value);
	}
}
