package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CollegeDashboard_objects extends BaseClass
{
	public CollegeDashboard_objects(WebDriver driver) 
	{
		super(driver);
	}

	static By logout = By.xpath("");
	static By logoutlink = By.xpath("");
	
	public static WebElement logout()
	{
		element = driver.findElement(logout);
		return element;
	}
	public static WebElement logoutLink()
	{
		element = driver.findElement(logoutlink);
		return element;
	}

}
