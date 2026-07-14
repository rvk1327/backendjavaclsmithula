package chapter4;

import java.io.*;

public class ReadAndWriteData {

	public static void main(String[] str) {
		
		try {
			
			File s = new File("C:\\Users\\DELL\\Downloads\\samplevideo.mp4"); //copy file
			
			File d = new File("A:\\Classes\\Application Development\\programs\\files\\hello1.mp4"); //paste file
			
			FileReader fr = new FileReader(s);
			
			FileWriter fw = new FileWriter(d);
			
			int x = 0;
			
			while((x=fr.read()) !=-1) {
				
				fw.write(x);
			}
			
			fr.close();
			
			fw.close();
			
			System.out.println("Success");
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
