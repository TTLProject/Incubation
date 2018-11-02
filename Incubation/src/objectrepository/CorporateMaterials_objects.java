package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CorporateMaterials_objects extends BaseClass
{
	public CorporateMaterials_objects(WebDriver driver) 
	{
		super(driver);
	}
	
	static By materials = By.xpath("");
	static By collegename = By.xpath("");
	static By domain = By.xpath("");
	static By choosefile = By.xpath("");
	static By send = By.xpath("");
	static By oldstudents = By.xpath("");
	static By checkbox = By.xpath("");
	static By studentid = By.xpath("");
	static By studentname = By.xpath("");
	static By email = By.xpath("");
	static By mobilenumber = By.xpath("");
	static By status = By.xpath("");
	static By sendmore = By.xpath("");
	static By viewfiles = By.xpath("");
	
	
	public static WebElement materials()
	{
		element =driver.findElement(materials);
		return element;
	}
	public static WebElement collegeName()
	{
		element =driver.findElement(collegename);
		return element;
	}
	public static WebElement domain()
	{
		element =driver.findElement(domain);
		return element;
	}
	public static WebElement chooseFile()
	{
		element =driver.findElement(choosefile);
		return element;
	}
	public static WebElement send()
	{
		element =driver.findElement(send);
		return element;
	}
	public static WebElement oldStudents()
	{
		element =driver.findElement(oldstudents);
		return element;
	}
	public static WebElement checkbox()
	{
		element =driver.findElement(checkbox);
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
	public static WebElement email()
	{
		element =driver.findElement(email);
		return element;
	}
	public static WebElement mobileNumber()
	{
		element =driver.findElement(mobilenumber);
		return element;
	}
	public static WebElement status()
	{
		element =driver.findElement(status);
		return element;
	}
	public static WebElement sendMore()
	{
		element =driver.findElement(sendmore);
		return element;
	}
	public static WebElement viewFiles()
	{
		element =driver.findElement(viewfiles);
		return element;
	}
	
	
	

}
