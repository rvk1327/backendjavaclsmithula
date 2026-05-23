package chapter1;

public class ConditionalStatements {

	public static void main(String[] str) {
		
		int x = 300, y = 300;
		
		//IF Statement
		if ((x > 50) && (x > 200)){
			System.out.println("X is greater than 50 and greater than 200");
		}
		
		//IF ELSE Statement
		if (x > y) {
			System.out.println("X is greater than Y");
		
		}else {
			System.out.println("Y is greater than X");
		}
		
		//ELSE IF Ladder
		if (x > y) {
			System.out.println("X is greater than Y");
		
		}else if (y > x) {
			System.out.println("Y is greater than X");
		
		}else  {
			System.out.println("Both values are equal");
		}
		
		//SWITCH Statement
		
		int z  = 3;
		
		switch(z) {
		
		case 1:
			
			System.out.println("Triangle");
			break;
			
		case 2:
			
			System.out.println("Rectangle");
			break;
			
		case 3:
			
			System.out.println("Square");
			break;
			
		default:
			
			System.out.println("Invalid Input");
			break; 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}















