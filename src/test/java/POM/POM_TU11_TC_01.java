package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class POM_TU11_TC_01 {
WebDriver driver;
public POM_TU11_TC_01(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void VarifyBookpage(String E) {
	try {
		String A=driver.getCurrentUrl();
		if(A.contains(E))
		{
			System.out.println("Verified Pass:-"+A);
		}
		else 
		{
			System.out.println("Verified Fail:-"+A);
		}
		Thread.sleep(2000);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
}
}
