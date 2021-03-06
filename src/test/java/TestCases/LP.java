package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_TU8_TC_05;
import POM.POM_TU10_TC_02;
@Listeners(Listener.class)
public class LP extends Base{
@Test
public void TestLP() throws InterruptedException
{
	logger8 =event.createTest("Landing Page");
	POM_TU8_TC_05 p=new POM_TU8_TC_05(driver);
	p.Destination();
	logger8.log(Status.PASS, "Proper location name is selected from destination drop down list");
	Thread.sleep(1000);
	p.Date();
	logger8.log(Status.PASS, "Proper date is selected by date text box");
	Thread.sleep(1000);
	p.Adult();
	logger8.log(Status.PASS, "Proper room and Adult is selected by Adult text box");
	Thread.sleep(1000);
	p.GO();
	logger8.log(Status.PASS, "Click on go button and list of hotels page is displyed");
	Thread.sleep(1000);
	POM_TU10_TC_02 p1=new POM_TU10_TC_02(driver);
	p1.View();
	logger8.log(Status.PASS, "Select the proper hotel and click on view button and shows the details of f hotel page is displyed");
	Thread.sleep(1000);
	}
}
