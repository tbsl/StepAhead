package RND;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ps {

	public static void main(String[] args) throws InterruptedException {
		String url="https://mailinator.com/inbox.jsp?to=sunil25";
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(10000);
		
		WebElement clicke=driver.findElement(By.xpath(".//*[@id='mailcontainer']/li/a/div[2]"));
		clicke.click();
		Thread.sleep(10000);
		WebElement elem=driver.findElement(By.xpath("html/body/div[1]/div/div/table/tbody/tr[2]/td/font/div[1]"));

		String a=elem.getTagName();
		System.out.println(a);

		
	}

}
