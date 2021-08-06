package Portal;

import org.testng.annotations.Test;

import Header_Base.Base;
import POM.POM_Portal;

public class TU01_TC_01 extends Base {
@Test
public void VerifyThePortal()
{
	POM_Portal p=new POM_Portal(driver);
	p.VerifyURL(URL);
	log.info("open the url");
}
}
