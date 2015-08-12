package dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import util.Excelhandler;

public class Magic_Resume_india_dp {

	@DataProvider
	public static Object[][] Click_body_Improve_resume_Link() throws IOException
	{
		String outputdata=Excelhandler.readCell(27,7);
		String[] outputvalues = outputdata.split(",");
		int output_row=Integer.parseInt(outputvalues[0]);
		int output_col=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{output_row,output_col}};
		
	}

	@DataProvider
	public static Object[][] click_improve_resume_lindia_ink() throws IOException
	{
		String outputdata=Excelhandler.readCell(28,7);
		String[] outputvalues = outputdata.split(",");
		int output_row=Integer.parseInt(outputvalues[0]);
		int output_col=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{output_row,output_col}};
		
	}

	@DataProvider
	public static Object[][] click_MR_India_Button() throws IOException
	{
		String outputdata=Excelhandler.readCell(29,7);
		String[] outputvalues = outputdata.split(",");
		int output_row=Integer.parseInt(outputvalues[0]);
		int output_col=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{output_row,output_col}};
		
	}

	@DataProvider
	public static Object[][] Click_MR_India_EntryLevel_Tab() throws IOException
	{
		String outputdata=Excelhandler.readCell(30,7);
		String[] outputvalues = outputdata.split(",");
		int output_row=Integer.parseInt(outputvalues[0]);
		int output_col=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{output_row,output_col}};
		
	}

	@DataProvider
	public static Object[][] Click_MR_India_MidLevel_Tab() throws IOException
	{
		String outputdata=Excelhandler.readCell(31,7);
		String[] outputvalues = outputdata.split(",");
		int output_row=Integer.parseInt(outputvalues[0]);
		int output_col=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{output_row,output_col}};
		
	}

	@DataProvider
	public static Object[][] Click_MR_India_SeniorLevel_Tab() throws IOException
	{
		String outputdata=Excelhandler.readCell(32,7);
		String[] outputvalues = outputdata.split(",");
		int output_row=Integer.parseInt(outputvalues[0]);
		int output_col=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{output_row,output_col}};
		
	}

	@DataProvider
	public static Object[][] click_MR_Internation_Button() throws IOException
	{
		String outputdata=Excelhandler.readCell(33,7);
		String[] outputvalues = outputdata.split(",");
		int output_row=Integer.parseInt(outputvalues[0]);
		int output_col=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{output_row,output_col}};
		
	}

	@DataProvider
	public static Object[][] Click_MR_Internation_EntryLevel_Tab() throws IOException
	{
		String outputdata=Excelhandler.readCell(34,7);
		String[] outputvalues = outputdata.split(",");
		int output_row=Integer.parseInt(outputvalues[0]);
		int output_col=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{output_row,output_col}};
		
	}

	@DataProvider
	public static Object[][] Click_MR_Internation_MidLevel_Tab() throws IOException
	{
		String outputdata=Excelhandler.readCell(35,7);
		String[] outputvalues = outputdata.split(",");
		int output_row=Integer.parseInt(outputvalues[0]);
		int output_col=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{output_row,output_col}};
		
	}

	@DataProvider
	public static Object[][] Click_MR_Internation_SeniorLevel_Tab() throws IOException
	{
		String outputdata=Excelhandler.readCell(36,7);
		String[] outputvalues = outputdata.split(",");
		int output_row=Integer.parseInt(outputvalues[0]);
		int output_col=Integer.parseInt(outputvalues[1]);
		return new Object[][]{{output_row,output_col}};
		
	}


}
