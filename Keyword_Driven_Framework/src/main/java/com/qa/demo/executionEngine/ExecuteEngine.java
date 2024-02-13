package com.qa.demo.executionEngine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

import com.qa.demo.Base.Base;

public class ExecuteEngine {

	public WebDriver driver;
	public Properties prop;
	public Workbook w;
	public Sheet s;
	public Base b;
	public final String Excel_path="\"C:\\Users\\Anshu\\OneDrive\\Desktop\\Shoppersstack_Excel.xlsx\"";
	
	public void coreEngine()
	{
		FileInputStream fis;
		try {
			 fis=new FileInputStream(Excel_path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			w=WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s=w.getSheet("Sheet5");
		
		int j=0;
		
	}
}
