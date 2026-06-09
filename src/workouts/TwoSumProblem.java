package workouts;

public class TwoSumProblem {

	public static void main(String[] str) {
		
		int[] x = {7,2,8,1,3,2,6};
		
		int target = 9;  // (7,2) , (8,1), (6,3)
		
		int start = 0, end = x.length-1;
		
		while(start < end) {
			
			int sum = x[start] + x[end];
			
			if(sum == target) {					
				System.out.println(" ( " + x[start] + " , " + x[end] +" ) ");
				break;
			
			}else if(sum < target) {
				start++;
			}else {
				end--;
			}		
		}
	}
}
