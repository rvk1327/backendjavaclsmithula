package chapter3;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] str) {
		
		Random r = new Random();
		
		boolean res  = r.nextBoolean();
		System.out.println(res);
		
		String st = "welcome";
		byte[] by = st.getBytes();
		r.nextBytes(by);
		
		for(int i=0; i<by.length; i++) {
			int value = by[i];
			int value1 = 0;
			if(value < 0) {
				value1 = Math.abs(value1);
			}else {
				value1 = value;
			}
			System.out.print((char)value1);
		}
		
		System.out.println();
		System.out.println(r.nextDouble());
		System.out.println(r.nextDouble(100));
		System.out.println(r.nextDouble(2000, 4000));
		
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(1000));
		System.out.println(r.nextInt(1000, 10000));
		
	
		
	}
}
