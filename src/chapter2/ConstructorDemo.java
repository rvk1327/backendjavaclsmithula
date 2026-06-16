package chapter2;

public class ConstructorDemo {

	public static void main(String[] str) {
		
		College clg = new College();
		clg.collegeInfo();
		
		//Features of constructor
		//Feature #1: Call constructor without creating an object
		new College();
		
		//Feature #2: Call normal function using constructor
		new College().collegeInfo();
		
		//Feature #3: Dynamic function creation and calling
		new College() {
			
			public void additionalInfo() {
				System.out.println("HOD : ABC");
				System.out.println("Staff Count : 10");
			}
		
		}.additionalInfo();
	}
}


class College {
	
	public College() {
		
		System.out.println("Ramakrishna Engineering College");
	}
	
	public void collegeInfo() {
		
		System.out.println("Department : CSE");
		System.out.println("Year : 2026-2030");
	}
}
