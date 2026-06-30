package chapter3;

public class InterThreadCommunication {

	public static void main(String[] str) {
		
		Bank b = new Bank();
		b.deposit(4000);
		b.withdraw(6000);
	}
}


class Bank {
	
	int capital = 1000;
	
	synchronized void deposit(int amt) {
		
		capital = capital + amt;
		System.out.println("Total Amount : " + capital);
		notify();
	}
	
	synchronized void withdraw(int amt) {
		
		if(capital > amt) {
			
			capital = capital - amt;
			System.out.println("Withdraw Amount : " + amt);
			System.out.println("Available Balance : " + capital);
		
		}else {
			
			System.out.println("Insufficient balance ...");
			try {
				wait();
			}catch(Exception obj) {
				obj.printStackTrace();
			}
		}
	}
}