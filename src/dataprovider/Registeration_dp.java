package dataprovider;

import java.io.IOException;
import java.util.Random;

import org.testng.annotations.DataProvider;

import util.Excelhandler;
import util.Utility;

public class Registeration_dp {
	
	  final static String Email=Utility.getRandomEmail();
	@DataProvider
	public static Object[][] registeration_validations() throws IOException
	{
		String data=Excelhandler.readCell(13,7);
		
		String[] datavalues=data.split(",");
		int row=Integer.parseInt(datavalues[0]);
		int col=Integer.parseInt(datavalues[1]);
		
		return new Object[][]{{row,col}};
	}
	
	@DataProvider
	public static Object[][] user_registeration() throws IOException
	{
		String outputdata=Excelhandler.readCell(14,7);
		
		String[] datavalues=outputdata.split(",");
		int out_row=Integer.parseInt(datavalues[0]);
		int out_col=Integer.parseInt(datavalues[1]);
		
		String inputdata=Excelhandler.readCell(14,6);
		String[] inputvalues=inputdata.split(",");
		String name=inputvalues[0];
		String email=Email;
		//String email=inputvalues[1];//Excel Based Email
		String password=inputvalues[2];
		String confirm_password=inputvalues[3];
		String mobile=inputvalues[4];
		return new Object[][]{{out_row,out_col,name,email,password,confirm_password,mobile}};
	}
	
	@DataProvider
	public static Object[][] login() throws IOException
	{
		String outputdata=Excelhandler.readCell(17,7);
		String[] datavalues=outputdata.split(",");
		int out_row=Integer.parseInt(datavalues[0]);
		int out_col=Integer.parseInt(datavalues[1]);
		
		String inputdata=Excelhandler.readCell(14,6);
		String[] inputvalues=inputdata.split(",");
		String name=inputvalues[0];
		String email=Email;
		//String email=inputvalues[1];//Excel Based Email
		String password=inputvalues[2];
		//String confirm_password=inputvalues[3];
		//String mobile=inputvalues[4];
		return new Object[][]{{out_row,out_col,email,password,name}};
	}
	
	
	@DataProvider
	public static Object[][] logout() throws IOException
	{
		String outputData[]=Excelhandler.readCell(15,7).split(",");
		int row=Integer.parseInt(outputData[0]);
		int col=Integer.parseInt(outputData[1]);
		
		return new Object[][]{{row,col}};
		
		
	}
	
	@DataProvider
	public static Object[][] forgetPassword() throws IOException
	{
		
		String outputdata=Excelhandler.readCell(16,7);
		String[] datavalues=outputdata.split(",");
		
		int out_row=Integer.parseInt(datavalues[0]);
		int out_col=Integer.parseInt(datavalues[1]);
		String inputdata=Excelhandler.readCell(14,6);
		String[] inputvalues=inputdata.split(",");
		String email=Email;
		//String email=inputvalues[1];//Excel Based Email
		
		return new Object[][]{{out_row,out_col,email}};
		
	}
	
	
	
}
