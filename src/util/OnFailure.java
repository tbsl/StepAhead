package util;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Parameters;

public class OnFailure extends TestListenerAdapter {
	
	
	



	@Override
	  public void onTestSuccess(ITestResult tr) {
		String DataW="PASS";
		Object[] output=tr.getParameters();
		System.out.println("GOING TO UPDATE EXCEL");
		
		int a =Integer.parseInt(output[0].toString());
		
		int b =Integer.parseInt(output[1].toString());
				try {
					Excelhandler.cellWrite(a, b, DataW);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		 
	  }

	 
	 
	@Override
	  public void onTestFailure(ITestResult tr) {
		String DataW="FAIL";
		Object[] output=tr.getParameters();
		System.out.println("GOING TO UPDATE EXCEL");
		
		int a =Integer.parseInt(output[0].toString());
		
		int b =Integer.parseInt(output[1].toString());
				try {
					Excelhandler.cellWrite(a, b, DataW);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
	  }
}
