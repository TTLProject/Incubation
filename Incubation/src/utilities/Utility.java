package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility
{
	public static void DropDownAction(WebElement element,String a[],String name,String sheetname,int row, int col) throws Exception
	{
		Select s = new Select(element);
		List<WebElement> list =s.getOptions();
		List<String> l =Arrays.asList(a);
		Iterator it =l.iterator();
		int count=0;
		if(l.size()==list.size())
		{
			for(WebElement e:list)
			{
				if(e.getText().equals(it.next()))
				{
					count++;
					
					if(count==list.size())
					{
						s.selectByVisibleText(name);
						if(name.equalsIgnoreCase(element.getAttribute("value")))
						{
							ExcelUtility.writepass(sheetname, row, col);
						}else
						{
							ExcelUtility.writefail(sheetname, row, col);
						}
				   }
				}
				else 
				{
					ExcelUtility.writefail(sheetname, row, col);
					break;
				}
			}	
		}
		else
		{
                                			ExcelUtility.writefail(sheetname, row, col);
		}
	}

	
	
	public static void comparetext(WebElement element,String name)
	{
		String s=element.getText();
		if(s.equalsIgnoreCase(name))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	
	public static void selectFile(String filepath) throws AWTException
	{
		StringSelection ss = new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	
	
	public static void searchValidation()
	{
		
	}
	
	public static void tableValidation()
	{
		
	}
	
	public static void sendValidation()
	{
		
	}
	

}
