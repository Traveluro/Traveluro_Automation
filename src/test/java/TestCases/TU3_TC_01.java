package TestCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_TU2_TC_01;
import POM.POM_TU3_TC_01;

public class TU3_TC_01 extends Base {
@Test
public void TestLogin() throws InterruptedException
{
	logger2 =event.createTest("Login");
	POM_TU2_TC_01 p=new POM_TU2_TC_01(driver);
	p.Login();
	logger2.log(Status.PASS, "login to traveluro page is displayed");
	Thread.sleep(1000);
	POM_TU3_TC_01 p1=new POM_TU3_TC_01(driver);
	p1.email("abhilashg436@gmail.com");
	logger2.log(Status.PASS, "Email is Entered");
	Thread.sleep(1000);
	p1.PassWord("Abhi@987");
	logger2.log(Status.PASS, "Password is Entered");
	Thread.sleep(1000);
	p1.submit();
	logger2.log(Status.PASS, "Click on login, Traveluro home page is displayed and also shows the Log on the user");
	Thread.sleep(1000);

}
}
