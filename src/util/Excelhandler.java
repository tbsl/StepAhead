package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Parameters;

public class Excelhandler {

	public void cellWrite(String sheetN) throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\Extra\\TestCases.xlsx");
		
		//FileInputStream fis=new FileInputStream("C:\\Users\\susheel.thakur\\workspace\\JB_Automation\\Extra\\TestCases.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(sheetN);
		XSSFRow row=sheet.getRow(100);
		XSSFCell cell=row.createCell(2);
		cell.setCellValue("OOPS");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\susheel.thakur\\workspace\\JB_Automation\\Extra\\TestCases.xlsx");
		workbook.write(fos);
		System.out.println("Excel Written");
	}
	
public static String readCell(int rowN,int colN) throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\susheel.thakur\\workspace\\JB_Automation\\Extra\\TestCases.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	XSSFRow row=sheet.getRow(rowN);
	Cell cell=row.getCell(colN);
	String value= cell.getStringCellValue();
	return value;
}

public static void cellWrite(int rowN,int colN,String DataW) throws IOException
	//public static void main(String args[]) throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\susheel.thakur\\workspace\\JB_Automation\\Extra\\TestCases.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	XSSFRow row=sheet.getRow(rowN);
	
		if(DataW.equals("FAIL"))
			{
				XSSFFont font = workbook.createFont();
				font.setFontHeightInPoints((short) 15);
				font.setBold(true);
				font.setColor(HSSFColor.RED.index);
				XSSFCellStyle style = workbook.createCellStyle();
				style.setFont(font);
				XSSFCell cell = row.createCell(colN);
				cell.setCellValue(DataW);
				cell.setCellStyle(style);
			}
		else
			{
				XSSFFont font = workbook.createFont();
				font.setBold(true);
				font.setColor(HSSFColor.GREEN.index);
				XSSFCellStyle style = workbook.createCellStyle();
				style.setFont(font);
				XSSFCell cell = row.createCell(colN);
				cell.setCellValue(DataW);
				cell.setCellStyle(style);
			}
	
	FileOutputStream fos=new FileOutputStream("C:\\Users\\susheel.thakur\\workspace\\JB_Automation\\Extra\\TestCases.xlsx");
	workbook.write(fos);
	
	System.out.println("Excel Written");
}

}






//C:\Users\susheel.thakur\workspace\JB_Automation\Extra\TestCases.xlsx