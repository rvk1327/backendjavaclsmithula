package chapter4;

import java.io.File;

public class RemoveFolderOrFile {

	public static void main(String[] str) {
		
		File f = new File("A:\\Classes\\Application Development\\programs\\files\\hello1.mp4");
		
		f.delete();
		
		System.out.println("Success");
	}
}
