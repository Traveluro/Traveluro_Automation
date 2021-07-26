package Sanity;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_TU8_TC_05;

public class TU08_TC_02 extends Base {
@Test
public void HomPage() throws InterruptedException
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
		p.VerifySearchedLocation(SearchValid);
		
		Thread.sleep(2000);
}
}
