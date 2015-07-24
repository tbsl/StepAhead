package RND;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {
	
	public static void main(String args[])
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://stepahead.timesjobs.com/");
		driver.manage().window().maximize();
		
		WebElement menu=driver.findElement(By.xpath("//div[@class='home_midAlign']/ul/li/a[.='Improve Resume']"));
		Actions action=new Actions(driver);
		action.moveToElement(menu).build().perform();

		
		
	}

}
