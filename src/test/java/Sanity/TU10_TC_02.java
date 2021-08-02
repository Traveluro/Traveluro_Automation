package Sanity;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;


import POM.POM_TU8_TC_05;

import TestCases.Listener;
import POM.POM_TU10_TC_02;
@Listeners(Listener.class)
public class TU10_TC_02 extends Base {
@Test
public void VerifyWithBooking() throws InterruptedException
{
try {
	
	POM_TU8_TC_05 p=new POM_TU8_TC_05(driver);
	p.Destination();
	
	Thread.sleep(1000);
	p.Date();
	
	Thread.sleep(1000);
	p.Adult();
	
	Thread.sleep(1000);
	p.GO();
	
	Thread.sleep(1000);
	POM_TU10_TC_02 p1=new POM_TU10_TC_02(driver);
	p1.View();
	
	Thread.sleep(1000);
	p1.BookNow();
	
	Thread.sleep(1000);
	p1.FirstName(FirstName);
	
	Thread.sleep(1000);
	p1.LastName(LastNaame);
	
	Thread.sleep(1000);
	p1.Email(Email);
	
	Thread.sleep(1000);
	p1.ConfirmMail(Email);
	
	Thread.sleep(1000);
	p1.CountryFlag();
	
	Thread.sleep(1000);
	p1.Phone(Phone);
	
	Thread.sleep(1000);
	p1.zipcode(Zipcode);
	
	Thread.sleep(1000);
	p1.Credit(CreditCard);
	
	Thread.sleep(1000);
	p1.Month();
	
	Thread.sleep(1000);
	p1.Year();
	
	Thread.sleep(1000);
	p1.CVV(CVV);
	
	Thread.sleep(1000);
	p1.checkbox();
	
	Thread.sleep(1000);
	p1.BookRoom();
	
	Thread.sleep(1000);
	p1.ValidConfirmation(ConfirmationValid);
	
	Thread.sleep(1000);
}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
