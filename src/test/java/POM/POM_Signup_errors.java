package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class POM_Signup_errors {
WebDriver driver;
public POM_Signup_errors(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//*[text()=' Email is invalid']")
WebElement emailerror;
public void EmailError(String e) {
	String a=emailerror.getText();
	Assert.assertEquals(a, e);
}
@FindBy(xpath = "//*[text()=' Password does not match. Try again.']")
WebElement paserror;
public void PasswordError(String e) {
	String a=paserror.getText();
	Assert.assertEquals(a, e);
}
@FindBy(xpath = "//*[text()='Please accept our terms and conditions ']")
WebElement termserror;
public void TermsError(String e) {
	String a=termserror.getText();
	Assert.assertEquals(a, e);
}
	@FindBy(xpath = "//*[text()='Please accept our Privacy Policy.']")
	WebElement privError;
	public void PricacyError(String e) {
		String a=privError.getText();
		Assert.assertEquals(a, e);
	}
}
