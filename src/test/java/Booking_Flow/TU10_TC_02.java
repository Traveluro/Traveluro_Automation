package Booking_Flow;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;


import POM.POM_TU8_TC_05;

import TestCases.Listener;
import POM.POM_TU10_TC_02;
@Listeners(Listener.class)
public class TU10_TC_02 extends Booking_Flow.Base {
@Test
public void TestSelectHotel() throws InterruptedException
{

	logger5 =event.createTest("Select the Hotel and Booking");
	POM_TU8_TC_05 p=new POM_TU8_TC_05(driver);
	p.Bookings();
	logger5.log(Status.PASS, "Proper location name is selected from destination drop down list");
	Thread.sleep(1000);
	p.Date();
	logger5.log(Status.PASS, "Proper date is selected by date text box");
	Thread.sleep(1000);
	p.Adult();
	logger5.log(Status.PASS, "Proper room and Adult is selected by Adult text box");
	Thread.sleep(1000);
	p.GO();
	logger5.log(Status.PASS, "Click on go button and list of hotels page is displyed");
	Thread.sleep(1000);
	POM_TU10_TC_02 p1=new POM_TU10_TC_02(driver);
	p1.View();
	logger5.log(Status.PASS, "Select the proper hotel and click on view button and shows the details of f hotel page is displyed");
	Thread.sleep(1000);
	p1.BookNow();
	logger5.log(Status.PASS, "Click on Book now butto, Payment page is displyed");
	Thread.sleep(1000);
	p1.FirstName(FirstName);
	logger5.log(Status.PASS, "First name entered in first name text box");
	Thread.sleep(1000);
	p1.LastName(LastNaame);
	logger5.log(Status.PASS, "Last name entered in Last name text box");
	Thread.sleep(1000);
	p1.Email(Email);
	logger5.log(Status.PASS, "Email entered in Email text box");
	Thread.sleep(1000);
	p1.ConfirmMail(Email);
	logger5.log(Status.PASS, "Same mail entered in confirm mail text box");
	Thread.sleep(1000);
	p1.CountryFlag();
	logger5.log(Status.PASS, "Proper country and code selected and displyed");
	Thread.sleep(1000);
	p1.Phone(Phone);
	logger5.log(Status.PASS, "Phone number entered in Phone text box");
	Thread.sleep(1000);
	p1.zipcode(Zipcode);
	logger5.log(Status.PASS, "Code entered in zipCode text box");
	Thread.sleep(1000);
	p1.Credit(CreditCard);
	logger5.log(Status.PASS, "Creadit card number entered in Credit card text box");
	Thread.sleep(1000);
	p1.Month();
	logger5.log(Status.PASS, "Proper month is selected from month dropdown list");
	Thread.sleep(1000);
	p1.Year();
	logger5.log(Status.PASS, "Proper Year is selected from year dropdown list");
	Thread.sleep(1000);
	p1.CVV(CVV);
	logger5.log(Status.PASS, "CVV numbers are entered in CVV text box");
	Thread.sleep(1000);
	p1.checkbox();
	logger5.log(Status.PASS, "Check box is slected and displayed");
	Thread.sleep(1000);
	//p1.BookRoom();
	logger5.log(Status.PASS, "Click on the Final Book Room button, finally Thank you page is displayed");
	

}
}