package chapter3;

public class SingletonObject {

	public static void main(String[] str) {
		
		Customer c1 = Customer.getInstance();
		Customer c2 = Customer.getInstance();
		
		c1.customerInfo();
		c2.customerInfo();
	}
}


class Customer {
	
	//Eager initialization
	private static final Customer customer = new Customer();
	
	
	public static Customer getInstance() {
		
		/* if(customer == null) {
			customer = new Customer();
		} */
		return customer;
	}

	
	public void customerInfo() {
		
		System.out.println("Customer ID : C-1");
		System.out.println("Customer Name : ABC");
		System.out.println("Location : Coimbatore");
	}
}
