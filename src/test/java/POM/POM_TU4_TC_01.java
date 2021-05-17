package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_TU4_TC_01 {
WebDriver driver;
public POM_TU4_TC_01(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//*[@class='has-submenu']")
WebElement sup;
public void Support()
{
	sup.click();
}
}
