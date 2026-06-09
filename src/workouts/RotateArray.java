package workouts;

public class RotateArray {

	public static void main(String[] str) {
		
		int[] x = {1,2,3,4,5,6,7};
		
		reverse(x,0,x.length-1); //reverse all element
		
		int y = 3;
		
		reverse(x,0,y); //reverse from 0 to position (y)
		
		reverse(x,y+1, x.length-1); //reverse from position (y) to end of an array
		
		
		for(int i=0; i<x.length; i++) {
			
			System.out.print(x[i]+"  ");
		}
		
		
	}
	
	public static void reverse(int[] x, int start, int end) {
		
		while(start < end) {
			
			int temp = x[start];
			
			x[start] = x[end];
			
			x[end] = temp;
			
			start++;
			
			end--;
		}
	}
}
