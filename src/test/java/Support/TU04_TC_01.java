package Support;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Header_Base.Base;
import POM.POM_Portal;
import POM.POM_TU4_TC_01;

public class TU04_TC_01 extends Base {
@Test
public void VerifySuppoort() throws InterruptedException
{
	
	logger1=event.createTest("Verify the URL Portal");
	POM_TU4_TC_01 p=new POM_TU4_TC_01(driver);
	p.Support();
	log.info("-------Click on support link------");
	logger1.log(Status.PASS, "click on support link"); 
	Thread.sleep(1000);
	p.Contactus();
	log.info("-------Select the contactUs option------");
	logger1.log(Status.PASS, "Select the contactUs option"); 
	Thread.sleep(1000);
	p.SupportteamLink();
	log.info("-------Contact our support team link is clicked------");
	logger1.log(Status.PASS, "Contact our support team link is clicked"); 
	Thread.sleep(1000);
	p.Email();
	log.info("-------Email is Entered------");
	logger1.log(Status.PASS, "Email is entered"); 
	Thread.sleep(4000);
}
}
