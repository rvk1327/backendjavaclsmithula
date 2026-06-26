package chapter2;

public class MessagePassing1 {

	public static void main(String[] str) {
		
		String empid = "EMP-1";
		String empname = "ABC";
		double empsalary = 75000.00;
		
		Employee emp = new Employee();
		emp.setEmpId(empid);
		emp.setEmpName(empname);
		emp.setSalary(empsalary);
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		
		
	}
}
