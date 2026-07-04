package chapter3;

public class WrapperClassesDemo {

	public static void main(String[] str) {
		
		Integer x = 300;
		
		int res = x.compareTo(300);
		System.out.println(res);   // 100 < 200 ,  -1
		
		System.out.println(Integer.compare(x, 300));
		
		String st = "300";
		int value = Integer.parseInt(st);
		
		System.out.println(st+500);
		System.out.println(value + 500);
		
		int value1=  Integer.decode("200");
		System.out.println(value1);
		
		
		System.out.println(Integer.numberOfLeadingZeros(0000005));		
	}
}
