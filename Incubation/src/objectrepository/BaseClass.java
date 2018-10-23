package objectrepository;

import org.openqa.selenium.WebDriver;

public class BaseClass
{
	public static WebDriver driver;
	public static boolean result;
	
	public  BaseClass(WebDriver driver)
	{
		BaseClass.driver = driver;
		BaseClass.result = true;
	}

}
