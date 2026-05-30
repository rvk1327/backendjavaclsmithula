package workouts;

public class BorderPattern {

	public static void main(String[] str) {
		
		int n = 10;
		
		for(int r=1; r<=n; r++) {
			
			for(int c=1; c<=n; c++) {
				
				if((r==1) || (r==n) || (c==1) || (c==n)) {
					
					System.out.print(" * ");
				
				}else {
					
					System.out.print("   ");
				}
			}
			
			System.out.println();
		}
	}
}
