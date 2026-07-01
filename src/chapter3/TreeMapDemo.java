package chapter3;

import java.util.*;

public class TreeMapDemo {

	public static void main(String[] str) {
		
		Map m = new TreeMap();
		
		m.put(3, 300);
		m.put(1, 100);
		m.put(2, 200);
		
		Set st = m.keySet();
		Iterator ite = st.iterator();
		while(ite.hasNext()) {
			Object key = ite.next();
			Object value = m.get(key);
			
			System.out.println(key + " : " + value);
		}
	}
}
