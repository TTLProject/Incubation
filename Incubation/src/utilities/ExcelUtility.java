package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility
{
	public static Workbook wb;
	static FileOutputStream fos;
	public ExcelUtility() throws Exception
	{
		FileInputStream fis = new FileInputStream("");
		 wb = WorkbookFactory.create(fis);
	}
	
	public Sheet getSheetName(String name)
	{
		return wb.getSheet(name);
	}
	
	public int getRowNum(String name)
	{
		return wb.getSheet(name).getLastRowNum();
	}
	
	public int getColNum(String name, int row)
	{
		return wb.getSheet(name).getRow(row).getLastCellNum();
	}
	
	
	public static void writepass(String sheetname,int row,int col) throws Exception
	{
		wb.getSheet(sheetname).getRow(row).createCell(col).setCellValue("pass");
		wb.write(fos);
	}
	
	public static void writefail(String sheetname,int row,int col) throws Exception
	{
		wb.getSheet(sheetname).getRow(row).createCell(col).setCellValue("fail");
		wb.write(fos);
	}

}
