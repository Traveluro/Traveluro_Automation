package POM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_TU9_TC_01 {

	WebDriver driver;
	public POM_TU9_TC_01(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyHotelpage(String E) {
		try {
			Set<String> h = driver.getWindowHandles();
			Iterator<String>it = h.iterator();
			
			String parent=it.next();
			String ChildWindowId=it.next();
			driver.switchTo().window(ChildWindowId);
			 String currentURL = driver.getCurrentUrl();
		       if (currentURL.contains(E)) {
		           System.out.println("Verified Pass:-" + currentURL);
		       } else {
		           System.out.println("Veriofied Fail:-" + currentURL);
		       }
		       Thread.sleep(2000);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
	}
	
}
