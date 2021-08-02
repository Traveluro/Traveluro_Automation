package Sanity;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.beust.jcommander.Parameter;

import Utilities.ReadConfig;

 class Base {
	public static WebDriver driver;
	
	ReadConfig r;
	String FirstName;
	String LastNaame;
	String Email;
	String Password;
	String SignupEmailError;
	String SignupPasswordError;
	String SignupTermsError;
	String SignupPrivacyError;
	String SignupExistError;
	String Phone;
	String CreditCard;
	String CVV;
	String Zipcode;
	String URL;
	String SearchValid;
	String Hotelvalid;
	String LogonValid;
	String Bookvalid;
	String ConfirmationValid;

	
	@Parameters("browser")
	@BeforeMethod
	public void pre(String browser)
	{
		if(browser.contains("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browser.contains("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://traveluro.com/");
		r=new ReadConfig();
		FirstName=r.First_name();
		LastNaame=r.Last_name();
		Email=r.Email();
		Password=r.password();
		SignupEmailError=r.SignupEmailerror();
		SignupPasswordError=r.Signuppwerror();
		SignupTermsError=r.SignupTermserror();
		SignupPrivacyError=r.SignupPrivacyerror();
		SignupExistError=r.SignupExistError();
		Phone=r.Phone();
		Zipcode=r.Zipcode();
		CreditCard=r.Credit_Card();
		CVV=r.CVV();
		URL=r.URL();
		SearchValid=r.SearchValid();
		Hotelvalid=r.HotelValid();
		LogonValid=r.logonValid();
		Bookvalid=r.BookValid();
		ConfirmationValid=r.ConfirmationValid();
}

	
	@AfterMethod
	public void peerdown()
	{
		
		driver.quit();
	}
public static void screenshot() {
		
		TakesScreenshot s=(TakesScreenshot)driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/failure.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}