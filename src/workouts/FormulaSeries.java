package workouts;

public class FormulaSeries {

	public static void main(String[] str) {
		
		int n=5, x = 10;
		
		// 1+ (x^2+1) +  (x^2+2) +  (x^2+3) + ... +  (x^2+n)
		
		int sqrt = x * x;
		int tot = 0;
		
		for(int i=1; i<=n; i++) {
			
			tot = tot + (sqrt + i);
		}
		
		System.out.println("Result : " + (tot+1));
		
		int res = (int)Math.pow(5, 3);
		
		System.out.println(res);
	}
}
