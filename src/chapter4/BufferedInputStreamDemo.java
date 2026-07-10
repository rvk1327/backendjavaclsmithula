package chapter4;

import java.io.*;

public class BufferedInputStreamDemo {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("A:\\Classes\\Application Development\\programs\\files\\sampledocument.txt");
			
			FileInputStream fin = new FileInputStream(f);
			
			BufferedInputStream bin = new BufferedInputStream(fin);
			
			int x = 0;
			
			while((x=bin.read()) != -1) {
				
				char c  = (char)x;
				System.out.print(c);
			}
			
			bin.close();
			
			fin.close();
			
		}catch(Exception obj) {
			obj.printStackTrace();
		}
	}
}
