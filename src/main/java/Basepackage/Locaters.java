package Basepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

	public class Locaters {
		WebDriver driver;

public  String ErroreMsgstr = "Please read and agree to the Master Subscription Agreement";

		public Locaters(WebDriver driver2) {
			// TODO Auto-generated constructor stub
			driver = driver2;
		}


	//Element xpath
	By userName= By.xpath("//input[@id='username']");
	By Password = By.xpath("//input[@id='password']");
	By loginbtn = By.xpath("//input[@id='Login']");
	By tryforfree = By.xpath("//*[@id=\"signup_link\"]");
	By Firstname = By.xpath("//input[@name='UserFirstName']");
	By Lastname = By.xpath("//input[@name='UserLastName']");

	By jobtitledrop = By.xpath("//select[@name='UserTitle']");
	By Employee = By.xpath("//select[@name='CompanyEmployees']");
	By checkbox = By.xpath("/html/body/div[5]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[5]/div/div/div[1]");
	By startTrialbtn = By.xpath("//*[@name=\"start my free trial\"]");
	By errormsg = By.xpath("//*[@class='error-msg-block']");
	//methods for returning weblement for every xpath
	public WebElement username() 
	{
		return driver.findElement(userName);

	}
	public WebElement password()
	{
		return driver.findElement(Password);

	}
	public WebElement loginbtn()
	{
		return driver.findElement(loginbtn);
	}
	public WebElement tryforfree()
	{
		return driver.findElement(tryforfree);
	}
	public WebElement Firstname()
	{
		return driver.findElement(Firstname);
	}
	public WebElement Lastname()
	{
		return driver.findElement(Lastname);
	}
	public WebElement jobtitledrop()
	{
		return driver.findElement(jobtitledrop);
	}
	public WebElement Employee()
	{
		return driver.findElement(Employee);
	}
	public WebElement checkbox()
	{
		return driver.findElement(checkbox);
	}
	public WebElement startTrialbtn()
	{
		return driver.findElement(startTrialbtn);
	}
	public WebElement errormsg()
	{
		return driver.findElement(errormsg);
	}
	
	//method for static select drop-down
	public Select dropdown (WebElement ele) {
		Select sel = new Select(ele);
		return sel;

	}
	public Select dropdownEmployee (WebElement el)
	{
		Select sel = new Select(el);
		return sel;
}
}
