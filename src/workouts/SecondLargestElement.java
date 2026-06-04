package workouts;

public class SecondLargestElement {

	public static void main(String[] str) {
		
		int[] x = {26,23,85,57,87};
		
		int largest = 0;
		int second = 0;
		
		for(int i=0; i<x.length; i++) {
			
			if(x[i] > largest) {
				
				second = largest;
				largest = x[i];
			
			}else if((x[i] > second) && (x[i] != largest)) {
				second = x[i];
			}
		}
		
		System.out.println(second);
		System.out.println(largest);
	}
}
