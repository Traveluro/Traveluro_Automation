package Booking_Flow;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

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
	String ConfirmEmail;
	String Phone;
	String CreditCard;
	String CVV;
	String Zipcode;
	String Password;
	String Las_error;
	String Fast_error;
	String Email_error;
	String Emailconfirm_error;
	String Reservation_error;
	String phone_error;
	String Zipcode_error;
	String Cread_error;
	String Holdname_error;
	String cvv_error;
	
	
	@BeforeTest
	public void report()
	{
		rep=new ExtentHtmlReporter("./test-output/Report.html");
		event=new ExtentReports();
		event.attachReporter(rep);
		event.setSystemInfo("hostname", "Lenovo");
		event.setSystemInfo("Encvironment", "QA");
		event.setSystemInfo("Test Phase", "Sanity");
		event.setSystemInfo("Tester", "Abhilash Gowda");
		
		 rep.config().setAutoCreateRelativePathMedia(true);
		 rep.config().setDocumentTitle("TravelUro AutomationTesting Report");
		 rep.config().setReportName("Sanity Modules Report");
		 rep.config().setTheme(Theme.DARK);
	
	}
	@BeforeMethod
	public void pre()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://traveluro.com/");
		r=new ReadConfig();
		FirstName=r.First_name();
		LastNaame=r.Last_name();
		Email=r.Email();
		ConfirmEmail=r.Confirmation_Email();
		Phone=r.Phone();
		Zipcode=r.Zipcode();
		CreditCard=r.Credit_Card();
		CVV=r.CVV();
		Password=r.password();
		Fast_error=r.firstnameerror();
		Las_error=r.Lastnameerror();
		Email_error=r.Emailerror();
		Emailconfirm_error=r.Emailconfirmerror();
		phone_error=r.Phoneerror();
		Zipcode_error=r.Zipcodeerror();
		Cread_error=r.Crederror();
		Holdname_error=r.Holderror();
		cvv_error=r.CVVerror();
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
		}else if(result.getStatus() == ITestResult.SKIP){
			logger.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger1.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger2.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger3.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger4.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			logger5.log(Status.SKIP, "Test Case Skipped is "+result.getName());
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