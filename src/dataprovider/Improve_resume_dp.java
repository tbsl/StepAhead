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
}
