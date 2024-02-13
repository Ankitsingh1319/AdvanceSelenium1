package com.qa.demo.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	public Properties prop;
	public WebDriver init_Driver(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		return driver;
		
	}
	public Properties init_property()
	{
		
		prop=new Properties();
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("C:\\Users\\Anshu\\eclipse-workspace\\KeywordDrivenTestingFramework\\src\\main\\java\\com\\qa\\demo\\properties\\propertiesFile");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
		
	}
}
