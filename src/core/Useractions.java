package core;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Useractions extends OpenandcloseBrowser{
	protected SoftAssert sa=new SoftAssert();

	public void refresh()
	{
		driver.navigate().refresh();
	}
	public void click(By loc)
	{
		driver.findElement(loc).click();
	}
	
	public void clear(By loc)
	{
		driver.findElement(loc).click();
	}
	
	
	public void type(By loc,String data)
	{
		driver.findElement(loc).sendKeys(data);
	}
	
	public String gettext(By loc)
	{
		return driver.findElement(loc).getText();
	}
	
	public String getActiveWindow()
	{
		
	return driver.getWindowHandle();	
		
	}
	public String getTitle()
	{
		
		return driver.getTitle();
	}
	
	public void closeWindow()
	{
	String activeWindow=getActiveWindow();
	Set<String> allwindow = driver.getWindowHandles();
	}
	
	public void navigate_to_mailinator(String url)
	{
		String[] name=url.split("@");
		String a=name[0];
		String finalURL="https://mailinator.com/inbox.jsp?to="+a;
		System.out.println(finalURL);
	 driver.navigate().to(finalURL);	
	}
	
	public void navigate(String url)
	{
		driver.navigate().to(url);	
	}
	
	
	
	public void mouseHover(By loc) throws InterruptedException
	{
		Actions action = new Actions(getInsatnce());
		WebElement mainMenu = driver.findElement(loc);
		String a=mainMenu.getAttribute("href");
		System.out.println(a);
		action.moveToElement(mainMenu).build().perform();;
		Thread.sleep(3000);

	}

	
	public void SwitchwindowHandles(String data)
	{
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String values:windowHandles)
					{
						driver.switchTo().window(values);
						 if(driver.getTitle().equals(data))
								 {
									 break;
								 }
					
					}
	}
	
	public boolean isPresent(By loc)
	{
	return driver.findElement(loc).isDisplayed();
	}

	public String getPageSource()
	{
		return driver.getPageSource();
	}
	
	
	public boolean retryingFindClick(By loc) {
        boolean result = false;
        int attempts = 0;
        while(attempts < 2) {
            try {
                driver.findElement(loc).click();
                result = true;
                break;
            } catch(StaleElementReferenceException e) {
            }
            attempts++;
        }
        return result;

}
	
	public void explicitWait(By loc)
	{
		
	    WebDriverWait wait = new WebDriverWait(driver, 15);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
	    		
	}
	


}
