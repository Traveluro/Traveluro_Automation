package TestCases;

import org.testng.annotations.Test;

import POM.POM_HAC;
import POM.POM_TU8_TC_05;

public class HAC extends Base {
@Test
public void TestHAC() throws InterruptedException {
	POM_TU8_TC_05 p=new POM_TU8_TC_05(driver);
	p.Bookings();
	Thread.sleep(1000);
	p.Date();
	Thread.sleep(1000);
	p.Adult();
	Thread.sleep(1000);
	p.GO();
	POM_HAC p1=new POM_HAC(driver);
	p1.verify();
}
}
