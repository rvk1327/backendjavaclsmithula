package chapter3;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] str) {
		
		Map m = new HashMap();
		
		m.put("name", "mithula");
		m.put("rank", 1);
		m.put("mark", 95.78);
		
		System.out.println(m.get("rank"));
		System.out.println(m.containsKey("mark"));
		System.out.println(m.containsValue(95.78));
		
		Set st = m.keySet(); // get all keys from map object
		
		Iterator ite = st.iterator();
		while(ite.hasNext()) {
			Object key = ite.next(); // get key from iterator object
			Object value = m.get(key);
			
			System.out.println(key + " : " + value);
		}
		
		for(Object obj : m.entrySet()) {
			
			Map.Entry x = (Map.Entry)obj;
			
			Object key  = x.getKey();
			Object value = x.getValue();
			
			System.out.println(key + " : " + value);
		}
		
	}
}
