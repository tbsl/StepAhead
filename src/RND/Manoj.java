package RND;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.thoughtworks.selenium.webdriven.commands.ClickAt;

public class Manoj {
public static void main(String args[]) throws InterruptedException, AWTException
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
    driver.get("http://jobbuzz.timesjobs.com/");
    driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[2]/a")).click();
    driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[1]/div[1]/div/a")).click();
    driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[1]/div[1]/a")).click();
    driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[2]/form/div/div/div[3]/div/div/span[1]/input")).sendKeys("fasttrack india pvt ltd");
    driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[2]/form/div/div/div[4]/div/div/span[1]/input")).sendKeys("new designation");
    driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[2]/form/div/div/div[5]/div/div/span[1]/input")).sendKeys("new designation");
    driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[2]/form/div/div/div[6]/div/a[1]")).click();
    
    
   Thread.sleep(4000);

   
  // html/body/div[2]/div[3]/div/div/div/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[3]/form/div/div/div[1]/div[1]/div/div/div[2]/div

   //X=155 y=316
   
   
   //WebElement salary=driver.findElement(By.xpath("//h3[.='Salary']"));
   Actions act =new Actions(driver);
   
   //act.moveToElement(salary,155,316).click().build().perform();
   
   //act.moveByOffset(155, 316).click().build().perform();
   
  
   /*System.out.println(salary.getLocation());
   Point poi=salary.getLocation();
   System.out.println(poi.getX());
   System.out.println(poi.getY());
   WebElement salary=driver.findElement(By.xpath("//label[.='mandatory!']"));*/
   Robot robot = new Robot();
   robot.mouseMove(155,316);
   robot.mousePress(InputEvent.BUTTON1_MASK);
   robot.mouseRelease(InputEvent.BUTTON1_MASK);
   
   
   System.out.println("END");

}
}
