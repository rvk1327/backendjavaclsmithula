package chapter4;

import java.io.*;

public class BasicFileOperations {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("A:\\Classes\\Application Development\\programs\\files\\student_data.xlsx");
			
			boolean res1 = f.canExecute();
			
			System.out.println(res1);
			
			boolean res2 = f.canRead();
			
			System.out.println(res2);
			
			boolean res3 = f.canWrite();
			
			System.out.println(res3);
			
			boolean res4 = f.createNewFile();
			
			System.out.println(res4);
			
			boolean res5 = f.exists();
			
			System.out.println(res5);
			
			File f1 = f.getAbsoluteFile();
			
			System.out.println(f1);
			
			String path = f.getAbsolutePath();
			
			System.out.println(path);
			
			File f3 = f.getCanonicalFile();
			
			System.out.println(f3);
			
			long space = f.getFreeSpace();
			
			System.out.println(space);
			
			String file_name = f.getName();
			
			System.out.println(file_name);
			
			String path1 = f.getPath();
			
			System.out.println(path1);
			
			System.out.println(f.isAbsolute());
			
			System.out.println(f.isDirectory());
			
			System.out.println(f.isFile());
			
			System.out.println(f.isHidden());
			
			System.out.println(f.lastModified());			
			
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
