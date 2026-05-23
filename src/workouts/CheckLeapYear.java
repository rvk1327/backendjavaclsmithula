package workouts;

public class CheckLeapYear {

	public static void main(String[] str) {

		int year = 2026;
		
		if((year % 4) == 0) {			
			System.out.println("This is leap year");
		
		}else {
			System.out.println("This is not a leap year");
		}
	}
}
