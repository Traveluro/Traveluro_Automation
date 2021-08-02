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
	
	POM_TU8_TC_05 p=new POM_TU8_TC_05(driver);
	p.Destination();
	
	Thread.sleep(1000);
	p.Date();
	
	Thread.sleep(1000);
	p.Adult();
	
	Thread.sleep(1000);
	p.GO();
	
	Thread.sleep(1000);
	POM_TU10_TC_02 p1=new POM_TU10_TC_02(driver);
	p1.View();
	
	Thread.sleep(1000);
	POM_TU9_TC_01 p2=new POM_TU9_TC_01(driver);
	p2.VerifyHotelpage(Hotelvalid);
	
	Thread.sleep(3000);
}
}
