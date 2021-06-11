package Booking_Flow;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_Booking_errors;
import POM.POM_TU10_TC_02;
import POM.POM_TU8_TC_05;

public class TU10_TC_10 extends Base{
@Test
public void TestVerifyErrors() throws InterruptedException
{
	logger10 =event.createTest("Error verify in booking page with first and last name, Email, confirmEmail, Prone, zipcode and credit card entered");
	POM_TU8_TC_05 p=new POM_TU8_TC_05(driver);
	p.Bookings();
	logger10.log(Status.PASS, "Destination name is selected");
	Thread.sleep(1000);
	p.Date();
	logger10.log(Status.PASS, "Booking Date is seletced");
	Thread.sleep(1000);
	p.Adult();
	logger10.log(Status.PASS, "room, adult numbers is added");
	Thread.sleep(1000);
	p.GO();
	logger10.log(Status.PASS, "Go button is entered");
	Thread.sleep(1000);
	POM_TU10_TC_02 p1=new POM_TU10_TC_02(driver);
	p1.View();
	logger10.log(Status.PASS, "requred hotel is selected and view button is entered");
	Thread.sleep(1000);
	p1.BookNow();
	logger10.log(Status.PASS, "Book Now button is entered");
	Thread.sleep(1000);
	p1.FirstName(FirstName);
	logger10.log(Status.PASS, "First name is entered");
	Thread.sleep(1000);
	p1.LastName(LastNaame);
	logger10.log(Status.PASS, "Last name is entered");
	Thread.sleep(1000);
	p1.Email(Email);
	logger10.log(Status.PASS, "Email address is entered");
	Thread.sleep(1000);
	p1.ConfirmMail(ConfirmEmail);
	logger10.log(Status.PASS, "Confirm Email address is entered");
	Thread.sleep(1000);
	p1.Phone(Phone);
	logger10.log(Status.PASS, "Phone number is entered");
	Thread.sleep(1000);
	p1.zipcode(Zipcode);
	logger10.log(Status.PASS, "zipcode is entered");
	Thread.sleep(1000);
	p1.Credit(CreditCard);
	logger10.log(Status.PASS, "Credit card is entered");
	Thread.sleep(1000);
	p1.BookRoom();
	logger10.log(Status.PASS, "Book room button is enterd");
	Thread.sleep(1000);
	POM_Booking_errors p3=new POM_Booking_errors(driver);
	p3.VerifyCVVError(cvv_error);
	logger10.log(Status.PASS, "Verified the CVV error");
	Thread.sleep(1000);
}
}
