package POM;

import static org.testng.Assert.expectThrows;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class POM_TU10_TC_02 {
WebDriver driver;
public POM_TU10_TC_02(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@FindBy(xpath = "(//*[text()=' View '])[1]")
WebElement view;
public void View() {
	WebDriverWait w=new WebDriverWait(driver, 40);
	w.until(ExpectedConditions.elementToBeClickable(view)).click();	
}
@FindBy(xpath = "(//*[text()='Book Now'])[1]")
WebElement book;
@FindBy(xpath = "(*//*[text()='Free Cancellation By August 16'])[1]")
WebElement cancel;
public void BookNow() {
	Set<String> h = driver.getWindowHandles();
	Iterator<String>it = h.iterator();
	
	String parent=it.next();
	String ChildWindowId=it.next();
	driver.switchTo().window(ChildWindowId);
	WebDriverWait w=new WebDriverWait(driver, 30);
	w.until(ExpectedConditions.elementToBeClickable(book)).click();
	}
@FindBy(xpath = "//*[@name='FirstName']")
WebElement First_name;
public void FirstName(String a) {
	WebDriverWait w=new WebDriverWait(driver, 30);
	w.until(ExpectedConditions.elementToBeClickable(First_name)).click();
	//First_name.click();
	First_name.sendKeys(a);
}
@FindBy(xpath = "//*[@id='LastName']")
WebElement Last_name;
public void LastName(String a) {
	Last_name.click();
	Last_name.sendKeys(a);
}
@FindBy(id="Email")
WebElement email;
public void Email(String a) {
	email.click();
	email.sendKeys(a);
}
@FindBy(xpath = "//*[@id='EmailConfirm']")
WebElement confirmmail;
public void ConfirmMail(String a) {
	
	confirmmail.sendKeys(a);
}
	@FindBy(xpath = "(//*[@class='btn dropdown-toggle selectpicker btn-lg'])[1]")
	WebElement Country;
	@FindBy(xpath ="//li")
	List<WebElement> list;
	public void CountryFlag() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Country);
		Country.sendKeys(Keys.ARROW_DOWN);
	
			for (int i = 0; i < list.size(); i++) {
			
				if(list.get(i).getText().contains("Indonesia (62)")) {
	                 
	                list.get(i).click();
	                break;
	                 
	            }
			
			}
			
		}
	@FindBy(id="PhoneNumber")
	WebElement phone;
	public void Phone(String a) {
		phone.sendKeys(a);
	}
	@FindBy(xpath = "(//*[@class='filter-option pull-left'])[2]")
	WebElement Country1;

	
	/*public void Country() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Country1);
	
			for (int i = 0; i <list.size(); i++) {
		String S=list.get(i).getText();
		if (S.contains("India (भारत)")) {
			list.get(i).click();
		}
		}
		
	}*/
	@FindBy(id="ZipCode")
	WebElement code;
	public void zipcode(String a) {
		code.sendKeys(a);
	}
	@FindBy(id="CardNumber")
	WebElement card;
	public void Credit(String a) {
		card.sendKeys(a);
	}
	@FindBy (xpath = "")
	WebElement holder;
	public void HolderName(String a) {
		holder.sendKeys(a);
	}
	@FindBy(xpath = "(//*[@class='filter-option pull-left'])[4]")
	WebElement month;
	@FindBy(xpath ="//span")
	List<WebElement> list1;
	public void Month() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", month);
			for (int i = 0; i < list.size(); i++) {
				String s=list.get(i).getText();
				if (s.equals("6"))
				{
					list.get(i).click();
					break;
				}
			}
			
	}
		
	
	@FindBy(xpath = "(//*[@class='btn dropdown-toggle selectpicker btn-lg'])[5]")
	WebElement year;
	public void Year() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", year);
		year.sendKeys(Keys.ARROW_DOWN);
		for (int i = 0; i <list.size(); i++) {
			String S=list.get(i).getText();
			if (S.contains("2026")) {
				list.get(i).click();
				break;
			}
			
		}
			
	}
@FindBy(id="CVV")
WebElement cvv;
public void CVV(String a) {
	cvv.sendKeys(a);
}
@FindBy(id="checkbox1")
WebElement box;
public void checkbox() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", box);
}
@FindBy(id="book-room")
WebElement bookroom;
public void BookRoom() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", bookroom);
	
}
public void ValidConfirmation(String E) {
	try {
		String A=driver.getCurrentUrl();
		if(A.contains(E))
		{
			System.out.println("Verified Pass:-"+A);
		}
		else 
		{
			System.out.println("Verified Fail:-"+A);
		}
		Thread.sleep(3000);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
}

	}