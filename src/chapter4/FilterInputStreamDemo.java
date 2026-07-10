package chapter4;

import java.io.*;

public class FilterInputStreamDemo {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("A:\\Classes\\Application Development\\programs\\files\\sampledocument.txt");
			
			FileInputStream fin  = new FileInputStream(f);
			
			FilterInputStream flt = new FilterInputStream(fin) { };
			
			int x = 0;
			
			while((x=flt.read()) != -1) {
				
				char c = (char)x;
				System.out.print(c);
			}
			
			flt.close();
			
			fin.close();
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
