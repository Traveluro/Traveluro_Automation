package Sanity;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_TU2_TC_01;
import POM.POM_TU3_TC_01;

public class TU03_TC_01 extends Base {
	@Test
public void TestVerifyLogin() throws InterruptedException {
	
		
		
		POM_TU2_TC_01 p=new POM_TU2_TC_01(driver);
		p.Login();
		
		Thread.sleep(1000);
		POM_TU3_TC_01 p1=new POM_TU3_TC_01(driver);
		p1.email(Email);
		
		Thread.sleep(1000);
		p1.PassWord(Password);
		
		Thread.sleep(1000);
		p1.submit();
		
		Thread.sleep(1000);
		p1.VerifyLogOn(LogonValid);
		
		Thread.sleep(2000);
	
}
}
