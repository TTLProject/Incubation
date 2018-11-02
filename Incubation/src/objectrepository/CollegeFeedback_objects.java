package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CollegeFeedback_objects extends BaseClass
{
	public CollegeFeedback_objects(WebDriver driver)
     {
		super(driver);
	 }
	
	static By feedback = By.xpath("");
	static By domain = By.xpath("");
	static  By trainername = By.xpath("");
	 static By comments = By.xpath("");
	
	public static WebElement feedback()
	{
		element =driver.findElement(feedback);
		return element;
	}

	public static WebElement domain()
	{
		element =driver.findElement(domain);
		return element;
	}
	public static WebElement trainerName()
	{
		element = driver.findElement(trainername);
		return element;
	}
	public static WebElement comments()
	{
		element = driver.findElement(comments);
		return element;
	}

}
