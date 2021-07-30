package POM;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class POM_TU8_TC_05 {
WebDriver driver;
public POM_TU8_TC_05(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver, this);
}

@FindBy(id = "Currency")
WebElement currency;
public void Currency()
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", currency);
}
@FindBy(id = "myInput")
WebElement dept;
@FindBy(xpath = "//div")
List<WebElement> list;
public void Destination() {
	dept.click();
	dept.sendKeys("califor");
	
	for(int i=0; i<list.size();i++)
	{
		String s=list.get(i).getText();
		
		
		if(s.contains("CA, USA"))
				{
			list.get(i).click();
				}
		
	}
	
}
@FindBy(xpath = "//td")
List<WebElement> list1;
public void Date() {
	for(int i=0; i<list1.size();i++)
	{
		String s=list1.get(i).getText();
		if(s.contains("11"))
		{
			list1.get(i).click();
			list1.get(i).click();
		}
	}
}
@FindBy(id = "searchGuestRoomCount")
WebElement audalt;
@FindBy(xpath = "//*[@class='circle-control minus-control roomAdultMinusControl']")
WebElement ad;
@FindBy(xpath = "//*[@class='booking-form-box clearfix booking-from-desktop']")
WebElement clk;
public void Adult() {
	audalt.click();
	ad.click();
	clk.click();
}
@FindBy(name = "Go")
WebElement go;
public void GO() {
	go.click();
}

public void VerifySearchedLocation(String E) {
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

