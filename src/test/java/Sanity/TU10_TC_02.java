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
	logger10 =event.createTest("Verify the system behaviour when valid values are provided to all the required fields and clicked on 'Book this room' button.");
	POM_TU8_TC_05 p=new POM_TU8_TC_05(driver);
	p.Destination();
	log.info("Destination place is selected");
	logger10.log(Status.PASS, "Destination place is selected");
	Thread.sleep(1000);
	p.Date();
	log.info("Date is selected");
	logger10.log(Status.PASS, "Date is selected");
	Thread.sleep(1000);
	p.Adult();
	log.info("Room and Adults is selected");
	logger10.log(Status.PASS, "Room and Adults is selected");
	Thread.sleep(1000);
	p.GO();
	log.info("Click on go button");
	logger10.log(Status.PASS, "Click on go button");
	Thread.sleep(1000);
	POM_TU10_TC_02 p1=new POM_TU10_TC_02(driver);
	p1.View();
	log.info("Click on view button");
	logger10.log(Status.PASS, "expected hotel selected");
	Thread.sleep(1000);
	p1.BookNow();
	log.info("Click on bookNow button");
	logger10.log(Status.PASS, "Click on Book now button");
	Thread.sleep(1000);
	p1.FirstName(FirstName);
	log.info("First name entered");
	logger10.log(Status.PASS, "First name entered");
	Thread.sleep(1000);
	p1.LastName(LastNaame);
	log.info("Last name entered");
	logger10.log(Status.PASS, "Last name entered in Last name text box");
	Thread.sleep(1000);
	p1.Email(Email);
	log.info("Email is entered");
	logger10.log(Status.PASS, "Email entered in Email text box");
	Thread.sleep(1000);
	p1.ConfirmMail(Email);
	log.info("Confirmation email is entered");
	logger10.log(Status.PASS, "Same mail entered in confirm mail text box");
	Thread.sleep(1000);
	p1.CountryFlag();
	log.info("Country flag is selected");
	logger10.log(Status.PASS, "Proper country and code selected and displyed");
	Thread.sleep(1000);
	p1.Phone(Phone);
	log.info("Phone number is entered");
	logger10.log(Status.PASS, "Phone number entered in Phone text box");
	Thread.sleep(1000);
	p1.zipcode(Zipcode);
	log.info("Zip code is entered");
	logger10.log(Status.PASS, "Code entered in zipCode text box");
	Thread.sleep(1000);
	p1.Credit(CreditCard);
	log.info("Credit card number is entered");
	logger10.log(Status.PASS, "Creadit card number entered in Credit card text box");
	Thread.sleep(1000);
	p1.Month();
	log.info("credit card monthe is selected");
	logger10.log(Status.PASS, "Proper month is selected from month dropdown list");
	Thread.sleep(1000);
	p1.Year();
	log.info("Credit card year selected");
	logger10.log(Status.PASS, "Proper Year is selected from year dropdown list");
	Thread.sleep(1000);
	p1.CVV(CVV);
	log.info("credit card CVV number is entered");
	logger10.log(Status.PASS, "CVV numbers are entered in CVV text box");
	Thread.sleep(1000);
	p1.checkbox();
	log.info(" conditions Checkbox is selected");
	logger10.log(Status.PASS, "Check box is slected and displayed");
	Thread.sleep(1000);
	p1.BookRoom();
	log.info("Click on Book this room button");
	logger10.log(Status.PASS, "Click on the Book Room button");
	Thread.sleep(1000);
	p1.ValidConfirmation(ConfirmationValid);
	log.info("Verified the confirmation page");
	logger10.log(Status.PASS, "Verified the confirmation Page");
	Thread.sleep(3000);
}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
