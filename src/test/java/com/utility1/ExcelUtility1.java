package com.utility1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility1 {
	
	public static String gettestdata(int rowNumber, int cellNumber) throws InvalidFormatException, IOException {
		// Create File class object.
	
		File file = new File("D:\\Selenium\\Testdata.xlsx");
		// Create Workbook object.
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		// Create Sheet object.
			  XSSFSheet sheet = book.getSheetAt(0);
				// specify the row and cell number.
	
		return sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
		}

}
