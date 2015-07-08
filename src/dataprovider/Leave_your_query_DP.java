package dataprovider;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import util.Excelhandler;

public class Leave_your_query_DP {
	
	
	@DataProvider
	public static Object[][] query_validation(ITestContext context) throws IOException
	{
		String outputdata=Excelhandler.readCell(8,7);
		String[] outputvalues = outputdata.split(",");
		int output_row=Integer.parseInt(outputvalues[0]);
		int output_col=Integer.parseInt(outputvalues[1]);
		
		
		
		return new Object[][]{{output_row,output_col}};
	}
	
	@DataProvider
	public static Object[][] query(ITestContext context) throws IOException
	{
		String outputdata=Excelhandler.readCell(9,7);
		String[] outputvalues = outputdata.split(",");
		
		int output_row=Integer.parseInt(outputvalues[0]);
		int output_col=Integer.parseInt(outputvalues[1]);
		
		String inputdata=Excelhandler.readCell(9,6);
		String[]  inputvalues= inputdata.split(",");
		
		
		String name=inputvalues[0];
		System.out.println("Name Was"+name);
		String email=inputvalues[1];
		System.out.println("email Was"+email);
		
		String phone=inputvalues[2];
		System.out.println("phone Was"+phone);
		
		String Query=inputvalues[3];
		System.out.println("Query Was"+Query);
		
		return new Object[][]{{output_row,output_col,name,email,phone,Query}};
	}
	
}
