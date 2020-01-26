package org.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExecutionPage extends BaseClass{
	public static void main(String[] args) throws IOException, InterruptedException {
		
	    WebDriver driver=getdriver();
	    loadUrl("https://adactin.com/HotelApp/");
	    maximize();
	    screenshotUserLoc("E:\\Eclipse\\AdactinProject\\Screenshot\\BrowserLauch.png");
	    
//Login Page	    
	    LoginPage page=new LoginPage();
	    type(page.getTxtUserName(), "jemimaAngel");
	    type(page.getTxtPassword(), "QTB8N1");
	    btnClick(page.getLoginBtn());
	    screenshotUserLoc("E:\\Eclipse\\AdactinProject\\Screenshot\\Login.png");
	    
//Search Hotel Page
	    
	    SearchHotelPage page1=new SearchHotelPage();
	    dropDownByVisibleText(page1.getLocation(), "Sydney");
	    dropDownByVisibleText(page1.getHotels(), "Hotel Sunshine");
	    dropDownByVisibleText(page1.getRoomType(), "Double");
	    dropDownByVisibleText(page1.getNumOfRooms(), "1 - One"); 
	    type(page1.getCheckInDate(), "19/01/2020");
	    type(page1.getCheckOutDate(), "20/01/2020");
	    dropDownByVisibleText(page1.getAdultCount(), "2 - Two");
	    dropDownByVisibleText(page1.getChildrenCount(), "2 - Two");
	    btnClick(page1.getSearchBtn());
	    screenshotUserLoc("E:\\\\Eclipse\\\\AdactinProject\\\\Screenshot\\SearchHotel.png");
	    
//Select Hotel Page
	    
	    SelectHotelPage page2=new SelectHotelPage();
	    btnClick(page2.getSelectHotelRdoBtn());
	    btnClick(page2.getContinueBtn());
	    screenshotUserLoc("E:\\\\Eclipse\\\\AdactinProject\\\\Screenshot\\SelectHotel.png");
	    
//Book Hotel Page
	    
	    BookHotelPage page3=new BookHotelPage();
	    type(page3.getFirstname(), "Jemima");
	    type(page3.getLastname(), "JP");
	    type(page3.getBillingAddress(), "73,kumarankudil,mettukupam,chennai-600097");
	    type(page3.getCreditCardNum(), "6890245834924596");
	    dropDownByVisibleText(page3.getCreditCardType(), "VISA");
	    dropDownByVisibleText(page3.getExpMonth(), "March");
	    dropDownByVisibleText(page3.getExpYear(), "2022");
	    type(page3.getCvvNum(), "6585");
	    btnClick(page3.getBookNowBtn());
	    screenshotUserLoc("E:\\\\Eclipse\\\\AdactinProject\\\\Screenshot\\BookHotel.png");
	    
//Booking Confirmation Page
	    
	    BookingConfirmationPage page4=new BookingConfirmationPage();
	    Thread.sleep(5000);
	    String attribute = getAttribute(page4.getOrderNum());
        System.out.println(attribute);
       
	    screenshotUserLoc("E:\\\\Eclipse\\\\AdactinProject\\\\Screenshot\\BookingConfirmation.png");
	    
	}

}
