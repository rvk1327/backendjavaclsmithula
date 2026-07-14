package chapter4;

import java.io.*;

public class ByteArrayOutputStreamDemo {

	public static void main(String[] str) {
		
		try {
			
			File f1 = new File("A:\\Classes\\Application Development\\programs\\files\\byte1.txt");
			
			File f2 = new File("A:\\Classes\\Application Development\\programs\\files\\byte2.doc");
			
			FileOutputStream fout1 = new FileOutputStream(f1);
			
			FileOutputStream fout2 = new FileOutputStream(f2);
			
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			
			String msg = "This is byte array output stream";
			
			byte[] by = msg.getBytes();
			
			bout.write(by);
			
			bout.writeTo(fout1);
			
			bout.writeTo(fout2);
			
			
			bout.close();
			
			fout1.close();
			
			fout2.close();
			
			System.out.println("Success");
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
