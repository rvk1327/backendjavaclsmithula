package chapter4;

import java.io.*;

public class WriteCSVData {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("A:\\Classes\\Application Development\\programs\\files\\employee.csv");
			
			FileOutputStream fout = new FileOutputStream(f);
			
			String data = "Emp ID , Emp Name , Email ID\n"
					+ "emp-1 , abc , abc@gmail.com\n"
					+ "emp-2 , def , def@gmail.com\n"
					+ "emp-3 , ghi , ghi@gmail.com\n";
			
			byte[] by = data.getBytes();
			
			fout.write(by);
			
			fout.close();
			
			System.out.println("Success");
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
