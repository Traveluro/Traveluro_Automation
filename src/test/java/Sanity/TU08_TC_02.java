package Sanity;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_TU8_TC_05;

public class TU08_TC_02 extends Base {
@Test
public void HomPage() throws InterruptedException
{
	try {
		logger8 =event.createTest("Verify the system behaviour of the 'Destination' field dropdown list when any value is typed/entered.");
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
		logger8.log(Status.PASS, "Verified the seaarch page");
}catch (Exception e) {
	System.out.println(e.getMessage());
}}
}
