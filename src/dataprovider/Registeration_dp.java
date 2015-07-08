package dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import util.Excelhandler;

public class Registeration_dp {
	
	@DataProvider
	public Object[][] registeration_validations() throws IOException
	{
		String data=Excelhandler.readCell(13,7);
		
		String[] datavalues=data.split(",");
		String row=datavalues[0];
		String col=datavalues[1];
		
		return new Object[][]{{row,col}};
	}
	
	@DataProvider
	public Object[][] user_registeration() throws IOException
	{
		String outputdata=Excelhandler.readCell(14,7);
		
		String[] datavalues=outputdata.split(",");
		String out_row=datavalues[0];
		String out_col=datavalues[1];
		
		String inputdata=Excelhandler.readCell(13,7);
		String[] inputvalues=inputdata.split(",");
		String name=inputvalues[0];
		String email=inputvalues[1];
		String password=inputvalues[2];
		String confirm_password=inputvalues[3];
		String mobile=inputvalues[4];
		return new Object[][]{{out_row,out_col,name,email,password,confirm_password,mobile}};
	}
}
