package chapter3;

public class LambdaFunctionDemo {

	public static void main(String[] str) {
		
		Lambda1 ld1 = new Lambda1() {
			
			public void display1() {
				System.out.println("This is Lambda-1");
			}
		};
		
		ld1.display1();
		
		
		Lambda2 ld2 = () -> {
			System.out.println("This is Lambda-2");
		};
		ld2.display2();
		
		
		Lambda3 ld3 = (rollno,stname) -> {
			System.out.println("Roll No : " + rollno);
			System.out.println("Student Name : " + stname);
		};
		
		ld3.studentInfo(1, "abc");
		
		
		Lambda4 ld4 = (x,y) -> {
			return x+y;
		};
		
		int res = ld4.calc(10, 20);
		System.out.println(res);
		
	}
}


interface Lambda1 {
	public void display1();
}

interface Lambda2 {
	public void display2();	
}

interface Lambda3 {
	public void studentInfo(int rollno, String stname);
}

interface Lambda4 {
	public int calc(int x, int y);
}
