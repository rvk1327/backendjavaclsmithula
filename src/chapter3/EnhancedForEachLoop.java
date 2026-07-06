package chapter3;

import java.util.*;

public class EnhancedForEachLoop {

	public static void main(String[] str) {
		
		List<String> lst = new ArrayList<String>();
		
		lst.add("Java");
		lst.add("Spring");
		lst.add("Hibernate");
		
		System.out.println("Normal For Loop");		
		for(int i=0; i<lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		
		System.out.println("Enhanced For Loop");
		for(String lst1 : lst) {
			System.out.println(lst1);
		}
		
		System.out.println("Enhanced For Each Loop");
		lst.forEach(lst1 -> System.out.println(lst1));
		
		System.out.println("Another Method for Enhanced For Each Loop");
		lst.forEach(System.out :: println);
		
		
	}
}
