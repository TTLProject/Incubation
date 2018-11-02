package actions;


import org.openqa.selenium.WebElement;

import objectrepository.CorporateMaterials_objects;
import utilities.Utility;

public class CorporateMaterials_actions 
{
	public void materials()
	{
		CorporateMaterials_objects.materials().click();	
	}
	
	public void collegeName(String name)
	{
		WebElement el =CorporateMaterials_objects.collegeName();
		String a[]= {};
	//	Utility.DropDownAction(el, a, name);
	}
	
	public void domain(String name)
	{
		WebElement el =CorporateMaterials_objects.domain();
		String a[]= {};
	//	Utility.DropDownAction(el, a, name);
		Utility.tableValidation();
		
	}
	
	public void chooseFile(String filepath) throws Exception
	{
		CorporateMaterials_objects.chooseFile().click();
		Utility.selectFile(filepath);
	}
	
	public void send()
	{
		CorporateMaterials_objects.send().click();
		Utility.sendValidation();
		
	}
	
	public void oldStudents()
	{
		CorporateMaterials_objects.oldStudents().click();
		Utility.tableValidation();
	}
	
	public void checkbox()
	{
		CorporateMaterials_objects.checkbox().click();
	}
	
	public void studentId()
	{
		
	}
	public void studentName()
	{
		
	}
	public void email()
	{
		
	}
	public void mobileNumber()
	{
		
	}
	public void status()
	{
		
	}
	
	public void sendMore(String filepath) throws Exception
	{
		CorporateMaterials_objects.sendMore().click();
		Utility.selectFile(filepath);
	}
	
	public void viewFiles()
	{
		CorporateMaterials_objects.viewFiles().click();
	}

}
