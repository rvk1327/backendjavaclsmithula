package chapter4;

import java.io.File;

public class RenamingFile {

	public static void main(String[] str) {
		
		File f1 = new File("A:\\Classes\\Application Development\\programs\\files\\Doc8.pdf");
		
		File f2 = new File("A:\\Classes\\Application Development\\programs\\files\\Document.pdf");
		
		f1.renameTo(f2);
		
		System.out.println("Success");
	}
}
