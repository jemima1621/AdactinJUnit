package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class A extends BaseClass{
		public static void main(String[] args) throws Throwable {	
		getdriver();
		maximize();
		loadUrl("https://www.facebook.com/");
		LoginPage page= new LoginPage();
		WebElement TxtUser = driver.findElement(By.id("email"));
		fileRead("E:\\Eclipse\\AdactinProject\\TestDatas\\Adactin.xlsx","Sheet1", 1, 0);
        	
	}

}

