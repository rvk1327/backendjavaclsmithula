package workouts;

/*
 *  Salary <= 10000, hra=20%, da=10%
 *  Salary > 10000, hra=30%, da = 20%
 *  salary > 25000, hra = 40% , da = 30%
 *  
 *  HRA (House Rent Allowance)
 *  DA (Dearness Allowance)
 *  
 *  (eg) salary : 15000 + 4500 + 3000 = 22500 (Gross salary)
 * 
 */

public class CalculateGrossSalary {

	public static void main(String[] str) {
		
		double salary = 10000.00;
		double gross_salary  = 0.0;
		
		if(salary <= 10000.00) {
			gross_salary = salary + ((salary * 20)/100) + ((salary * 10)/100);
		
		}else if((salary > 10000.00) && (salary <= 25000.00)) {
			gross_salary = salary + ((salary * 30)/100) + ((salary * 20)/100);
		
		}else if(salary > 25000.00) {
			gross_salary = salary + ((salary * 40)/100) + ((salary * 30)/100);
		}
		
		System.out.println("Salary : " + salary);
		System.out.println("Gross Salary : " + gross_salary);
		
	}
}
