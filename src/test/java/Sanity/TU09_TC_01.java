package Sanity;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_TU10_TC_02;
import POM.POM_TU8_TC_05;
import POM.POM_TU9_TC_01;

public class TU09_TC_01 extends Base{
@Test
public void SearchPage() throws InterruptedException
{
	logger9 =event.createTest("Verify the system behaviour of the Search page with click on view button");
	POM_TU8_TC_05 p=new POM_TU8_TC_05(driver);
	p.Destination();
	logger9.log(Status.PASS, "Destination place is selected");
	Thread.sleep(1000);
	p.Date();
	logger9.log(Status.PASS, "Expected date selected");
	Thread.sleep(1000);
	p.Adult();
	logger9.log(Status.PASS, "Room and Adults is selected");
	Thread.sleep(1000);
	p.GO();
	logger9.log(Status.PASS, "Click on go button");
	Thread.sleep(1000);
	POM_TU10_TC_02 p1=new POM_TU10_TC_02(driver);
	p1.View();
	logger9.log(Status.PASS, "expected hotel selected");
	Thread.sleep(1000);
	POM_TU9_TC_01 p2=new POM_TU9_TC_01(driver);
	p2.VerifyHotelpage(Hotelvalid);
	logger9.log(Status.PASS, "Verified hotel page");
	Thread.sleep(1000);
}
}
