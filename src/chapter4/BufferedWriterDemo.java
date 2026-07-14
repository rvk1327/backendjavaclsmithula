package chapter4;

import java.io.*;

public class BufferedWriterDemo {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("A:\\Classes\\Application Development\\programs\\files\\buffer2.txt");
			
			FileWriter fw = new FileWriter(f);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			String msg = "This is buffered writer";
			
			bw.write(msg);
			
			bw.close();
			
			fw.close();
			
			System.out.println("Success");
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
