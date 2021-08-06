package Signup;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Header_Base.Base;
import POM.POM_Signup_errors;
import POM.POM_TU2_TC_01;

public class TU02_TC_03 extends Base {
@Test
public void TestVerifyError() throws InterruptedException
{
	logger3=event.createTest("Verify the system behaviour when only the valid first name is entered and clicked on Create account button.");
	POM_TU2_TC_01 p=new POM_TU2_TC_01(driver);
	p.Login();
	logger3.log(Status.PASS, "click on login link");
	Thread.sleep(1000);
	p.sign();
	logger3.log(Status.PASS, "Click on signup link");
	Thread.sleep(1000);
	p.FName(FirstName);
	logger3.log(Status.PASS, "First name is entered");
	Thread.sleep(1000);
	p.Create_account();
	logger3.log(Status.PASS, "Create account button is entered");
	Thread.sleep(1000);
	POM_Signup_errors p1=new POM_Signup_errors(driver);
	p1.EmailError(SignupEmailError);
	logger3.log(Status.PASS, "Email error is displayed");
	Thread.sleep(1000);
	p1.PasswordError(SignupPasswordError);
	logger3.log(Status.PASS, "password error is displayed");
	Thread.sleep(1000);
	p1.TermsError(SignupTermsError);
	logger3.log(Status.PASS, "Terms and condition error is displayed");
	Thread.sleep(1000);
	p1.PricacyError(SignupPrivacyError);
	logger3.log(Status.PASS, "Privacy error is displayed");
	Thread.sleep(1000);
}
}
