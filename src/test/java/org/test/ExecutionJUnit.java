package org.test;


import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ExecutionJUnit extends BaseClass {

	
	@BeforeClass
	public static void launchBrowser() {
	getdriver();
     }
	
	@Before
	public void startTime() {
	Date d=new Date();
    System.out.println(d);
	}
	
	
	@Test
	public void testCase1() throws Throwable {
		    loadUrl("https://adactin.com/HotelApp/");
		    maximize();
//Login Page	    
		    LoginPage page=new LoginPage();
		    type(page.getTxtUserName(),fileRead("E:\\Eclipse\\AdactinProject\\TestDatas\\Adactin.xlsx","Sheet1", 1, 0));
		    type(page.getTxtPassword(),fileRead("E:\\Eclipse\\AdactinProject\\TestDatas\\Adactin.xlsx","Sheet1", 1, 1));
		    btnClick(page.getLoginBtn());
		    screenshotUserLoc("E:\\Eclipse\\AdactinProject\\Screenshot\\Login.png");
	}
	
	@Test
	public void testCase2() throws Throwable {
		    
		  //Search Hotel Page
		    SearchHotelPage page1=new SearchHotelPage();
		    dropDownByVisibleText(page1.getLocation(),fileRead("E:\\Eclipse\\AdactinProject\\TestDatas\\Adactin.xlsx","Sheet2", 1, 0));
		    dropDownByVisibleText(page1.getHotels(),fileRead("E:\\Eclipse\\AdactinProject\\TestDatas\\Adactin.xlsx","Sheet2", 1, 1));
		    dropDownByVisibleText(page1.getRoomType(),fileRead("E:\\Eclipse\\AdactinProject\\TestDatas\\Adactin.xlsx","Sheet2", 1, 2));
		    dropDownByVisibleText(page1.getNumOfRooms(),fileRead("E:\\Eclipse\\AdactinProject\\TestDatas\\Adactin.xlsx","Sheet2", 1, 3)); 
		    type(page1.getCheckInDate(),fileRead("E:\\Eclipse\\AdactinProject\\TestDatas\\Adactin.xlsx","Sheet2", 1, 4));
		    type(page1.getCheckOutDate(),fileRead("E:\\Eclipse\\AdactinProject\\TestDatas\\Adactin.xlsx","Sheet2", 1, 5));
		    dropDownByVisibleText(page1.getAdultCount(),fileRead("E:\\Eclipse\\AdactinProject\\TestDatas\\Adactin.xlsx","Sheet2", 1, 6));
		    dropDownByVisibleText(page1.getChildrenCount(),fileRead("E:\\Eclipse\\AdactinProject\\TestDatas\\Adactin.xlsx","Sheet2", 1, 7));
		    btnClick(page1.getSearchBtn());
		    screenshotUserLoc("E:\\\\Eclipse\\\\AdactinProject\\\\Screenshot\\SearchHotel.png");
	}
	@Test
	public void testCase3() throws Throwable {
		  //Select Hotel Page
		    
		    SelectHotelPage page2=new SelectHotelPage();
		    btnClick(page2.getSelectHotelRdoBtn());
		    btnClick(page2.getContinueBtn());
		    screenshotUserLoc("E:\\\\Eclipse\\\\AdactinProject\\\\Screenshot\\SelectHotel.png");
	}
	@Test
	public void testCase4() throws Throwable {
		  //Book Hotel Page
		    BookHotelPage page3=new BookHotelPage();
		    type(page3.getFirstname(), fileRead("E:\\Eclipse\\AdactinProject\\TestDatas\\Adactin.xlsx","Sheet3", 1, 0));
		    type(page3.getLastname(), fileRead("E:\\Eclipse\\AdactinProject\\TestDatas\\Adactin.xlsx","Sheet3", 1, 1));
		    type(page3.getBillingAddress(), fileRead("E:\\Eclipse\\AdactinProject\\TestDatas\\Adactin.xlsx","Sheet3", 1, 2));
		    type(page3.getCreditCardNum(), fileRead("E:\\Eclipse\\AdactinProject\\TestDatas\\Adactin.xlsx","Sheet3", 1, 3));
		    dropDownByVisibleText(page3.getCreditCardType(), fileRead("E:\\Eclipse\\AdactinProject\\TestDatas\\Adactin.xlsx","Sheet3", 1, 4));
		    dropDownByVisibleText(page3.getExpMonth(), fileRead("E:\\Eclipse\\AdactinProject\\TestDatas\\Adactin.xlsx","Sheet3", 1, 5));
		    dropDownByVisibleText(page3.getExpYear(), fileRead("E:\\Eclipse\\AdactinProject\\TestDatas\\Adactin.xlsx","Sheet3", 1, 6));
		    type(page3.getCvvNum(), fileRead("E:\\Eclipse\\AdactinProject\\TestDatas\\Adactin.xlsx","Sheet3", 1, 7));
		    btnClick(page3.getBookNowBtn());
		    screenshotUserLoc("E:\\\\Eclipse\\\\AdactinProject\\\\Screenshot\\BookHotel.png");
	}
	@Test
	public void testCase5() throws Throwable {
		  //Booking Confirmation Page
		    
		    BookingConfirmationPage page4=new BookingConfirmationPage();
		    Thread.sleep(5000);
		    String attribute = getAttribute(page4.getOrderNum());
	        System.out.println(attribute);
	       
		    screenshotUserLoc("E:\\\\Eclipse\\\\AdactinProject\\\\Screenshot\\BookingConfirmation.png");
	}
	
	@After
	public void endTime() {
		Date d=new Date();
	    System.out.println(d);

	}
	
	@AfterClass
	public static void quitBrowsser() {
		quitBrowser();

	}
	
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
	}

