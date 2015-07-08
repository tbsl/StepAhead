package dataprovider;



import java.io.IOException;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import util.Excelhandler;

public class homepage_dp {
	
	@DataProvider
	public static Object[][] open_shutter(ITestContext context) throws IOException
	{
		String data=Excelhandler.readCell(5,7);
		String[] outputvalues = data.split(",");
		int a=Integer.parseInt(outputvalues[0]);
		int b=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{a,b}};
	}
	
	@DataProvider
	public static Object[][] close_shutter(ITestContext context) throws IOException
	{
		String data=Excelhandler.readCell(7,7);
		String[] outputvalues = data.split(",");
		int a=Integer.parseInt(outputvalues[0]);
		int b=Integer.parseInt(outputvalues[1]);
		System.out.println("dp"+a);
		System.out.println("dp"+b);
		return new Object[][]{{a,b}};
	}
	
	@DataProvider
	public static Object[][] open_shutter_singnin(ITestContext context) throws IOException
	{
		String data=Excelhandler.readCell(10,7);
		String[] outputvalues = data.split(",");
		int a=Integer.parseInt(outputvalues[0]);
		int b=Integer.parseInt(outputvalues[1]);
		System.out.println("dp"+a);
		System.out.println("dp"+b);
		return new Object[][]{{a,b}};
	}
	
	@DataProvider
	public static Object[][] close_shutter_singnin(ITestContext context) throws IOException
	{
		String data=Excelhandler.readCell(12,7);
		String[] outputvalues = data.split(",");
		String raw_row=outputvalues[0];
		System.out.println("RAW_ROW"+raw_row);
		String raw_col=outputvalues[1];
		
		int a=Integer.parseInt(raw_row);
		int b=Integer.parseInt(raw_col);
		System.out.println("dp"+a);
		System.out.println("dp"+b);
		return new Object[][]{{a,b}};
	}
	
	
	@DataProvider
	public static Object[][] user_Registeration_Validations(ITestContext context) throws IOException
	{
		String data=Excelhandler.readCell(11,7);
		String[] outputvalues = data.split(",");
		int a=Integer.parseInt(outputvalues[0]);
		int b=Integer.parseInt(outputvalues[1]);
		System.out.println("dp"+a);
		System.out.println("dp"+b);
		return new Object[][]{{a,b}};
	}
	
	
	
}
