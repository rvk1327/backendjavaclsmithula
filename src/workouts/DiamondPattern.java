package workouts;

public class DiamondPattern {

	public static void main(String[] str) {
		
		final int N = 5;
		
		//Row
		for(int i=1; i<=N; i++) {
			
			//Column
			//Print spaces
			for(int j=i; j<N; j++) {
				
				System.out.print(" ");
			}
			
			//print stars
			
			for(int j=1;  j<= (2*i-1); j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
