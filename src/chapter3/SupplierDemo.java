package chapter3;

import java.util.function.Supplier;

//no argument one return result

public class SupplierDemo {

	public static void main(String[] str) {
		
		Supplier<Integer> s1 = () -> 20+30;
		int res1  = s1.get();
		System.out.println(res1);
		
		Supplier<String> s2 = () -> "welcome".toUpperCase();
		String res2 = s2.get();
		System.out.println(res2);
	}
}
