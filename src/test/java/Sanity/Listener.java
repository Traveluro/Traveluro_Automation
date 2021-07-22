package Sanity;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends Base  implements ITestListener {
	@Override  
	public void onTestStart(ITestResult result) {  
	 System.out.println("Test case started: "+result.getName());
	}  
	  
	@Override  
	public void onTestSuccess(ITestResult result) {  
	  
	System.out.println("Success of test cases and its details are : "+result.getName());  
	}  
	  
	@Override  
	public void onTestFailure(ITestResult result) {  
	
	System.out.println("Failure of test cases and its details are : "+result.getName());  
	screenshot();
	getResult(result);
	}  
	  
	@Override  
	public void onTestSkipped(ITestResult result) {  
	
	System.out.println("Skip of test cases and its details are : "+result.getName());  
	}  
	  
	@Override  
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
	 
	System.out.println("Failure of test cases and its details are : "+result.getName());  
	}  
	  
	@Override  
	public void onStart(ITestContext context) {  
	 System.out.println("Start the test case steps :"+context.getName());
	}  
	  
	@Override  
	public void onFinish(ITestContext context) {  
	System.out.println("Finish the test case steps :"+context.getName());
	}  
}