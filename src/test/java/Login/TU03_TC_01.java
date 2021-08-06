package Login;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Header_Base.Base;
import POM.POM_TU2_TC_01;
import POM.POM_TU3_TC_01;

public class TU03_TC_01 extends Base {
	@Test
public void TestVerifyLogin() throws InterruptedException {
	{
		logger1 =event.createTest("Login");
		POM_TU2_TC_01 p=new POM_TU2_TC_01(driver);
		p.Login();
		logger1.log(Status.PASS, "login link is clicked");
		Thread.sleep(1000);
		POM_TU3_TC_01 p1=new POM_TU3_TC_01(driver);
		p1.email(Email);
		logger1.log(Status.PASS, "Email is Entered");
		Thread.sleep(1000);
		p1.PassWord(Password);
		logger1.log(Status.PASS, "Password is Entered");
		Thread.sleep(1000);
		p1.submit();
		logger1.log(Status.PASS, "Click on login, Traveluro home page is displayed and also shows the Log on the user");
		Thread.sleep(1000);
		
	}
}
}
