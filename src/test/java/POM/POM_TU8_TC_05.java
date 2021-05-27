package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_TU8_TC_05 {
WebDriver driver;
public POM_TU8_TC_05(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver, this);
}
@FindBy(id = "myInput")
WebElement dept;
@FindBy(xpath = "//span")
List<WebElement> list;
public void Bookings() {
	dept.click();
	dept.sendKeys("Bang");
	for(int i=0; i<list.size();i++)
	{
		String s=list.get(i).getText();
		if(s.contains("Karnataka"))
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
}
