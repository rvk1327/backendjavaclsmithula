package chapter3;

import java.util.*;

public class EnhancedForLoopDemo {

	public static void main(String[] str) {
		
		int[] x = {10,20,30,40,50};
		
		//Normal for loop
		
		for(int i=0; i<x.length; i++) {
			System.out.println(x[i]);
		}
		
		for(int y : x) {
			System.out.println(y);
		}
		
		List lst = new ArrayList();
		lst.add(100);
		lst.add("welcome");
		lst.add(12.34);
		
		for(int i=0; i<lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		
		for(Object obj : lst) {
			
			System.out.println(obj);
		}
	}
}








