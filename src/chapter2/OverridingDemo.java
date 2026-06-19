package chapter2;

public class OverridingDemo {

	public static void main(String[] str) {
		
		Over2 ovr = new Over2();
		ovr.collegeInfo();
		System.out.println(ovr.location);
	}
}

class Over1 {
	
	String location = "coimbatore";
	
	public void collegeInfo() {
		System.out.println("College Name : Sri Ramakrishna Engineering College");
		System.out.println("Location : Pachapalayam");
	}
}

class Over2 extends Over1 {
	
	String location = "Erode";
	
	public void collegeInfo() {
		System.out.println("College Name : PSG Engineering");
		System.out.println("Location : Peelamedu");
	}
}


