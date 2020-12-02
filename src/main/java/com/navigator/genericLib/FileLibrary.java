package com.navigator.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class FileLibrary {
	
	public String getPropertyFileData(String key) throws Throwable 
	{
		FileInputStream fis = new FileInputStream("D:\\Navigator1\\src\\main\\resources\\geckodriver.exe");
		Properties pobj=new Properties();
		pobj.load(fis);
		String data=pobj.getProperty(key);
		return data;
	    }
		public String getExcelData(String sheetname,int rownum,int cellnum) throws Throwable 
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\Navigator1\\src\\test\\resources\\NavigatorTC.xlsx");
            XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet(sheetname);
		    Row row=sheet.getRow(rownum);
		    Cell cell=row.getCell(cellnum);
	        String data = cell.getStringCellValue();
			wb.close();
			return data;
		     }
		
		public double getnumericExcelData(String sheetname,int rownum,int cellnum) throws Throwable 
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\Navigator1\\src\\test\\resources\\NavigatorTC.xlsx");
            XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet(sheetname);
		    Row row=sheet.getRow(rownum);
		    Cell cell=row.getCell(cellnum);
	        double data = cell.getNumericCellValue();
			wb.close();
			return data;
		     }
		
		public void setExcelData(String sheetname,int rownum,int cellnum) throws Throwable 
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\Navigator1\\src\\test\\resources\\NavigatorTC.xlsx");

			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetname);
			Row row=sh.getRow(rownum);
			Cell cell=row.getCell(cellnum);
				cell.setCellValue(100);
				
				FileOutputStream fos= new FileOutputStream("C:\\Users\\lenovo\\eclipse-workspace\\Navigator1\\src\\test\\resources\\NavigatorTC.xlsx");
				wb.write(fos);
				wb.close();

		}
}
