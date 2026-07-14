package chapter4;

import java.io.*;

public class FileOutputStreamDemo {

	public static void main(String[] str) {
		
		try {
			
			//create File object for locating file
			File f = new File("A:\\Classes\\Application Development\\programs\\files\\sample2.txt");
			
			//create File Output Stream object for provide write access to file
			FileOutputStream fout = new FileOutputStream(f);
			
			//Prepare Content
			String msg = "welcome to file output stream";
			
			//convert string into bytes
			byte[] by = msg.getBytes();
			
			//write byte array into file output stream object
			fout.write(by);
			
			//close connections
			fout.close();
			
			System.out.println("Success");
			
		}catch(Exception obj) {
			obj.printStackTrace();
		}
	}
}
