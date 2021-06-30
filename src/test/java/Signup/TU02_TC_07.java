package Signup;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_Signup_errors;
import POM.POM_TU2_TC_01;

public class TU02_TC_07 extends Base {
@Test
public void TestVerifyErros() throws InterruptedException
{
	logger7=event.createTest("Verify he system behaviour when only the valid first name, last name, email id, password and confirm password is entered and clicked on Create account button.");
	POM_TU2_TC_01 p=new POM_TU2_TC_01(driver);
	p.Login();
	logger7.log(Status.PASS, "click on login link");
	Thread.sleep(1000);
	p.sign();
	logger7.log(Status.PASS, "Click on signup link");
	Thread.sleep(1000);
	p.FName(FirstName);
	logger7.log(Status.PASS, "First name is entered");
	Thread.sleep(1000);
	p.Email(Email);
	logger7.log(Status.PASS, "Email is entered");
	Thread.sleep(1000);
	p.Password(Password);
	logger7.log(Status.PASS, "password is entered");
	Thread.sleep(1000);
	p.passConform(Password);
	logger7.log(Status.PASS, "Confirmation password is entered");
	Thread.sleep(1000);
	p.Create_account();
	logger7.log(Status.PASS, "Create account button is entered");
	Thread.sleep(1000);
	POM_Signup_errors p1=new POM_Signup_errors(driver);
	p1.TermsError(SignupTermsError);
	logger7.log(Status.PASS, "Terms and condition error is displayed");
	Thread.sleep(1000);
	p1.PricacyError(SignupPrivacyError);
	logger7.log(Status.PASS, "Privacy error is displayed");
	Thread.sleep(1000);
}
}
