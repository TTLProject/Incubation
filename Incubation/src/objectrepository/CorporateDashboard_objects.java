package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CorporateDashboard_objects extends BaseClass
{
    public CorporateDashboard_objects(WebDriver driver)
       {
		super(driver);
		}

     static By logout = By.xpath("");
	
	public static WebElement logout()
	{
		element = driver.findElement(logout);
		return element;
	}


}
