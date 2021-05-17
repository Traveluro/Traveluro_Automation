package TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Base1 {
public static WebDriver driver;
public static ExtentReports event;
public static ExtentHtmlReporter rep;
public static ExtentTest logger;
@BeforeTest
public void report()
{
	rep=new ExtentHtmlReporter("./test-output/Google_Compaign.html");
	event=new ExtentReports();
	event.attachReporter(rep);
	event.setSystemInfo("hostname", "Lenevo");
	event.setSystemInfo("Encvironment", "QA");
	event.setSystemInfo("Test Phase", "Sanity");
	event.setSystemInfo("Tester", "Abhilash Gowda");
	
	 rep.config().setAutoCreateRelativePathMedia(true);
	 rep.config().setDocumentTitle("TravelUro AutomationTesting Report");
	 rep.config().setReportName("Google_Compeign Report");
	 rep.config().setTheme(Theme.DARK);

}
@BeforeMethod
public void pre()
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.google.com/");
}
@AfterMethod
public void peerdown()
{
	event.flush();
	//driver.quit();
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
