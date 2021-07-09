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
public void VerifyWithAllInputs() throws InterruptedException
{

	logger2 =event.createTest("Verify the system behaviour when valid values are provided to all the required fields and clicked on 'Book this room' button.");
	POM_TU8_TC_05 p=new POM_TU8_TC_05(driver);
	p.Destination();
	logger2.log(Status.PASS, "Destination place is selected");
	Thread.sleep(1000);
	p.Date();
	logger2.log(Status.PASS, "Expected date selected");
	Thread.sleep(1000);
	p.Adult();
	logger2.log(Status.PASS, "Room and Adults is selected");
	Thread.sleep(1000);
	p.GO();
	logger2.log(Status.PASS, "Click on go button");
	Thread.sleep(1000);
	POM_TU10_TC_02 p1=new POM_TU10_TC_02(driver);
	p1.View();
	logger2.log(Status.PASS, "Click on view button");
	Thread.sleep(1000);
	p1.BookNow();
	logger2.log(Status.PASS, "Click on Book now button");
	Thread.sleep(1000);
	p1.FirstName(FirstName);
	logger2.log(Status.PASS, "First name entered in first name text box");
	Thread.sleep(1000);
	p1.LastName(LastNaame);
	logger2.log(Status.PASS, "Last name entered in Last name text box");
	Thread.sleep(1000);
	p1.Email(Email);
	logger2.log(Status.PASS, "Email entered in Email text box");
	Thread.sleep(1000);
	p1.ConfirmMail(Email);
	logger2.log(Status.PASS, "Same mail entered in confirm mail text box");
	Thread.sleep(1000);
	p1.CountryFlag();
	logger2.log(Status.PASS, "Proper country and code selected and displyed");
	Thread.sleep(1000);
	p1.Phone(Phone);
	logger2.log(Status.PASS, "Phone number entered in Phone text box");
	Thread.sleep(1000);
	p1.zipcode(Zipcode);
	logger2.log(Status.PASS, "Code entered in zipCode text box");
	Thread.sleep(1000);
	p1.Credit(CreditCard);
	logger2.log(Status.PASS, "Creadit card number entered in Credit card text box");
	Thread.sleep(1000);
	p1.Month();
	logger2.log(Status.PASS, "Proper month is selected from month dropdown list");
	Thread.sleep(1000);
	p1.Year();
	logger2.log(Status.PASS, "Proper Year is selected from year dropdown list");
	Thread.sleep(1000);
	p1.CVV(CVV);
	logger2.log(Status.PASS, "CVV numbers are entered in CVV text box");
	Thread.sleep(1000);
	p1.checkbox();
	logger2.log(Status.PASS, "Check box is slected and displayed");
	Thread.sleep(1000);
	//p1.BookRoom();
	//logger2.log(Status.PASS, "Click on the Final Book Room button, finally Thank you page is displayed");
	

}
}
