package chapter2;


//Java beans
//Getter and Setter
//POJO : Plain Old Java Object
public class Employee {

	private String emp_id;
	private String emp_name;
	private double salary;
	
	public void setEmpId(String emp_id1) {
		emp_id = emp_id1;
	}
	
	public void setEmpName(String emp_name1) {
		emp_name = emp_name1;
	}
	
	public void setSalary(double salary1) {
		salary = salary1;
	}
	
	public String getEmpId() {
		return emp_id;
	}
	
	public String getEmpName() {
		return emp_name;
	}
	
	public double getSalary() {
		return salary;
	}
}
