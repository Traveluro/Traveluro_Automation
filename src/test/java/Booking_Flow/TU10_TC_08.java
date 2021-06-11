package Booking_Flow;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_Booking_errors;
import POM.POM_TU10_TC_02;
import POM.POM_TU8_TC_05;

public class TU10_TC_08 extends Base {
@Test
public void TestvrifyErrors() throws InterruptedException
{
	logger8 =event.createTest("Error verify in booking page with first and last name, Email, confirmEmail and Prone");
	POM_TU8_TC_05 p=new POM_TU8_TC_05(driver);
	p.Bookings();
	logger8.log(Status.PASS, "Destination name is selected");
	Thread.sleep(1000);
	p.Date();
	logger8.log(Status.PASS, "Booking Date is seletced");
	Thread.sleep(1000);
	p.Adult();
	logger8.log(Status.PASS, "room, adult numbers is added");
	Thread.sleep(1000);
	p.GO();
	logger8.log(Status.PASS, "Go button is entered");
	Thread.sleep(1000);
	POM_TU10_TC_02 p1=new POM_TU10_TC_02(driver);
	p1.View();
	logger8.log(Status.PASS, "requred hotel is selected and view button is entered");
	Thread.sleep(1000);
	p1.BookNow();
	logger8.log(Status.PASS, "Book Now button is entered");
	Thread.sleep(1000);
	p1.FirstName(FirstName);
	logger8.log(Status.PASS, "First name is entered");
	Thread.sleep(1000);
	p1.LastName(LastNaame);
	logger8.log(Status.PASS, "Last name is entered");
	Thread.sleep(1000);
	p1.Email(Email);
	logger8.log(Status.PASS, "Email address is entered");
	Thread.sleep(1000);
	p1.ConfirmMail(ConfirmEmail);
	logger8.log(Status.PASS, "Confirm Email address is entered");
	Thread.sleep(1000);
	p1.CountryFlag();
	logger8.log(Status.PASS, "Country code is selected");
	Thread.sleep(1000);
	p1.Phone(Phone);
	logger8.log(Status.PASS, "Phone number is entered");
	Thread.sleep(1000);
	p1.BookRoom();
	logger8.log(Status.PASS, "Book room button is enterd");
	Thread.sleep(1000);
	POM_Booking_errors p3=new POM_Booking_errors(driver);
	p3.VerifyZipcodeError(Zipcode_error);
	logger8.log(Status.PASS, "Verified the zipcode error");
	Thread.sleep(1000);
	p3.VerifyCredCardError(Cread_error);
	logger8.log(Status.PASS, "Verified the credit card error");
	Thread.sleep(1000);
	p3.VerifyHolderNameError(Holdname_error);
	logger8.log(Status.PASS, "Verified Card Holder name error");
	Thread.sleep(1000);
	p3.VerifyCVVError(cvv_error);
	logger8.log(Status.PASS, "Verified the CVV error");
	Thread.sleep(1000);
}
}
