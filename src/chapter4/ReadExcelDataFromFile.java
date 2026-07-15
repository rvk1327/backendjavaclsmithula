package chapter4;

import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataFromFile {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("A:\\Classes\\Application Development\\programs\\files\\student_data.xlsx");
			
			FileInputStream fin = new FileInputStream(f);
			
			
			XSSFWorkbook xb = new XSSFWorkbook(fin);
			
			XSSFSheet xs = xb.getSheet("students");
			
			XSSFRow r = xs.getRow(3);
			
			XSSFCell c = r.getCell(3);
			
			switch(c.getCellType()) {
			
			case Cell.CELL_TYPE_STRING:
				String res1 = c.getStringCellValue();
				System.out.println(res1);
				break;
				
			case Cell.CELL_TYPE_NUMERIC:
				double res2 = c.getNumericCellValue();
				System.out.println(res2);
				break;
			}
			
			fin.close();
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
