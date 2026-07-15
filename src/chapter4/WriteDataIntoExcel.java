package chapter4;

import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoExcel {

	public static void main(String[] str) {

		try {
			
			File f = new File("A:\\Classes\\Application Development\\programs\\files\\student_data.xlsx");
			
			FileOutputStream fout = new FileOutputStream(f);
			
			
			XSSFWorkbook xb = new XSSFWorkbook();
			
			XSSFSheet xs = xb.createSheet("students");
			
			XSSFRow r = xs.createRow(3);
			
			XSSFCell c = r.createCell(3);
			
			c.setCellValue("Mithula");
			
			
			xb.write(fout);
			
			fout.close();
			
			System.out.println("Success");
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
		
	}
}
