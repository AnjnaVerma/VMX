package com.vmx.genericFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.IOException;
import java.util.Properties;

//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.sl.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String getCellData(String excelSheet, String sheet, int row, int cell) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelSheet);
		Workbook wb=WorkbookFactory.create(fis);
		String excelVal = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return excelVal;
	}

	public void getRowCount(String excelSheet, String sheet) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelSheet);
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheet).getLastRowNum();
	}

	public void setCelldata(String excelSheet, String sheet, int row, int cell, String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelSheet);
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(excelSheet);
		wb.write(fos);
		wb.close();
	}
	public String getPropValue(String propPath, String key) throws IOException 
	{
		FileInputStream fis=new FileInputStream(propPath);
		Properties prop=new Properties();
		prop.load(fis);
		String propValue = prop.getProperty(key, "Incorrect key");
		return propValue;
	}

}
