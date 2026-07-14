package chapter4;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("A:\\Classes\\Application Development\\programs\\files\\filewriter.txt");
			
			FileWriter fw = new FileWriter(f);
			
			String msg = "Welcome to file writer";
			
			fw.write(msg);
			
			fw.close();
			
			System.out.println("Success");
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
