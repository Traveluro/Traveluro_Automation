package Signup;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Header_Base.Base;
import POM.POM_Signup_errors;
import POM.POM_TU2_TC_01;

public class TU02_TC_09 extends Base{
@Test
public void TestVerifyError() throws InterruptedException
{
	logger8=event.createTest(" Verify the system behaviour when only the valid email id, password, confirm password and 'terms of service'  & 'privacy policy' checkboxes are checked and clicked on Create account button.");
	POM_TU2_TC_01 p=new POM_TU2_TC_01(driver);
	p.Login();
	logger8.log(Status.PASS, "click on login link");
	Thread.sleep(1000);
	p.sign();
	logger8.log(Status.PASS, "Click on signup link");
	Thread.sleep(1000);
	p.Email(Email);
	logger8.log(Status.PASS, "Email is entered");
	Thread.sleep(1000);
	p.Password(Password);
	logger8.log(Status.PASS, "password is entered");
	Thread.sleep(1000);
	p.passConform(Password);
	logger8.log(Status.PASS, "Confirm password is entered");
	Thread.sleep(1000);
	p.Terms();
	logger8.log(Status.PASS, "Terms ans condiion check box entered");
	Thread.sleep(1000);
	p.Privecy();
	logger8.log(Status.PASS, "Terms ans condiion check box entered");
	Thread.sleep(1000);
	p.Create_account();
	logger8.log(Status.PASS, "Create account button is entered");
	Thread.sleep(1000);
	POM_Signup_errors p1=new POM_Signup_errors(driver);
	p1.PricacyError(SignupPrivacyError);
	logger8.log(Status.PASS, "Privacy error is displayed");
	Thread.sleep(1000);

	}
}
