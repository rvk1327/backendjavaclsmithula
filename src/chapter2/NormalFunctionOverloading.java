package chapter2;

public class NormalFunctionOverloading {

	public static void main(String[] str) {
		
		Lab l = new Lab();
		l.show("ABC", "L-1");
		l.show(5, "CSE");
	}
}


class Lab {
	
	public void show(String incharge, String roomno) {
		
		System.out.println(incharge);
		System.out.println(roomno);
	}
	
	public void show(int total_lab, String lab_name) {
		
		System.out.println(total_lab);
		System.out.println(lab_name);
	}
}