package workouts;

public class SubArrayDemo {

	public static void main(String[] str) {
		
		int[] x = {1,2,3};
		
		for(int i=0; i<x.length; i++) {
			
			for(int j=i; j<x.length; j++) {
				
				//print sub array
				for(int k=i; k<=j; k++) {
					
					System.out.print(x[k] +" ");
				}
				
				System.out.println();
			}
		}
	}
}
