package chapter3;

public class VariableArguments {

	public static void main(String[] str) {
	
		display(10,20,30,40,50,60,70,80);
	}
	
	public static void display(int ... x) {
		
		int res = 0;
		
		for(int y : x) {
			
			res = res + y;
		}
		System.out.println(res);
	}
}
