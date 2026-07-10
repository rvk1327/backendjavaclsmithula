package chapter4;

import java.io.*;

public class BufferedReaderForFile {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("A:\\Classes\\Application Development\\programs\\files\\sample1.txt");
			
			FileReader fr = new FileReader(f);
			
			BufferedReader br = new BufferedReader(fr);
			
			int x = 0;
			
			while((x=br.read()) != -1) {
				
				char c = (char)x;
				System.out.print(c);
			}
			
			br.close();
			
			fr.close();
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
