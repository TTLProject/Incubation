package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CollegeStudentdetails_objects extends BaseClass
{
	public CollegeStudentdetails_objects(WebDriver driver)
	{
		super(driver);
	}
	
	static By studentdetails = By.xpath("");
	static By domain = By.xpath("");
	static By searchbox = By.xpath("");
	static By searchbutton = By.xpath("");
	static By studentid = By.xpath("");
	static By studentname = By.xpath("");
	static By mobilenumber = By.xpath("");
	static By emailid = By.xpath("");
	static By feestatus = By.xpath("");
	static By edit = By.xpath("");
	
	public static WebElement studentDetails()
	{
		element =driver.findElement(studentdetails);
		return element;
	}
	public static WebElement domain()
	{
		element =driver.findElement(domain);
		return element;
	}
	public static WebElement searchBox()
	{
		element =driver.findElement(searchbox);
		return element;
	}
	public static WebElement searchButton()
	{
		element =driver.findElement(searchbutton);
		return element;
	}
	public static WebElement studentId()
	{
		element =driver.findElement(studentid);
		return element;
	}
	public static WebElement studentName()
	{
		element =driver.findElement(studentname);
		return element;
	}
	public static WebElement mobileNumber()
	{
		element =driver.findElement(mobilenumber);
		return element;
	}
	public static WebElement emailId()
	{
		element =driver.findElement(emailid);
		return element;
	}
	public static WebElement feeStatus()
	{
		element =driver.findElement(feestatus);
		return element;
	}
	public static WebElement edit()
	{
		element =driver.findElement(edit);
		return element;
	}
	
	
	

}
