package workouts;

public class SumOfSubArray {

	public static void main(String[] str) {
		
		int[] x = {1,2,3};
		
		for(int i=0; i<x.length; i++) {
			
			int sum = 0;
			
			for(int j=i; j<x.length; j++) {
				
				sum = sum + x[j];
				System.out.println(sum);
			}
		}
	}
}
