package TestCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_Gooogle_Compaign;

public class Google_Compaign extends Base1 {
@Test
public void TestGoogle() throws InterruptedException
{
	
	logger=event.createTest("Google compaign");
	POM_Gooogle_Compaign p=new POM_Gooogle_Compaign(driver);
	p.Search();
	logger.log(Status.PASS, "Value entered in Google Search text Box");
	Thread.sleep(100);
	p.Go();
	logger.log(Status.PASS, "Click on Search button, Perticuler destination is displayed");
	Thread.sleep(100);
	p.Hotels();
	logger.log(Status.PASS, "Click on count of hotel link, List of hotels page is displyed");
	Thread.sleep(100);
	
	p.Prices();
	logger.log(Status.PASS, "Click on Price button in perticuler hotel, List of Booking site page is displyed");
	Thread.sleep(100);
	p.VisitSite();
	logger.log(Status.PASS, "Select the traveluro site, Traveluro booking page is displayed");
	Thread.sleep(1000);
	p.BookNow();

}
}
