package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String readDataFromProperty(String Key) throws IOException   {
		FileInputStream fis = new FileInputStream("./data/commondata.properties");
		Properties p =new Properties();
		p.load(fis);
		String data = p.getProperty(Key);
		return data;}
	
	public String readDataFromExcel(String SheetName, int Row, int Cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 String data = wb.getSheet(SheetName).getRow(Row).getCell(Cell).getStringCellValue();
	return data;
	}
	public void WriteDataIntoExcel(String sheetName,int row,int Cell,String Value) throws FileNotFoundException,IOException{
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(row).getCell(Cell).setCellValue(Value);
		FileOutputStream file = new FileOutputStream("./data/testscript.xlsx");
		wb.write(file);
	}
}