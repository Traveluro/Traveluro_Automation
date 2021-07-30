package Sanity;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_TU8_TC_05;

public class TU08_TC_02 extends Base {
@Test
public void HomPage() throws InterruptedException
{
	
		logger8=event.createTest("Verifing the home page ");
		POM_TU8_TC_05 p=new POM_TU8_TC_05(driver);
		p.Destination();
		logger8.log(Status.PASS, "Destination place is selected");
		Thread.sleep(1000);
		p.Date();
		logger8.log(Status.PASS, "Expected date selected");
		Thread.sleep(1000);
		p.Adult();
		logger8.log(Status.PASS, "Room and Adults is selected");
		Thread.sleep(1000);
		p.GO();
		logger8.log(Status.PASS, "Click on go button");
		Thread.sleep(1000);
		p.VerifySearchedLocation(SearchValid);
		logger8.log(Status.PASS, "Verified the search page");
		Thread.sleep(3000);
}
}
