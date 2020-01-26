package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.validator.ValidateWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static Actions acc;
	public static Select s;
	public static TakesScreenshot tk;
	public static Robot r;
	public static JavascriptExecutor js;
	public static Alert al;
	
	public static WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\AdactinProject\\ChromeServer\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;

	}
	public static void maximize() {
		driver.manage().window().maximize();

	}
	public static void loadUrl(String url) {
		driver.get(url);
    }
	public static void type(WebElement element,String value) {
		element.sendKeys(value);

	}
	public static void btnClick(WebElement element) {
		element.click();

	}
	public static void quitBrowser() {
		driver.quit();

	}
	public static  void closeBrowser() {
		driver.close();

	}
    public static void Title() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	   public static void dropDownByVisibleText(WebElement e,String text) {
					s=new Select(e);
					s.selectByVisibleText(text);
	  }

	 public static void screenshotUserLoc(String loc) throws IOException {
		 tk=(TakesScreenshot)driver;
	     File s = tk.getScreenshotAs(OutputType.FILE);
	     File d=new File(loc);
	     FileUtils.copyFile(s, d);
	   }

		 public static String getAttribute(WebElement e) {
			String att = e.getAttribute("value");
			return att;
		}
	
	
	 public static String fileRead(String filepath,String sheetname,int rowNum,int cellNum) throws Throwable {
					
					File loc=new File(filepath);
					FileInputStream stream=new FileInputStream(loc);
					Workbook w=new XSSFWorkbook(stream);
					Sheet s = w.getSheet(sheetname);
					Row r = s.getRow(rowNum);
					Cell c = r.getCell(cellNum);
					System.out.println(c);
					
					String v = null;
					
					int type = c.getCellType();
					
					if (type==1) 
					{
						v = c.getStringCellValue();
					}
					else if (type==0) 
					{
						if (DateUtil.isCellDateFormatted(c))

						{
							Date dateCellValue = c.getDateCellValue();
							SimpleDateFormat sim=new SimpleDateFormat("dd-MMM-yyyy");
						v = sim.format(dateCellValue);	
						}
						else 
						{
							double numericCellValue = c.getNumericCellValue();
							long l=(long)numericCellValue;
						v = String.valueOf(l);
						}
					}
		        return v;
				}
		

		}
		

