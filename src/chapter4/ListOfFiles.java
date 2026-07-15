package chapter4;

import java.io.File;

public class ListOfFiles {

	public static void main(String[] str) {
		
		File f1 = new File("A:\\Classes\\Application Development\\programs\\files\\");
		
		String[] st = f1.list();
		
		for(int i=0; i<st.length; i++) {
			
			System.out.println(st[i]);
		}
	}
}
