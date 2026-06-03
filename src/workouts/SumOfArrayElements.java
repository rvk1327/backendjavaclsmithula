package workouts;

public class SumOfArrayElements {

	public static void main(String[] str) {
		
		int[] y = {10,20,30};
		
		//output : 60
		int sum = 0;
		
		for(int i=0; i<y.length; i++) {
			
			sum = sum + y[i];
		}
		
		System.out.println(sum);
	}
}
