package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class POM_Booking_errors {
WebDriver driver;
public POM_Booking_errors(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//*[text()=' Please fill in your First name']")
WebElement F_error;
public void VerifyFirstNameError(String e) {
	String a=F_error.getText();
	Assert.assertEquals(a, e);
}
@FindBy(xpath = "//*[text()=' Please fill in your Last name']")
WebElement L_error;
public void VerifyLastNameError(String e) {
	String a=L_error.getText();
	Assert.assertEquals(a, e);
}
@FindBy(xpath = "//*[text()=' Please fill in your valid email']")
WebElement E_error;
public void VerifyEmailError(String e) {
	String a=E_error.getText();
	Assert.assertEquals(a, e);
}
@FindBy(xpath = "//*[text()=' Please fill in your valid confirm email']")
WebElement EC_error;
public void VerifyEmailconfirmError(String e) {
	String a=EC_error.getText();
	Assert.assertEquals(a, e);
}
@FindBy(xpath = "//*[text()=' Please fill in your valid Phone number']")
WebElement P_error;
public void VerifyPhoneError(String e) {
	String a=P_error.getText();
	Assert.assertEquals(a, e);
}
@FindBy(xpath = "//*[text()=' Please fill in your Zip code']")
WebElement ZC_error;
public void VerifyZipcodeError(String e) {
	String a=ZC_error.getText();
	Assert.assertEquals(a, e);
}
@FindBy(xpath = "//*[text()=' Please fill in your valid card number']")
WebElement CC_error;
public void VerifyCredCardError(String e) {
	String a=CC_error.getText();
	Assert.assertEquals(a, e);
}
@FindBy(xpath = "//*[text()=' Please fill in your card holder name']")
WebElement HN_error;
public void VerifyHolderNameError(String e) {
	String a=HN_error.getText();
	Assert.assertEquals(a, e);
}
@FindBy(xpath = "//*[text()=' Please fill in your CVV number']")
WebElement CVV_error;
public void VerifyCVVError(String e) {
	String a=CVV_error.getText();
	Assert.assertEquals(a, e);
}
}
