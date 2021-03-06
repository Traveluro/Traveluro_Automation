package Signup;

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
	
	@BeforeTest
	public void report()
	{
		rep=new ExtentHtmlReporter("./test-output/Signup.html");
		event=new ExtentReports();
		event.attachReporter(rep);
		event.setSystemInfo("hostname", "Lenovo");
		event.setSystemInfo("Encvironment", "QA");
		event.setSystemInfo("Test Phase", "Sanity");
		event.setSystemInfo("Tester", "Abhilash Gowda");
		
		 rep.config().setAutoCreateRelativePathMedia(true);
		 rep.config().setDocumentTitle("TravelUro SignUP Testing Report");
		 rep.config().setReportName("SignUp Modules Report");
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
		Password=r.password();
		SignupEmailError=r.SignupEmailerror();
		SignupPasswordError=r.Signuppwerror();
		SignupTermsError=r.SignupTermserror();
		SignupPrivacyError=r.SignupPrivacyerror();
		SignupExistError=r.SignupExistError();
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