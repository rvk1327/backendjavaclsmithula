package chapter4;

import java.io.*;

public class BufferedOutputStreamDemo {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("A:\\Classes\\Application Development\\programs\\files\\buffer1.txt");
			
			FileOutputStream fout = new FileOutputStream(f);
			
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			String msg = "This is buffered output stream";
			
			byte[] by = msg.getBytes();
			
			bout.write(by);
			
			bout.close();
			
			fout.close();
			
			System.out.println("Success");
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
