package RND;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://stepahead.timesjobs.com/");
		driver.manage().window().maximize();
		WebElement menu=driver.findElement(By.xpath("//div[@class='home_midAlign']/ul/li/a[.='Improve Resume']"));
		Point p=menu.getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());
		Actions action=new Actions(driver);
		action.moveToElement(menu).build().perform();//Try One.But not working
		//Thread.sleep(6000);
		//action.moveToElement(menu, 195, 72).build().perform();//Try Two.But not working
		System.out.println("Done");
		
		
	}

}
