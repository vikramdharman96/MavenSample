package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {
	public static void main(String[] args) throws IOException {
		String excelfilepath=".\\Excelsheet\\practise.xlsx";
		FileInputStream inputstream=new FileInputStream(excelfilepath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
		XSSFSheet sheet = workbook.getSheetAt(0);
		 
		//using loop
		int rows = sheet.getLastRowNum();
		int column = sheet.getRow(1).getLastCellNum();
		
		for (int r = 0; r < rows; r++) {
			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c < column; c++) {
					XSSFCell cell = row.getCell(c);
					switch (cell.getCellType()) {
					case STRING:System.out.print(cell.getStringCellValue());
						break;
					case NUMERIC:System.out.print(cell.getNumericCellValue());	
						break;
					case BOOLEAN:System.out.print(cell.getBooleanCellValue());
						break;
					case FORMULA:System.out.println(cell.getNumericCellValue());
					}
					
					System.out.print(" | ");
					
			}
			System.out.println();
		}
		
		
//        Iterator iterator = sheet.iterator();
//		while (iterator.hasNext()) {
//			XSSFRow row = (XSSFRow )iterator.next();   //typecasting
//			Iterator cellIterator = row.cellIterator();
//			
//			while (cellIterator.hasNext()) {
//				XSSFCell cell = (XSSFCell)cellIterator.next();
//				switch (cell.getCellType()) {
//				case STRING:System.out.print(cell.getStringCellValue());
//					break;
//				case NUMERIC:System.out.print(cell.getNumericCellValue());	
//					break;
//				case BOOLEAN:System.out.print(cell.getBooleanCellValue());
//				}
//				System.out.print(" | ");
//				
//			}
//			System.out.println();
//		}
//		
	}

}
