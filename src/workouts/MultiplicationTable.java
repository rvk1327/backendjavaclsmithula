package workouts;

public class MultiplicationTable {

	public static void main(String[] str) {
		
		int n=20;
		final int TABLE_NAME = 17;
		
		for(int i=0; i<=n; i++) {
			
			System.out.println(TABLE_NAME + " * " + i + " = " + (TABLE_NAME*i));
		}
	}
}
