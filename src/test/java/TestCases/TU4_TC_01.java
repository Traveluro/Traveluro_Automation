package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_TU4_TC_01;
@Listeners(Listener.class)
public class TU4_TC_01 extends Base {
@Test
public void TestSupport()
{
	logger3=event.createTest("support 24/7");
	POM_TU4_TC_01 p=new POM_TU4_TC_01(driver);
	p.Support();
	logger3.log(Status.PASS, "Drop down list is displayed");
}
}
