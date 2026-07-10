package chapter4;

import java.io.*;
import java.util.*;

public class SequenceInputStreamDemo {

	public static void main(String[] str) {
		
		try {
			
			File f1 = new File("A:\\Classes\\Application Development\\programs\\files\\sampledocument.txt");
			
			File f2 = new File("A:\\Classes\\Application Development\\programs\\files\\sample1.txt");
			
			FileInputStream fin1 = new FileInputStream(f1);
			
			FileInputStream fin2 = new FileInputStream(f2);
			
			Stack<FileInputStream> st = new Stack<FileInputStream>();
			
			st.push(fin2);
			
			st.push(fin1);
			
			Enumeration<FileInputStream> e = st.elements();
			
			SequenceInputStream sis  = new SequenceInputStream(e);
			
			int x = 0;
			
			while((x = sis.read()) != -1) {
				
				char c = (char)x;
				System.out.print(c);
			}
			
			
			sis.close();
			
			fin1.close();
			
			fin2.close();
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
