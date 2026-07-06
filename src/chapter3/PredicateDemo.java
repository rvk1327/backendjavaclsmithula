package chapter3;

import java.util.function.Predicate;

// one argument one return as boolean

public class PredicateDemo {

	public static void main(String[] str) {
		
		Predicate<Integer> p1 = x -> x > 50;
		boolean res1 = p1.test(70);
		System.out.println(res1);
		
		
		Predicate<String> p2 = st -> st.length() > 10;
		boolean res2 = p2.test("welcome to java");
		System.out.println(res2);
		
		Predicate<String> p3 = st -> Character.isUpperCase(st.charAt(0));
		boolean res3 = p3.test("Welcome");
		System.out.println(res3);
		
		Predicate<Integer> p4 = x -> x  > 70;
		
		boolean res4 = p1.and(p4).test(60);
		System.out.println(res4);
		
		boolean res5 = p1.or(p4).test(60);
		System.out.println(res5);
		
		boolean res6 = p2.negate().test("welcome to java");
		System.out.println(res6);
	}
}
