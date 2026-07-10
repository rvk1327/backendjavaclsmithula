package chapter4;

import java.io.*;

public class FilterReaderDemo {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("A:\\Classes\\Application Development\\programs\\files\\sampledocument.txt");
			
			FileReader fr = new FileReader(f);
			
			FilterReader flt = new FilterReader(fr) { };
			
			int x = 0;
			
			while((x = flt.read()) != -1) {
				
				char c = (char)x;
				System.out.print(c);
			}
			
			flt.close();
			
			fr.close();
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
