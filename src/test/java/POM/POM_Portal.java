package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class POM_Portal {
WebDriver driver;
public POM_Portal(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void VerifyURL(String E) {
	String A=driver.getCurrentUrl();
	Assert.assertEquals(A, E);
}
}
