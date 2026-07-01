package chapter3;

import java.util.*;

public class StackDemo {

	public static void main(String[] str) {
		
		Stack st = new Stack();
		
		st.push(100);
		st.push("welcome");
		st.push(12.34);
		st.push("java");
		
		Object ob = st.peek();
		System.out.println(ob);
		st.pop();
		System.out.println(st);
		st.push("collection");
		System.out.println(st);
		System.out.println(st.peek());
		
		Iterator ite = st.iterator();
		while(ite.hasNext()) {
			Object ob1 = ite.next();
			System.out.println(ob1);
		}
		
		for(int i=0; i<st.size(); i++) {
			System.out.println(st.get(i));
		}
		
		Object ob2 = st.firstElement();
		System.out.println(ob2);
		
		int x = st.search("welcome");
		System.out.println(x);
	}
}
