package workouts;

public class Pattern2 {

	public static void main(String[] str) {
		
		final int ROW = 4;
		final int COL  = 4;
		
		for(int i=1; i <=ROW; i++) {
			
			for(int j=i; j<=COL; j++) {
				
				System.out.print(" * ");
			}
			
			System.out.println();
		}
	}
}
