package chapter2;

public class ThisKeywordDemo {

	public static void main(String[] str) {
		
		Department dept = new Department();
		dept.assignValue("CSE", "ABC");
		dept.printvalue();
		
	}
}


class Department {
	
	String dept_name;
	String dept_head;
	
	public void assignValue(String dept_name, String dept_head) {
		
		this.dept_name = dept_name;
		this.dept_head = dept_head;
	}
	
	public void printvalue() {
		
		System.out.println("Department Name : " + this.dept_name);
		System.out.println("Department Head : " + this.dept_head);
	}
}
