package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import objectrepository.CollegeStudentdetails_objects;
import utilities.Utility;

public class CollegeStudentDetails_actions
{
	public void studentDetails()
	{
		CollegeStudentdetails_objects.studentDetails().click();	
	}
	
	public void domain(String name)
	{
		WebElement el =CollegeStudentdetails_objects.domain();
		String a[]= {};
	//	Utility.DropDownAction(el, a, name);
	
	}
	
	public void searchBox(String name)
	{
		CollegeStudentdetails_objects.searchBox().sendKeys(name);
	}
	public void searchButton()
	{
		CollegeStudentdetails_objects.searchBox().click();
		Utility.searchValidation();
	}
	
	public void studentId()
	{
		
	}
	
	public void studentName()
	{
		
	}
	
	public void mobileNumber()
	{
		
	}
	
	public void emailId()
	{
		
	}
	
	public void feeStatus()
	{
		
	}
	
	public void edit()
	{
		CollegeStudentdetails_objects.edit().click();
	}

}
