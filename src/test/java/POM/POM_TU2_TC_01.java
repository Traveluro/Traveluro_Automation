package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_TU2_TC_01 {
	WebDriver driver;
	public POM_TU2_TC_01(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[text()='Login']")
	WebElement login;
	public void Login() {
	login.click();
	}
	@FindBy(xpath = "//*[text()='Sign Up']")
	WebElement signup;
	public void sign() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", signup);
	}
	@FindBy(id="registerFName")
	WebElement Fullname;
	public void FName(String n) {
		Fullname.sendKeys(n);
	}
	@FindBy(id="registerEmail")
	WebElement mail;
	public void Email(String m) {
		mail.sendKeys(m);
	}
	@FindBy(id="registerPassword")
	WebElement Pass;
	public void Password(String p) {
		Pass.sendKeys(p);
	}
	@FindBy(id="registerConfirmPassword")
	WebElement Cpass;
	public void passConform(String CP) {
		Cpass.sendKeys(CP);
	}
	@FindBy(id = "IAgree")
	WebElement Term;
	public void Terms() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Term);
	}
	@FindBy(id="privacy")
	WebElement privac;
	public void Privecy() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", privac);
	}
	@FindBy(xpath = "(//*[@type='submit'])[2]")
	WebElement submit;
	public void Create_account() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", submit);
	}
}
