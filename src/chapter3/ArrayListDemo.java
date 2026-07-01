package chapter3;

import java.util.*;

import pack1.Sample1;

public class ArrayListDemo {

	public static void main(String[] str) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add("welcome");
		ar.add(12.34);
		ar.add(true);
		Sample1 s1 = new Sample1();
		ar.add(s1);
		
		
		ar.remove(12.34);
		
		System.out.println(ar);
		ar.add(2,"arraylist");
		System.out.println(ar);
		
		/*ar.clear();
		System.out.println(ar);
		System.out.println(ar.isEmpty()); */
		
		ArrayList ar1 = (ArrayList)ar.clone();
		System.out.println(ar1);
		
		System.out.println(ar.contains("hello"));
		//ar.ensureCapacity(20);
		Object ob1 = ar.get(1);
		System.out.println(ob1);
		
		int pos = ar.indexOf("welcome");
		System.out.println(pos);
		
		Iterator ite = ar.iterator();
		while(ite.hasNext()) { //check element exists			
			Object ob = ite.next(); //get element from iterator
			System.out.println(ob);
		}
		
		int length = ar.size();
		System.out.println(length);
		
		for(int i=0; i<ar.size(); i++) {
			Object ob = ar.get(i);
			System.out.println(ob);
		}
		
	}
}
