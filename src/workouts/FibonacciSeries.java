package workouts;

public class FibonacciSeries {

	public static void main(String[] str) {
		
		int a = 0, b = 1, c = 1 , d = 0;
		
		System.out.print(a+ "   " + b + "   " + c + "   ");
		
		int n=5;
		
		for(int i=1; i<=n; i++) {
			
			d = a+b+c;
			System.out.print(d + "   ");
			
			a = b;
			b = c;
			c = d;
		}
	}
}
