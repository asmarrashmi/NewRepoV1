package AllTestcase;

import Basepackage.BaseClass;
import Basepackage.Locaters;

import java.io.IOException;

import javax.security.auth.spi.LoginModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcases extends BaseClass  {

	
	@Test
	public void LocatrsAdd() throws IOException, InterruptedException 
	{
		Locaters objLoginpagepath = new Locaters(driver);
		objLoginpagepath.username().sendKeys("rashmi");
		 objLoginpagepath.password().sendKeys("Rashmi123");
		 objLoginpagepath.loginbtn().click();
		 objLoginpagepath.tryforfree().click();
		 Thread.sleep(5000);
		 objLoginpagepath.Firstname().sendKeys("abc");
		 objLoginpagepath.Lastname().sendKeys("Rashmiabc");
		 Select objsel = objLoginpagepath.dropdown(objLoginpagepath.jobtitledrop());
		 objsel.selectByIndex(1);
		 Select objemployee = objLoginpagepath.dropdownEmployee(objLoginpagepath.Employee());
		 objemployee.selectByIndex(2);
		 //objLoginpagepath.checkbox().click();
		 objLoginpagepath.startTrialbtn().click();
		 Thread.sleep(9000);
		 String ActualText = objLoginpagepath.errormsg().getText();
		 String ExpectedText = objLoginpagepath.ErroreMsgstr;
		 Thread.sleep(5000);
		 Assert.assertEquals(ActualText, ExpectedText);
		 System.out.println("Invalid Login Tested successfully...");
		 System.out.println("Invalid Login Tested successfully...");
	}

	@BeforeMethod
	public void OpenApplication() throws IOException
		{
			intilization();
			driver.get("https://login.salesforce.com/?locale=in");
			driver.manage().window().maximize();
		}
	@AfterMethod
	public void CloseApplication()
	{
		driver.close();
	}

}
