package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_TU8_TC_05;
@Listeners(Listener.class)
public class TU8_TC_05 extends Base {
@Test
public void TestDestination() throws InterruptedException
{
	logger4=event.createTest("Search Page");
	POM_TU8_TC_05 p=new POM_TU8_TC_05(driver);
	p.Bookings();
	logger4.log(Status.PASS, "Selected the perticuler destination");
	Thread.sleep(1000);
	p.Date();
	logger4.log(Status.PASS, "Selected the proper dates");
	Thread.sleep(1000);
	p.Adult();
	logger4.log(Status.PASS, " Set the audlt and room quantity");
	Thread.sleep(1000);
	p.GO();
	logger4.log(Status.PASS, "Click on Go button, List of hotels page is displayed");
	
}
}
