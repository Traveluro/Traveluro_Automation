package POM;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_Gooogle_Compaign {
WebDriver driver;
public POM_Gooogle_Compaign(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@FindBy(name = "q")
WebElement search;
public void Search() {
	search.sendKeys("hotel booking in las vegas");
}
@FindBy(name = "btnK")
WebElement go;
public void Go()
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", go);
}
@FindBy(xpath = "//*[text()='View 382 hotels']")
WebElement hotels;
public void Hotels() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", hotels);
}
@FindBy(xpath = "//*[text()='OYO Hotel Gateway Las Vegas']")
WebElement hotelname;
public void HotelName() {
	WebDriverWait r=new WebDriverWait(driver, 30);
	r.until(ExpectedConditions.elementToBeClickable(hotelname)).click();
}
@FindBy(xpath = "(//*[text()='View prices'])[3]")
WebElement prices;
public void Prices() {
	WebDriverWait r=new WebDriverWait(driver, 30);
	r.until(ExpectedConditions.elementToBeClickable(prices)).click();
}
@FindBy(xpath = "//*[text()='Traveluro']")
WebElement travelsite;
public void VisitSite() {
	Set<String> tabs = driver.getWindowHandles();
	Iterator<String> it = tabs.iterator();
	String tab1 = it.next();
	String tab2 = it.next();
	driver.switchTo().window(tab1);
	//driver.close();
	driver.switchTo().window(tab2);
WebDriverWait r=new WebDriverWait(driver, 30);
r.until(ExpectedConditions.elementToBeClickable(travelsite)).click();
}
@FindBy(xpath ="(//*[text()='Book Now'])[1]")
WebElement book;

public void BookNow() {

	driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
	WebDriverWait r=new WebDriverWait(driver, 30);
	r.until(ExpectedConditions.elementToBeClickable(book)).click();
	
	driver.switchTo().defaultContent();
	}
}

