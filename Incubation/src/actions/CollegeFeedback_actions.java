package actions;


import org.openqa.selenium.WebElement;

import objectrepository.CollegeFeedback_objects;
import utilities.Utility;

public class CollegeFeedback_actions 
{
	public void feedback()
	{
		CollegeFeedback_objects.feedback().click();
	}
	
	public void domain(String name,String sheetname,int row,int col) throws Exception
	{
		WebElement el =CollegeFeedback_objects.domain();
		String a[] = {};
		Utility.DropDownAction(el, a, name, sheetname, row, col);
	}
	public void trainerName(String name)
	{
		WebElement el=CollegeFeedback_objects.trainerName();
		Utility.comparetext(el, name);
	}
	public void comments(String name)
	{
		WebElement el=CollegeFeedback_objects.comments();
		Utility.comparetext(el, name);
	}

}
