package Signup;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_Signup_errors;
import POM.POM_TU2_TC_01;

public class TU02_TC_06 extends Base {
@Test
public void TestVerifyErrors()throws InterruptedException
{
	logger6=event.createTest("Verify the system behaviour when all the fields are left blank and clicked on \"Create account\" button to create a Traveluro account.");
	POM_TU2_TC_01 p=new POM_TU2_TC_01(driver);
	p.Login();
	logger6.log(Status.PASS, "click on login link");
	Thread.sleep(1000);
	p.sign();
	logger6.log(Status.PASS, "Click on signup link");
	Thread.sleep(1000);
	p.FName(FirstName);
	logger6.log(Status.PASS, "First name is entered");
	Thread.sleep(1000);
	p.Email(Email);
	logger6.log(Status.PASS, "Email is entered");
	Thread.sleep(1000);
	p.Password(Password);
	logger6.log(Status.PASS, "Password is entered");
	Thread.sleep(1000);
	p.Create_account();
	logger6.log(Status.PASS, "Create account button is entered");
	Thread.sleep(1000);
	POM_Signup_errors p1=new POM_Signup_errors(driver);
	p1.PasswordError(SignupPasswordError);
	logger6.log(Status.PASS, "Confirm password error is displayed");
	Thread.sleep(1000);
	p1.TermsError(SignupTermsError);
	logger6.log(Status.PASS, "Terms and condition error is displayed");
	Thread.sleep(1000);
	p1.PricacyError(SignupPrivacyError);
	logger6.log(Status.PASS, "Privacy error is displayed");
	Thread.sleep(1000);
}
}
