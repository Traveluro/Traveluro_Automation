package POM;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_HAC {
	WebDriver driver;
	public POM_HAC(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()=' Karnataka']")
	WebElement veri;
	public void verify()
	{
		String s=veri.getText();
		if(s.contains(" Karnataka"))
		{
			System.out.println("Verified");
		}
	}
}
