package workouts;

public class Pattern1 {

	public static void main(String[] str) {
		
		final int ROW= 4;
		final int COL = 4;
		
		for(int i=1; i<=ROW; i++) {
			
			for(int j=1; j<=COL; j++) {
				
				System.out.print(" * ");
			}
			
			System.out.println();
		}
	}
}
