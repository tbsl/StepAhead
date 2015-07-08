package util;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Parameters;

public class OnFailure extends TestListenerAdapter {
	
	
	



	@Override
	  public void onTestSuccess(ITestResult tr) {
		String DataW="PASS";
		Object[] param=tr.getParameters();
		System.out.println("GOING TO UPDATE EXCEL");
		
		String raw_row=param[0].toString();
		String raw_col=param[1].toString();
		
		int row = Integer.parseInt(raw_row);
		int col = Integer.parseInt(raw_col);
		System.out.println("about to write row"+row);
		System.out.println("about to write col"+col);
				try {
					Excelhandler.cellWrite(row, col, DataW);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		 
	  }

	 
	 
	@Override
	  public void onTestFailure(ITestResult tr) {
		String DataW="FAIL";
		Object[] param=tr.getParameters();
		System.out.println("GOING TO UPDATE EXCEL");
		
		String raw_row=param[0].toString();
		String raw_col=param[1].toString();
		
		int row = Integer.parseInt(raw_row);
		int col = Integer.parseInt(raw_col);
		System.out.println("about to write row"+row);
		System.out.println("about to write col"+col);
				try {
					Excelhandler.cellWrite(row, col, DataW);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
	  }
}

