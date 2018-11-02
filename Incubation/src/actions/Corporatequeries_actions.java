package actions;


import objectrepository.CorporateQueires_objects;
import utilities.Utility;

public class Corporatequeries_actions 
{
	public void queries()
	{
		CorporateQueires_objects.queries().click();
	}
	
	public void  answer(String data)
	{
		CorporateQueires_objects.answer().sendKeys(data);
	}
	
	public void  send()
	{
		CorporateQueires_objects.send().click();
		Utility.sendValidation();
	}

}
