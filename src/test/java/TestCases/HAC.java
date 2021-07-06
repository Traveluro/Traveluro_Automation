package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_HAC;
import POM.POM_TU8_TC_05;
@Listeners(Listener.class)
public class HAC extends Base {
@Test
public void TestHAC() throws InterruptedException {
	logger7 =event.createTest("Hotel availability");
	POM_TU8_TC_05 p=new POM_TU8_TC_05(driver);
	p.Destination();
	logger7.log(Status.PASS, "Proper location name is selected from destination drop down list");
	Thread.sleep(1000);
	p.Date();
	logger7.log(Status.PASS, "Proper date is selected by date text box");
	Thread.sleep(1000);
	p.Adult();
	logger7.log(Status.PASS, "Proper room and Adult is selected by Adult text box");
	Thread.sleep(1000);
	p.GO();
	logger7.log(Status.PASS, "Click on go button and list of hotels page is displyed");
	Thread.sleep(1000);
}
}
