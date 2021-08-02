
package Sanity;


import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POM.POM_TU2_TC_01;



public class TU02_TC_01 extends Base{
	@Test
	public void TestSignUp() throws InterruptedException
	{
		
		
		POM_TU2_TC_01 p=new POM_TU2_TC_01(driver);
		p.Login();
		
		Thread.sleep(1000);
		p.sign();
		
		Thread.sleep(1000);
		p.FName(FirstName);
		
		Thread.sleep(1000);
		p.Email(Email);
		
		Thread.sleep(1000);
		p.Password(Password);
		
		Thread.sleep(1000);
		p.passConform(Password);
		
		Thread.sleep(1000);
		p.Terms();
		
		Thread.sleep(1000);
		p.Privecy();
		
		Thread.sleep(1000);
		p.Create_account();
		
		Thread.sleep(2000);
		p.SignupExistError(SignupExistError);
		
		Thread.sleep(2000);
	}
}
