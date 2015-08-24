package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	
	public static WebDriverWait getWebDriverWait(WebDriver wd,long waitFor){
		return new WebDriverWait(wd, waitFor);
	}

}

