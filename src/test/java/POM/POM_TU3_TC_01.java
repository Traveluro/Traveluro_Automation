package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class POM_TU3_TC_01 {
	WebDriver driver;
	public POM_TU3_TC_01(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	WebElement mail;
	public void email(String m) {
		mail.sendKeys(m);
	}
	@FindBy(id="password")
	WebElement password;
	public void PassWord(String p) {
		password.sendKeys(p);
	}
	@FindBy(xpath = "(//*[@type='submit'])[1]")
	WebElement login;
	public void submit() {
		login.click();
	}
	@FindBy(xpath = "(//*[text()='Abhilash G'])[1]")
	WebElement user;
	public void User(String expected) {
		String Actual=user.getText();
		Assert.assertEquals(Actual, expected);
	}
}
