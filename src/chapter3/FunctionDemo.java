package chapter3;

import java.util.function.Function;

// one argument one return result

public class FunctionDemo {

	public static void main(String[] str) {
		
		Function<String,Integer> f1 = st -> st.length();
		int length = f1.apply("this is java");
		System.out.println(length);
		
		Function<String,String> f2 = st -> st.repeat(3);
		String res1 = f2.apply("java");
		System.out.println(res1);
		
		Function<String,String> f3 = st -> st.toUpperCase();
		
		System.out.println(f3.andThen(f2).apply("spring"));
	}
}
