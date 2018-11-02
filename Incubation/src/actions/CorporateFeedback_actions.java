package actions;

import org.openqa.selenium.WebElement;
import objectrepository.CorporateFeedback_objects;
import utilities.Utility;

public class CorporateFeedback_actions
{
	public void feedback()
	{
		CorporateFeedback_objects.feedback().click();
	}
	
	public void collegeName(String name)
	{
		WebElement el=CorporateFeedback_objects.collegeName();	
		String a[] = {};
		//Utility.DropDownAction(el, a, name);
	
	}
	
	public void domain(String name)
	{
		WebElement el =CorporateFeedback_objects.domain();
		String a[] = {};
	//	Utility.DropDownAction(el, a, name);
	}
	public void trainerName(String name)
	{
		WebElement el=CorporateFeedback_objects.trainerName();
		Utility.comparetext(el, name);
	}
	public void comments(String text)
	{
		WebElement el=CorporateFeedback_objects.comments();
		Utility.comparetext(el, text);
	}

}
