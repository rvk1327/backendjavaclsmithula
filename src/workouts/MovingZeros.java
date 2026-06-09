package workouts;

public class MovingZeros {

	public static void main(String[] str) {
		
		int[] x = {95,0,78,0,0,95,56,28,0,47,0,59,98,96};
		
		int[] y = new int[x.length];
		
		int pos = 0;
		
		for(int i=0; i<x.length; i++) {
			
			if(x[i] != 0) {
				
				y[pos] = x[i];
				
				pos++;
			}
		}
		
		for(int i=0; i<y.length; i++) {
			
			System.out.print(y[i] + " ");
		}
	}
}
