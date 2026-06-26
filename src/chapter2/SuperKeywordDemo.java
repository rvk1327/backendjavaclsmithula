package chapter2;

public class SuperKeywordDemo {

	public static void main(String[] str) {
		
		Customer customer = new Customer();
		customer.showInfo();
	}
}


class Company {
	
	String company_name  = "TATA Motors";
	
	public Company() {
		
		System.out.println("Company Details : " + company_name);
		System.out.println("Year of Established : 1970");
	}
	
	public void display() {
		
		System.out.println("Brand : TATA Nexon");
		System.out.println("Price : 7,00,000.00");
	}
}



class Customer extends Company {
	
	String company_name = "Hero Corporation";
	
	public Customer() {
		
		super(); // call super class constructor  (optional)
		System.out.println("Customer Name : ABC");
		System.out.println("Location : Coimbatore");
	}
	
	public void display() {
		
		System.out.println("Brand : Hero Passion Plus");
		System.out.println("Price : 1,20,000.00");
	}
	
	public void showInfo() {
		
		System.out.println("Company Name : " + company_name);
		System.out.println("Company Name : " + super.company_name);
		display();
		super.display();
	}
}
