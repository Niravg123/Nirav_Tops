package com;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReader {

	String FilePath;
	String SheetName;
	
	public ExcellReader(String filePath, String sheetName) {
		super();
		FilePath = filePath;
		SheetName = sheetName;
	}
	
	public int rowCount()
	{
		int row = 0;
		
		
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(FilePath);
			XSSFSheet sheet = workbook.getSheet(SheetName);
			row = sheet.getPhysicalNumberOfRows();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return row;
	}
	
	
	public int colCount()
	{
		int col = 0;
		
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(FilePath);
			XSSFSheet sheet = workbook.getSheet(SheetName);
			col = sheet.getRow(0).getPhysicalNumberOfCells();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return col;
	}
	
	public String getData(int row , int col)
	{
		String data = null;
		
		
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(FilePath);
			XSSFSheet sheet = workbook.getSheet(SheetName);
			data = sheet.getRow(row).getCell(col).getStringCellValue();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
		
	}
	
}
