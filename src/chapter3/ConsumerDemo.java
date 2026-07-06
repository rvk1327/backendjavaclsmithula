package chapter3;

import java.util.function.Consumer;

//one argument no return value

public class ConsumerDemo {

	public static void main(String[] str) {
		
		Consumer<String> c1 = st -> System.out.println(st.toUpperCase());
		c1.accept("welcome");
		
		Consumer<Integer> c2 = x -> System.out.println(x*x);
		c2.accept(25);
		
		Consumer<String> c3 = System.out::println;
		c3.accept("This is Consumer");
	}
}
