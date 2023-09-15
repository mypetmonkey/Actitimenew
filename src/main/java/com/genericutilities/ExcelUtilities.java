package com.genericutilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities {
	
public String readExcelData(String sheetname,int row, int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream(".\\src\\main\\resources\\exceldata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	String value = wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
	return value;
		
	}
	
	public void writeDataIntoExcel(String sheetname,int row,int cell,String value) throws Throwable {
		   FileInputStream fis=new FileInputStream(".\\\\src\\\\main\\\\resources\\\\exceldata.xlsx") ;
			Workbook wb = WorkbookFactory.create(fis);	
			  wb.getSheet(sheetname).getRow(row).createCell(cell).setCellValue(value);
			FileOutputStream fos=new FileOutputStream(".\\\\src\\\\main\\\\resources\\\\exceldata.xlsx");
			wb.write(fos);
			wb.close();
	}


}
