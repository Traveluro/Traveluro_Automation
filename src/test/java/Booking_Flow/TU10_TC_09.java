package Booking_Flow;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Header_Base.Base;
import POM.POM_Booking_errors;
import POM.POM_TU10_TC_02;
import POM.POM_TU8_TC_05;

public class TU10_TC_09 extends Base{
@Test
public void TestVerifyErrorswithZipCode() throws InterruptedException
{
	logger9 =event.createTest("Verify the system behaviour when only the 'First name', 'Last Name', valid 'Email id' , valid 'Confirm Email id' , 'Respective country code flag with valid phone number', 'Country' and 'Zip Code' is entered under 'Guest Details' section and clicked on 'Book this room' button.");
	POM_TU8_TC_05 p=new POM_TU8_TC_05(driver);
	p.Destination();
	logger9.log(Status.PASS, "Destination place is selected");
	Thread.sleep(1000);
	p.Date();
	logger9.log(Status.PASS, "Expected date selected");
	Thread.sleep(1000);
	p.Adult();
	logger9.log(Status.PASS, "Room and Adults is selected");
	Thread.sleep(1000);
	p.GO();
	logger9.log(Status.PASS, "Click on go button");
	Thread.sleep(1000);
	POM_TU10_TC_02 p1=new POM_TU10_TC_02(driver);
	p1.View();
	logger9.log(Status.PASS, "Click on view button");
	Thread.sleep(1000);
	p1.BookNow();
	logger9.log(Status.PASS, "Click on Book now button");
	Thread.sleep(1000);
	p1.FirstName(FirstName);
	logger9.log(Status.PASS, "First name is entered");
	Thread.sleep(1000);
	p1.LastName(LastNaame);
	logger9.log(Status.PASS, "Last name is entered");
	Thread.sleep(1000);
	p1.Email(Email);
	logger9.log(Status.PASS, "Email address is entered");
	Thread.sleep(1000);
	p1.ConfirmMail(Email);
	logger9.log(Status.PASS, "Confirm Email address is entered");
	Thread.sleep(1000);
	p1.CountryFlag();
	logger9.log(Status.PASS, "Country code is selected");
	Thread.sleep(1000);
	p1.Phone(Phone);
	logger9.log(Status.PASS, "Phone number is entered");
	Thread.sleep(1000);
	p1.zipcode(Zipcode);
	logger9.log(Status.PASS, "zipcode is entered");
	Thread.sleep(1000);
	p1.BookRoom();
	logger9.log(Status.PASS, "Book room button is enterd");
	Thread.sleep(1000);
	POM_Booking_errors p3=new POM_Booking_errors(driver);
	p3.VerifyCredCardError(Cread_error);
	logger9.log(Status.PASS, "Verified the credit card error");
	Thread.sleep(1000);
	p3.VerifyCVVError(cvv_error);
	logger9.log(Status.PASS, "Verified the CVV error");
	Thread.sleep(1000);
}
}
