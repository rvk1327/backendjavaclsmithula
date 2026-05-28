package chapter1;

public class InnerForLoop {

	public static void main(String[] str) {
		
		for(int i=1; i<=3; i++) {
			
			for(int j=1; j<=3; j++) {
				
				System.out.print(j +"   ");
				//System.out.print(i + "  ");
			}
			
			System.out.println();
		}
	}
}
