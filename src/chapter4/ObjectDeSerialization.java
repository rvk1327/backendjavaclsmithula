package chapter4;

import java.io.*;
import pack1.Sample1;

public class ObjectDeSerialization {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("A:\\Classes\\Application Development\\programs\\files\\sampleobject.txt");
			
			FileInputStream fin = new FileInputStream(f);
			
			ObjectInputStream obj1 = new ObjectInputStream(fin);
			
			Sample1 s1 = (Sample1)obj1.readObject();
			
			s1.display1();
			
			obj1.close();
			
			fin.close();
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
