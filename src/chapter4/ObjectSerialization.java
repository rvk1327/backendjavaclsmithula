package chapter4;

import java.io.*;
import pack1.Sample1;

public class ObjectSerialization  {

	public static void main(String[] str) {
		
		try {
			
			Sample1 s1 = new Sample1();
			
			File f = new File("A:\\Classes\\Application Development\\programs\\files\\sampleobject.txt");
			
			FileOutputStream fout = new FileOutputStream(f);
			
			ObjectOutputStream obj1 = new ObjectOutputStream(fout);
			
			obj1.writeObject(s1);
			
			obj1.close();
			
			fout.close();
			
			System.out.println("Success");
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
