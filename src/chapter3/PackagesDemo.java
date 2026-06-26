package chapter3;

/*import pack1.Sample1;
import pack1.Sample2; */
import pack1.*;
import pack1.pack2.Sample3;
//import pack1.pack2.*;
import pack3.Sample1;

public class PackagesDemo {

	public static void main(String[] str) {
		
		pack1.Sample1 s1 = new pack1.Sample1();
		s1.display1();
		
		Sample2 s2 = new Sample2();
		s2.display2();
		
		Sample3 s3 = new Sample3();
		s3.display3();
		
		Sample1 s4 = new Sample1();
		s4.display1();
	}
}
