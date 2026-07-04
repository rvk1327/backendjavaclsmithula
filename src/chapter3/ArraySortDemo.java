package chapter3;

import java.util.Arrays;

public class ArraySortDemo {

	public static void main(String[] str) {
		
		int[] x = {15,27,17,2,8,50,36,26,55};
		
		Arrays.sort(x);
		
		int start = 0, end = x.length-1;
		
		while(start < end) {
			
			int temp = x[start];
			x[start] = x[end];
			x[end] = temp;
			
			start++;
			end--;
		}
		
		for(int y : x) {
			
			System.out.println(y);
		}
		
		String[] st = {"java","hibernate","spring boot","rest API","react js"};
		
		Arrays.sort(st);
		
		for(String st1 : st) {
			
			System.out.println(st1);
		}
		
		
		
	}
}
