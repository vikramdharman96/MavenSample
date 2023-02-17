package helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingPasswordProtectedExcel {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(".\\Excelsheet\\practise.xlsx");
		String password="test123";
		
		//XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFWorkbook workbook = (XSSFWorkbook)WorkbookFactory.create(fis, "test123");  //typecasting
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
//		int rows = sheet.getLastRowNum();
//		System.out.println(rows);
//		int cols = sheet.getRow(0).getLastCellNum();
//		System.out.println(cols);
//		
//		for (int r = 0; r <=rows; r++) {
//				XSSFRow row = sheet.getRow(r);
//			for (int c = 0; c < cols; c++) {
//				XSSFCell cell = row.getCell(c);
//				
//				switch (cell.getCellType()) {
//				case STRING:System.out.print(cell.getStringCellValue());break;
//				case NUMERIC:System.out.print(cell.getNumericCellValue());break;
//				case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
//				case FORMULA:System.out.print(cell.getNumericCellValue());break;
//				}
//				System.out.print(" | ");
//			}
//			System.out.println();
//		}
		
		//Iterator method
		Iterator<Row> iterator = sheet.iterator();
		
		while (iterator.hasNext()) {
			Row nextrow = iterator.next();
			Iterator<Cell> cellIterator = nextrow.cellIterator();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				
				switch(cell.getCellType()) {
				case STRING:System.out.print(cell.getStringCellValue());break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
				case FORMULA:System.out.print(cell.getNumericCellValue());break;
				}
				System.out.print(" | ");	
			}
			System.out.println();
			
		}	
		
		workbook.close();
		fis.close();
	}

}
