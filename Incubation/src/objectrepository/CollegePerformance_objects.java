package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CollegePerformance_objects extends BaseClass
{
	public CollegePerformance_objects(WebDriver driver)
	{
		super(driver);
	}
	
	static By performance = By.xpath("");
	static By domain = By.xpath("");
	static By studentname = By.xpath("");
	
	public static WebElement performance()
	{
		 element = driver.findElement(performance);
		return element;
	}
	public static WebElement domain()
	{
		 element = driver.findElement(domain);
		return element;
	}
	public static WebElement studentName()
	{
		 element = driver.findElement(studentname);
		return element;
	}
	

}
