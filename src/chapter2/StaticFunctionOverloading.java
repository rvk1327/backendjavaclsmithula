package chapter2;

public class StaticFunctionOverloading {

	public static void main(String[] str) {
		
		Product.productInfo(1, "Pendrive");
		Product.productInfo(800.00, 3);
	}
}

class Product {
	
	public static void productInfo(int product_id, String product_name) {
		
		System.out.println("Product ID : " + product_id);
		System.out.println("Product Name : " + product_name);
	}
	
	public static void productInfo(double price, int qty) {
		
		System.out.println("Product Price : " + price);
		System.out.println("Quantity : " + qty);
	}
}
