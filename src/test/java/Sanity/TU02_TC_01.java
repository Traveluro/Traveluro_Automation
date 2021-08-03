
package Sanity;


import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_TU2_TC_01;



public class TU02_TC_01 extends Base{
	@Test
	public void TestSignUp() throws InterruptedException
	{
		
		logger2=event.createTest("Verify the system behaviour when valid first name, last name, email id, password,  confirm password is entered along with terms of service and privacy policy checkboxes are checked and clicked on 'Create account' button");
		POM_TU2_TC_01 p=new POM_TU2_TC_01(driver);
		p.Login();
		log.info("Click on login link");
		logger2.log(Status.PASS, "Login to traveluro page is displayed");
		Thread.sleep(1000);
		p.sign();
		log.info("Click on SignUp link");
		logger2.log(Status.PASS, "Sign up to traveluro  page should is displayed");
		Thread.sleep(1000);
		p.FName(FirstName);
		log.info("First name entered");
		logger2.log(Status.PASS, "First and last name is Entered");
		Thread.sleep(1000);
		p.Email(Email);
		log.info("Email is entered");
		logger2.log(Status.PASS, "Email is Entered");
		Thread.sleep(1000);
		p.Password(Password);
		log.info("password is entered");
		logger2.log(Status.PASS, "Password is Entered");
		Thread.sleep(1000);
		p.passConform(Password);
		log.info("Confirmation password is entered");
		logger2.log(Status.PASS,"Confirm Password is Entered");
		Thread.sleep(1000);
		p.Terms();
		log.info("Terms of service check box is Selected");
		logger2.log(Status.PASS, "Terms of service Check box is selected");
		Thread.sleep(1000);
		p.Privecy();
		log.info("Privacy and Policy Check box is selected");
		logger2.log(Status.PASS, "Privacy and Policy Check box is selected");
		Thread.sleep(1000);
		p.Create_account();
		log.info("Click on create account button");
		logger2.log(Status.PASS, "Click on create account button");
		Thread.sleep(2000);
		p.SignupExistError(SignupExistError);
		log.info("Exist account error message is displayed");
		logger2.log(Status.PASS, "Exist account error message is displayed");
		Thread.sleep(2000);
	}
}
