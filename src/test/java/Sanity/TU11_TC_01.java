package Sanity;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Header_Base.Base;
import POM.POM_TU10_TC_02;
import POM.POM_TU11_TC_01;
import POM.POM_TU8_TC_05;

public class TU11_TC_01 extends Base{
@Test
public void TestHotelPage() throws InterruptedException
{
	logger11=event.createTest("Verify the system behaviour when click on Book Now button");
	POM_TU8_TC_05 p=new POM_TU8_TC_05(driver);
	p.Destination();
	log.info("Destination place is selected");
	logger11.log(Status.PASS, "Destination place is selected");
	Thread.sleep(1000);
	p.Date();
	log.info("Date is selected");
	logger11.log(Status.PASS, "Date is selected");
	Thread.sleep(1000);
	p.Adult();
	log.info("Room and Adults is selected");
	logger11.log(Status.PASS, "Room and Adults is selected");
	Thread.sleep(1000);
	p.GO();
	log.info("Click on go button");
	logger11.log(Status.PASS, "Click on go button");
	Thread.sleep(1000);
	POM_TU10_TC_02 p1=new POM_TU10_TC_02(driver);
	p1.View();
	log.info("Click on view button");
	logger11.log(Status.PASS, "expected hotel selected");
	Thread.sleep(1000);
	p1.BookNow();
	log.info("Click on bookNow button");
	logger11.log(Status.PASS, "Click on Book now button");
	Thread.sleep(1000);
	POM_TU11_TC_01 p2=new POM_TU11_TC_01(driver);
	p2.VarifyBookpage(Bookvalid);
	log.info("Verified Booking page");
	logger11.log(Status.PASS, "Verified Booking page");
	Thread.sleep(3000);
}
}
