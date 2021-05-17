package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_TU2_TC_01;
@Listeners(Listener.class)
public class TU2_TC_01 extends Base{
	@Test
	public void TestSignUp() throws InterruptedException
	{
		logger6=event.createTest("SignUp");
		POM_TU2_TC_01 p=new POM_TU2_TC_01(driver);
		p.Login();
		logger6.log(Status.PASS, "Login to traveluro page is displayed");
		Thread.sleep(1000);
		p.sign();
		logger6.log(Status.PASS, "Sign up to traveluro  page should is displayed");
		Thread.sleep(1000);
		p.FName("Arjun gowda");
		logger6.log(Status.PASS, "First and last name is Entered");
		Thread.sleep(1000);
		p.Email("Arjungowda11@gmail.com");
		logger6.log(Status.PASS, "Email is Entered");
		Thread.sleep(1000);
		p.Password("Arjun@123");
		logger6.log(Status.PASS, "Password is Entered");
		Thread.sleep(1000);
		p.passConform("Arjun@123");
		logger6.log(Status.PASS,"Confirm Password is Entered");
		Thread.sleep(1000);
		p.Terms();
		logger6.log(Status.PASS, "Terms of service Check box is selected");
		Thread.sleep(1000);
		p.Privecy();
		logger6.log(Status.PASS, "Privacy and Policy Check box is selected");
		Thread.sleep(1000);
		
	}
}
