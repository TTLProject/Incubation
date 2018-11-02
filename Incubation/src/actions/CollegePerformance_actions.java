package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import objectrepository.CollegePerformance_objects;

public class CollegePerformance_actions
{
	public void performance()
	{
		CollegePerformance_objects.performance().click();
	}
	public void domain(String name)
	{
		WebElement el =CollegePerformance_objects.domain();
		Select s = new Select(el);
		s.selectByVisibleText(name);
	}
	public void studentName(String name)
	{
		WebElement el=CollegePerformance_objects.studentName();
		Select s = new Select(el);
		s.selectByVisibleText(name);
	}

}
