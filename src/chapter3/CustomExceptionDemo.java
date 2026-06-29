package chapter3;

public class CustomExceptionDemo {

	public static void main(String[] str) throws SalaryException {
		
		double salary = 30000.00;
		String category = "C";
		
		if((salary <= 20000.00) && (category.equals("C"))) {
			
			System.out.println("Successfully Credited");
		
		}else {
			
			throw new SalaryException(); //stop the process
		}
		
		System.out.println("ESI, PF, HRA Generated ...");
	}
}


class SalaryException extends Exception {
	
	public SalaryException() {
		System.out.println("Check category and Salary");
	}
}




