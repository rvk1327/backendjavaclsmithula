package chapter3;

public class MethodReferenceDemo {

	public static void main(String[] str) {
		
		//Constructor Method Reference
		Data d1 = Staff :: new;
		d1.dataDisplay();
		
		//Normal Method Reference
		Staff st = new Staff();
		Data d2 = st :: staffInfo;
		d2.dataDisplay();
		
		//Static Method Reference
		Data d3 = Staff :: additionalInfo;
		d3.dataDisplay();
	}
}



class Staff {

	public Staff() {
		System.out.println("This is class Staff");
	}
	
	public void staffInfo() {
		
		System.out.println("Staff ID : S-1");
		System.out.println("Staff Name : ABC");
	}
	
	public static void additionalInfo() {
		
		System.out.println("Department : Admin");
		System.out.println("Working Hrs : 8hrs");
	}
}

interface Data {
	
	public void dataDisplay();
}