package workouts;

/*
 * Calculate Electricity Bill
 * Units = input value
 *  for first 50 units 0.50/unit
 *  for next 100 units 0.75/unit
 *  for next 100 units 1.20/unit
 *  if units more than 250 then 1.50/unit
 *  Additionally 20% sur-charge added to the bill
 */

public class CalculateEB {

	public static void main(String[] str) {
		
		double units = 200.00;
		double charges = 0.0;
		
		if(units <= 50.00) {
			charges = units * 0.50;
		
		}else if((units > 50.00) && (units <= 150.00)) {
			charges = (50.00*0.50) + ((units - 50.00) * 0.75);
			
		}else if ((units > 150.00) && (units <= 250.00)) {
			charges = (50.00*0.50) + (100.00*0.75) + ((units-150.00) * 1.20);
		
		}else if(units > 250.00) {
			charges = units * 1.50;
		}
		
		charges = charges + ((charges * 20)/100);
		
		System.out.println("Total Units : " + units);
		System.out.println("Bill Amount : " + charges);
	}
}
