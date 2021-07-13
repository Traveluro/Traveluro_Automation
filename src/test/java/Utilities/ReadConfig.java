package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	FileInputStream fis;
	Properties p;
public ReadConfig()
{
	File f=new File("./Config/Config.properties");
	
	try {
		fis = new FileInputStream(f);
		p=new Properties();
	
			try {
				p.load(fis);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
	} catch (FileNotFoundException e) {
	
		e.printStackTrace();
	}
	
}
public String First_name() {
	String s=p.getProperty("F");
	return s;
}
public String Last_name() {
	String s=p.getProperty("L");
	return s;
}
public String Email() {
	String s=p.getProperty("E");
	return s;
}
public String Confirmation_Email() {
	String s=p.getProperty("E");
	return s;
}
public String Phone() {
	String s=p.getProperty("P");
	return s;
}
public String Zipcode() {
	String s=p.getProperty("c");
	return s;
}
public String Credit_Card() {
	String s=p.getProperty("cd");
	return s;
}
public String CVV() {
	String s=p.getProperty("cvv");
	return s;
}

public String password() {
	String s=p.getProperty("Pw");
	return s;
}
public String Lastnameerror() {
	String s=p.getProperty("L_error");
	return s;
}
public String firstnameerror() {
	String s=p.getProperty("F_error");
	return s;
}
public String Emailerror() {
	String s=p.getProperty("E_error");
	return s;
}
public String Emailconfirmerror() {
	String s=p.getProperty("EC_error");
	return s;
}
public String ReservationError() {
	String s=p.getProperty("res_error");
	return s;
}
public String Phoneerror() {
	String s=p.getProperty("p_error");
	return s;
}
public String Zipcodeerror() {
	String s=p.getProperty("Z_error");
	return s;
}
public String Crederror() {
	String s=p.getProperty("cred_error");
	return s;
}
public String Holderror() {
	String s=p.getProperty("Hold_error");
	return s;
}
public String CVVerror() {
	String s=p.getProperty("cvv_error");
	return s;
}
public String SignupEmailerror() {
	String s=p.getProperty("Em_error");
	return s;
}
public String Signuppwerror() {
	String s=p.getProperty("Pw_error");
	return s;
}
public String SignupTermserror() {
	String s=p.getProperty("T_error");
	return s;
}
public String SignupPrivacyerror() {
	String s=p.getProperty("Privacy_error");
	return s;
}
public String URL() {
	String s=p.getProperty("URL");
	return s;
}
public String SignupExistError() {
	String s=p.getProperty("signupError");
	return s;
}
public String SearchValid() {
	String s=p.getProperty("Searchvalid");
	return s;
}
public String HotelValid() {
	String s=p.getProperty("HotelValid");
	return s;
}

public String logonValid() {
	String s=p.getProperty("LoginValid");
	return s;
}



}
