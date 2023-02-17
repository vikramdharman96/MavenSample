package helper;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {
	public static void main(String[]args) throws IOException {
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet	 = workbook.createSheet("Emp Info");
		
	Object empdata[][]= {	{"EmpID","Name","Job"},
						{"101","vikram","testing"},
						{"102","ram","developer"},
						{"103","bijju","analyst"}
					};
	
	//Using Loop
		
//	int rows = empdata.length;
//	int cols = empdata[0].length;
//	
//	System.out.println(rows);
//	System.out.println(cols);
//	
//	for (int r = 0; r < rows; r++) {
//		
//		XSSFRow row = sheet.createRow(r);
//		
//		for (int c = 0; c < cols; c++) {
//				XSSFCell cell = row.createCell(c);
//				Object  value=empdata[r][c];
//				
//				if (value instanceof String) 
//					cell.setCellValue((String)value);
//				if (value instanceof Integer) 
//					cell.setCellValue((Integer)value);
//				if (value instanceof Boolean)
//					cell.setCellValue((Boolean)value);
//					
//				}
//		}
	
	//using foreach
	int rowcount=0;
	for (Object emp[] : empdata) {
		XSSFRow row = sheet.createRow(rowcount++);
		int columncount=0;
		for (Object value: emp) {
			XSSFCell cell = row.createCell(columncount++);
			
			if (value instanceof String) {
				cell.setCellValue((String)value);
			}
			if (value instanceof Integer) {
				cell.setCellValue((Integer)value);
			}
			if (value instanceof Boolean) {
				cell.setCellValue((Boolean)value);	
			}
		}
		
	}
	
	
	String filepath=".\\Excelsheet\\employee.xlsx";
	FileOutputStream outstream=new FileOutputStream(filepath);
	workbook.write(outstream);
	
	outstream.close();
	
	System.out.println("Employee.xls file written successfu");
	
	
	
		
		
	}

	
	}


