package Signup;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_Signup_errors;
import POM.POM_TU2_TC_01;

public class TU02_TC_05 extends Base {
@Test
public void TestVerifyErrors() throws InterruptedException
{
	logger5=event.createTest("Verify the system behaviour when all the fields are left blank and clicked on \"Create account\" button to create a Traveluro account.");
	POM_TU2_TC_01 p=new POM_TU2_TC_01(driver);
	p.Login();
	logger5.log(Status.PASS, "click on login link");
	Thread.sleep(1000);
	p.sign();
	logger5.log(Status.PASS, "Click on signup link");
	Thread.sleep(1000);
	p.FName(FirstName);
	logger5.log(Status.PASS, "First name is entered");
	Thread.sleep(1000);
	p.Email(Email);
	logger5.log(Status.PASS, "Email is entered");
	Thread.sleep(1000);
	p.Create_account();
	logger5.log(Status.PASS, "Create account button is entered");
	Thread.sleep(1000);
	POM_Signup_errors p1=new POM_Signup_errors(driver);
	p1.PasswordError(SignupPasswordError);
	logger5.log(Status.PASS, "password error is displayed");
	Thread.sleep(1000);
	p1.TermsError(SignupTermsError);
	logger5.log(Status.PASS, "Terms and condition error is displayed");
	Thread.sleep(1000);
	p1.PricacyError(SignupPrivacyError);
	logger5.log(Status.PASS, "Privacy error is displayed");
	Thread.sleep(1000);
}
}
