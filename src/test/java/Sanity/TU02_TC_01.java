
package Sanity;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_TU2_TC_01;

import TestCases.Listener;
@Listeners(Listener.class)
public class TU02_TC_01 extends Base{
	@Test
	public void TestSignUp() throws InterruptedException
	{
		logger1=event.createTest("Verify the system behaviour when valid first name, last name, email id, password,  confirm password is entered along with terms of service and privacy policy checkboxes are checked and clicked on 'Create account' button");
		POM_TU2_TC_01 p=new POM_TU2_TC_01(driver);
		p.Login();
		logger1.log(Status.PASS, "Login to traveluro page is displayed");
		Thread.sleep(1000);
		p.sign();
		logger1.log(Status.PASS, "Sign up to traveluro  page should is displayed");
		Thread.sleep(1000);
		p.FName(FirstName);
		logger1.log(Status.PASS, "First and last name is Entered");
		Thread.sleep(1000);
		p.Email(Email);
		logger1.log(Status.PASS, "Email is Entered");
		Thread.sleep(1000);
		p.Password(Password);
		logger1.log(Status.PASS, "Password is Entered");
		Thread.sleep(1000);
		p.passConform(Password);
		logger1.log(Status.PASS,"Confirm Password is Entered");
		Thread.sleep(1000);
		p.Terms();
		logger1.log(Status.PASS, "Terms of service Check box is selected");
		Thread.sleep(1000);
		p.Privecy();
		logger1.log(Status.PASS, "Privacy and Policy Check box is selected");
		Thread.sleep(1000);
		p.Create_account();
		logger1.log(Status.PASS, "Privacy and Policy Check box is selected");
		Thread.sleep(1000);
		p.SignupExistError(SignupExistError);
		logger1.log(Status.PASS, "Exist account error message is displayed");
	}
}
