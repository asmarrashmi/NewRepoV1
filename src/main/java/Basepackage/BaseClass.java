package Basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	 public WebDriver driver;
	public void intilization() throws IOException
	{
		//for file
		FileInputStream fis = new FileInputStream(System.getProperty("User.dir")+"\\src\\main\\java\\Basepackage\\NewData.Properties");
		//for read file
		 Properties pros = new Properties();
		 //read all data
		 pros.load(fis);
		 String browser= pros.getProperty("browser");
		 {
			 if (browser.equalsIgnoreCase("chrome"))
			 {
				  driver = new ChromeDriver();
			 }
			 else if (browser.equalsIgnoreCase("Firefox"))
			 {
				  driver = new FirefoxDriver();
			 }

		 }
	}
	
}
