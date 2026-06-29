package workouts;

public class StringTask1 {

	public static void main(String[] str) {
		
		String st = "..................welcome..........to.................java..................";
		
		String[] st1 = st.split("\\.");
		String result = "";
		
		for(int i=0; i<st1.length; i++) {
			
			if(st1[i] !="") {
				result = result.concat(st1[i] +".");
			}
		}
		
		System.out.println(result.substring(0, result.length()-1));
	}
}
