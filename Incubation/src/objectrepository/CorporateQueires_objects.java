package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CorporateQueires_objects extends BaseClass
{
	public CorporateQueires_objects(WebDriver driver) 
	{
		super(driver);
    } 
	static By queires = By.xpath("");
	static By answer = By.xpath("");
	static By send = By.xpath("");
	
	public static WebElement queries()
	{
		element =driver.findElement(queires);
		return element;
	}
	public static WebElement answer()
	{
		element =driver.findElement(answer);
		return element;
	}
	public static WebElement send()
	{
		element =driver.findElement(send);
		return element;
	}
}
