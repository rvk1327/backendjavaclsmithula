package chapter2;

public class AbstractionDemo {

	public static void main(String[] str) {
		
		Library lib = new Library();
		lib.bookInfo();
		lib.additionalBookInfo();
		
		
		//Question #1: Is it possible to create an object for an abstract class? : Yes
		Book b = new Book() {
			
			public void additionalBookInfo() {
				
				System.out.println("Year of publications : 2021");
				System.out.println("Version : 25");
			}
		};
		
		b.additionalBookInfo();
		
		
		//Question #2: which class has the functional additionalBookInfo()? : class Library
		
		//Question #3 : why we declare and define the function with separate classes?
		
	}
}

abstract class Book {
	
	public void bookInfo() {
		
		System.out.println("Book Name : The Complete reference of Java");
		System.out.println("Author : Herbert Schildt");
	}
	
	abstract public void additionalBookInfo();	//function declaration
}

class Library extends Book {
	
	//function definition
	public void additionalBookInfo() {
		
		System.out.println("Publication: Karl Pearson Publications");
		System.out.println("Price : 1500.00");
	}
}
