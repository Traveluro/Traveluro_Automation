package Sanity;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_TU2_TC_01;
import POM.POM_TU3_TC_01;

public class TU03_TC_01 extends Base {
	@Test
public void TestVerifyLogin() throws InterruptedException {
	
		
		logger3 =event.createTest("Verify the system behaviour when valid email and password is entered and clicked on Login button.");
		POM_TU2_TC_01 p=new POM_TU2_TC_01(driver);
		p.Login();
		log.info("login link is clicked");
		logger3.log(Status.PASS, "login link is clicked");
		Thread.sleep(1000);
		POM_TU3_TC_01 p1=new POM_TU3_TC_01(driver);
		p1.email(Email);
		log.info("Email is Entered");
		logger3.log(Status.PASS, "Email is Entered");
		Thread.sleep(1000);
		p1.PassWord(Password);
		log.info("Password is Entered");
		logger3.log(Status.PASS, "Password is Entered");
		Thread.sleep(1000);
		p1.submit();
		log.info("Click on login button");
		logger3.log(Status.PASS, "Click on login, Traveluro home page is displayed and also shows the Log on the user");
		Thread.sleep(1000);
		p1.VerifyLogOn(LogonValid);
		log.info("verified the logon user name");
		logger3.log(Status.PASS, "Validated the logon the user");
		Thread.sleep(2000);
	
}
}
