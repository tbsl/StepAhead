package dataprovider;



import java.io.IOException;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import util.Excelhandler;

public class homepage {
	
	@DataProvider
	public static Object[][] h_tj(ITestContext context) throws IOException
	{
		String rowno=Excelhandler.readCell(5,7);
		String[] outputvalues = rowno.split(",");
		int a=Integer.parseInt(outputvalues[0]);
		int b=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{a,b}};
	}
	
	@DataProvider
	public static Object[][] h_jb(ITestContext context) throws IOException
	{
		String rowno=Excelhandler.readCell(6,7);
		String[] outputvalues = rowno.split(",");
		int a=Integer.parseInt(outputvalues[0]);
		int b=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{a,b}};
	}

	
	@DataProvider
	public static Object[][] h_sa(ITestContext context) throws IOException
	{
		String rowno=Excelhandler.readCell(7,7);
		String[] outputvalues = rowno.split(",");
		int a=Integer.parseInt(outputvalues[0]);
		int b=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{a,b}};
	}

}
