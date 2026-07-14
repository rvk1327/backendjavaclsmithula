package chapter4;

import java.io.*;

public class FilteredWriterDemo {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("A:\\Classes\\Application Development\\programs\\files\\filter2.txt");
			
			FileWriter fw = new FileWriter(f);
			
			FilterWriter flt = new FilterWriter(fw) { };
			
			String msg  = "This is filter writer";
			
			flt.write(msg);
			
			flt.close();
			
			fw.close();
			
			System.out.println("Success");
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
