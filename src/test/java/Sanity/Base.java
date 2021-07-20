package Sanity;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
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
	public static ExtentReports event;
	public static ExtentHtmlReporter rep;
	public static ExtentTest logger;
	public static ExtentTest logger1;
	public static ExtentTest logger2;
	public static ExtentTest logger3;
	public static ExtentTest logger4;
	public static ExtentTest logger5;
	public static ExtentTest logger6;
	public static ExtentTest logger7;
	public static ExtentTest logger8;
	public static ExtentTest logger9;
	public static ExtentTest logger10;
	public static ExtentTest logger11;
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
	@BeforeTest
	public void report()
	{
		rep=new ExtentHtmlReporter("./test-output/Sanity.html");
		event=new ExtentReports();
		event.attachReporter(rep);
		event.setSystemInfo("hostname", "Lenovo");
		event.setSystemInfo("Environment", "QA");
		event.setSystemInfo("Test Phase", "Sanity");
		event.setSystemInfo("Tester", "Abhilash Gowda");
		
		 rep.config().setAutoCreateRelativePathMedia(true);
		 rep.config().setDocumentTitle("TravelUro Automation Testing Report");
		 rep.config().setReportName("Sanity Modules Report");
		 rep.config().setTheme(Theme.DARK);
	
	}
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
		driver.get("https://www.traveluroqa.com/");
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

	public static void getResult(ITestResult result){
		if(result.getStatus() == ITestResult.FAILURE){
			logger.log(Status.FAIL, "Test Case Failed is "+result.getName());
			logger.log(Status.FAIL, "Test Case Failed is "+result.getThrowable());
			logger1.log(Status.FAIL, "Test Case Failed is "+result.getName());
			logger1.log(Status.FAIL, "Test Case Failed is "+result.getThrowable());
			logger2.log(Status.FAIL, "Test Case Failed is "+result.getName());
			logger2.log(Status.FAIL, "Test Case Failed is "+result.getThrowable());
			logger3.log(Status.FAIL, "Test Case Failed is "+result.getName());
			logger3.log(Status.FAIL, "Test Case Failed is "+result.getThrowable());
			logger4.log(Status.FAIL, "Test Case Failed is "+result.getName());
			logger4.log(Status.FAIL, "Test Case Failed is "+result.getThrowable());
			logger5.log(Status.FAIL, "Test Case Failed is "+result.getName());
			logger5.log(Status.FAIL, "Test Case Failed is "+result.getThrowable());
			logger6.log(Status.FAIL, "Test Case Failed is "+result.getName());
			logger6.log(Status.FAIL, "Test Case Failed is "+result.getThrowable());
			logger7.log(Status.FAIL, "Test Case Failed is "+result.getName());
			logger7.log(Status.FAIL, "Test Case Failed is "+result.getThrowable());
			logger8.log(Status.FAIL, "Test Case Failed is "+result.getName());
			logger8.log(Status.FAIL, "Test Case Failed is "+result.getThrowable());
			logger9.log(Status.FAIL, "Test Case Failed is "+result.getName());
			logger9.log(Status.FAIL, "Test Case Failed is "+result.getThrowable());
			logger10.log(Status.FAIL, "Test Case Failed is "+result.getName());
			logger10.log(Status.FAIL, "Test Case Failed is "+result.getThrowable());
			logger11.log(Status.FAIL, "Test Case Failed is "+result.getName());
			logger11.log(Status.FAIL, "Test Case Failed is "+result.getThrowable());
		}else if(result.getStatus() == ITestResult.SKIP){
			logger.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger1.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger2.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger3.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger4.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger5.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger6.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger7.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger8.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger9.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger10.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger11.log(Status.SKIP, "Test Case Skipped is "+result.getName());
		}
	}
	@AfterMethod
	public void peerdown()
	{
		event.flush();
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