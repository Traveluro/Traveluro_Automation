package Booking_Flow;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_Booking_errors;
import POM.POM_TU10_TC_02;
import POM.POM_TU8_TC_05;

public class TU10_TC_06 extends Base {
@Test
public void TestVerifyErrors() throws InterruptedException
{
	logger6 =event.createTest("Verify the system behaviour when only the 'First name', 'Last Name', valid 'Email id' and valid 'Confirm Email id' is entered under 'Guest Details' section and clicked on 'Book this room' button.");
	POM_TU8_TC_05 p=new POM_TU8_TC_05(driver);
	p.Destination();
	logger6.log(Status.PASS, "Destination place is selected");
	Thread.sleep(1000);
	p.Date();
	logger6.log(Status.PASS, "Expected date selected");
	Thread.sleep(1000);
	p.Adult();
	logger6.log(Status.PASS, "Room and Adults is selected");
	Thread.sleep(1000);
	p.GO();
	logger6.log(Status.PASS, "Click on go button");
	Thread.sleep(1000);
	POM_TU10_TC_02 p1=new POM_TU10_TC_02(driver);
	p1.View();
	logger6.log(Status.PASS, "Click on view button");
	Thread.sleep(1000);
	p1.BookNow();
	logger6.log(Status.PASS, "Click on Book now button");
	Thread.sleep(1000);
	p1.FirstName(FirstName);
	logger6.log(Status.PASS, "First name is entered");
	Thread.sleep(1000);
	p1.LastName(LastNaame);
	logger6.log(Status.PASS, "Last name is entered");
	Thread.sleep(1000);
	p1.Email(Email);
	logger6.log(Status.PASS, "Email address is entered");
	Thread.sleep(1000);
	p1.BookRoom();
	logger6.log(Status.PASS, "Book room button is enterd");
	Thread.sleep(1000);
	POM_Booking_errors p3=new POM_Booking_errors(driver);
	p3.VerifyEmailconfirmError(Emailconfirm_error);
	logger6.log(Status.PASS, "Verified the confirm email error");
	Thread.sleep(1000);
	p3.VerifyPhoneError(phone_error);
	logger6.log(Status.PASS, "Verified the Phone error");
	Thread.sleep(1000);
	p3.VerifyZipcodeError(Zipcode_error);
	logger6.log(Status.PASS, "Verified the zipcode error");
	Thread.sleep(1000);
	p3.VerifyCredCardError(Cread_error);
	logger6.log(Status.PASS, "Verified the credit card error");
	Thread.sleep(1000);
	p3.VerifyCVVError(cvv_error);
	logger6.log(Status.PASS, "Verified the CVV error");
	Thread.sleep(1000);
}
}
