package chapter4;

import java.io.*;

public class FilteredOutputStreamDemo {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("A:\\Classes\\Application Development\\programs\\files\\filter1.txt");
			
			FileOutputStream fout = new FileOutputStream(f);
			
			FilterOutputStream flt = new FilterOutputStream(fout);
			
			String content = "This is filter output stream";
			
			byte[] by = content.getBytes();
			
			flt.write(by);
			
			flt.close();
			
			fout.close();
			
			System.out.println("Success");
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
