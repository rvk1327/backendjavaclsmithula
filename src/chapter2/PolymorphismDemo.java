package chapter2;

public class PolymorphismDemo {

	public static void main(String[] str) {
		
		Skoda sd = new Skoda();
		sd.carInfo("Skoda Rapid", 2021);
		sd.carInfo(700000, 70000);
	}
}

class Car {
	
	public void carInfo(String car_name, int man_year) {
		
		System.out.println("Car Name : " + car_name);
		System.out.println("Manufacturer Year : " + man_year);
	}
}


class Skoda extends Car {
	
	public void carInfo(int price, int discount) {
		
		System.out.println("Price : " + price);
		System.out.println("Discount : " + discount);
	}
}
