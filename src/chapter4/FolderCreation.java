package chapter4;

import java.io.File;

public class FolderCreation {

	public static void main(String[] str) {
		
		File f = new File("A:\\Classes\\Application Development\\programs\\files\\sample\\");
		
		f.mkdirs(); // make directories
		
		System.out.println("Success");
	}
}
