package dataprovider;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import util.Excelhandler;

public class Improve_resume_dp {

	@DataProvider
	public static Object[][] improve_resume_hover(ITestContext context) throws IOException
	{
		String data=Excelhandler.readCell(18,7);
		String[] outputvalues = data.split(",");
		int a=Integer.parseInt(outputvalues[0]);
		int b=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{a,b}};
	}
	
	
	@DataProvider
	public static Object[][] click_mri(ITestContext context) throws IOException
	{
		String data=Excelhandler.readCell(19,7);
		String[] outputvalues = data.split(",");
		int a=Integer.parseInt(outputvalues[0]);
		int b=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{a,b}};
	}
	
	@DataProvider
	public static Object[][] click_mr_international(ITestContext context) throws IOException
	{
		String data=Excelhandler.readCell(20,7);
		String[] outputvalues = data.split(",");
		int a=Integer.parseInt(outputvalues[0]);
		int b=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{a,b}};
	}
	
	@DataProvider
	public static Object[][] click_resume_critique(ITestContext context) throws IOException
	{
		String data=Excelhandler.readCell(21,7);
		String[] outputvalues = data.split(",");
		int a=Integer.parseInt(outputvalues[0]);
		int b=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{a,b}};
	}
	
	@DataProvider
	public static Object[][] click_social_profiler(ITestContext context) throws IOException
	{
		String data=Excelhandler.readCell(22,7);
		String[] outputvalues = data.split(",");
		int a=Integer.parseInt(outputvalues[0]);
		int b=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{a,b}};
	}
	
	@DataProvider
	public static Object[][] click_Visual_resume_premium(ITestContext context) throws IOException
	{
		String data=Excelhandler.readCell(23,7);
		String[] outputvalues = data.split(",");
		int a=Integer.parseInt(outputvalues[0]);
		int b=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{a,b}};
	}
	
	@DataProvider
	public static Object[][] click_viewall_services(ITestContext context) throws IOException
	{
		String data=Excelhandler.readCell(24,7);
		String[] outputvalues = data.split(",");
		int a=Integer.parseInt(outputvalues[0]);
		int b=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{a,b}};
	}
	
	@DataProvider
	public static Object[][] click_view_on_samples(ITestContext context) throws IOException
	{
		String data=Excelhandler.readCell(25,7);
		String[] outputvalues = data.split(",");
		int a=Integer.parseInt(outputvalues[0]);
		int b=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{a,b}};
	}
	
	
	
}
