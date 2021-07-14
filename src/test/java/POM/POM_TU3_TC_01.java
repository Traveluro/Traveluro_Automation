package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

	@FindBy(id = "sm-15236008200698604-3")
	WebElement logon;
	@FindBy(xpath = "//*[text()=' Welcome, ']")
	WebElement wel;
	public void VerifyLogOn(String E) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", logon);
		String A=wel.getText();
		System.out.println(A);
		if(A.contains(E))
		{
			System.out.println("Verified Pass:-"+E);
		}
		else 
		{
			System.out.println("Verified Fail:-"+A);
		}

		
		
	
	}
}
