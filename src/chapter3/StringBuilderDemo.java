package chapter3;

public class StringBuilderDemo {

	public static void main(String[] str) {
		
		StringBuilder sb = new StringBuilder("welcome");
		sb.append(" java");
		System.out.println(sb);
		int capacity = sb.capacity();
		System.out.println(capacity); //no.of characters beyond allocate memories
		sb.delete(2, 5);
		System.out.println(sb);
		sb.deleteCharAt(3);
		System.out.println(sb);
		sb.insert(3, "hello");
		System.out.println(sb);
		int length = sb.length();
		System.out.println(length);
		sb.reverse();
		System.out.println(sb);		
	}
}
