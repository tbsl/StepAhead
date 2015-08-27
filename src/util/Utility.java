package util;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	
	static Random rand = new Random();
	
	
	public static WebDriverWait getWebDriverWait(WebDriver wd,long waitFor){
		return new WebDriverWait(wd, waitFor);
	}

	public static String getRandomEmail()
	{
		int   n = rand.nextInt(500000000) + 1;
		String randomNo=Integer.toString(n);
		 String Email=randomNo+"@mailinator.com";
		 return Email;

	}
	
}


