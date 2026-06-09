package workouts;

public class RemoveDuplicates {

	public static void main(String[] str) {
		
		int[] x = {1,1,2,2,3,4,4};
		
		//1,2,3,4
		
		int pos = 0;
		
		for(int i=1; i<x.length; i++) {
			
			if(x[pos] != x[i]) {
				
				pos++;
				x[pos] = x[i];			
				
			}
			
		}
		
		
		for(int i=0; i<x.length; i++) {
			
			System.out.println(x[i]);
		}
		
		
	}
}
