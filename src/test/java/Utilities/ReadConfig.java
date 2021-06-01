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



}
