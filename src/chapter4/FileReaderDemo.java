package chapter4;

import java.io.*;

public class FileReaderDemo {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("A:\\Classes\\Application Development\\programs\\files\\sample1.txt");
			
			FileReader fr = new FileReader(f);
			
			int x = 0;
			
			while((x = fr.read()) != -1) {
				
				char c = (char)x;
				System.out.print(c);
			}
			
			fr.close();
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
