package POM;

import org.openqa.selenium.JavascriptExecutor;
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
@FindBy(xpath = "(//*[text()='Contact Us'])[1]")
WebElement contactus;
public void Contactus() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", contactus);
}
@FindBy(xpath = "//*[@class='box']")
WebElement SupportTeam;
public void SupportteamLink() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", SupportTeam);
}
@FindBy(xpath = "//*[@class='form-control form-control-lg ng-pristine ng-invalid is-invalid ng-touched']")
WebElement Email;
public void Email() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", Email);
	Email.sendKeys("abhilash");
}
}
