package workouts;

public class ReverseElement {

	public static void main(String[] str) {
		
		int[] x = {1,2,3,4,5};
		
		// 5,4,3,2,1
		
		for(int i=x.length-1; i>=0; i--) {
			
			System.out.println(x[i]);
		}
		
		for(int i=0; i<x.length; i++) {
			
			System.out.println(x[i]);
		}
		
		int start = 0;
		int end = x.length-1;
		
		while(start < end) {
			
			int temp = x[start];
			x[start] = x[end];
			x[end] = temp;
			start++;
			end--;
		}
		
	for(int i=0; i<x.length; i++) {
			
			System.out.println(x[i]);
		}
		
		
		
	}
}
