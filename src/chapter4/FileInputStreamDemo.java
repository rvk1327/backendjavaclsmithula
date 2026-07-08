package chapter4;

import java.io.*;

public class FileInputStreamDemo {

	public static void main(String[] str) {
		
		try {
			
			//create file object for locating the file
			File f  = new File("A:\\Classes\\SCMS\\sample.txt");
			
			//create File Input Stream object for assign read access to file
			FileInputStream fin = new FileInputStream(f);
			
			//Read data
			int x = 0;
			
			//Read character one by one
			while((x=fin.read()) != -1) {
				
				//convert the integer value to character
				char c = (char)x;
				System.out.print(c);
			}
			
			//close connections
			fin.close();
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
