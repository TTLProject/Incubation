package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass
{
	public static WebDriver driver;
	public static boolean result;
	public static WebElement element;
	public  BaseClass(WebDriver driver)
	{
		BaseClass.driver = driver;
		BaseClass.result = true;
	}

}
