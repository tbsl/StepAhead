package RND;
 
import java.io.IOException;
 

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class test1 {
 
public static void main(String[] args) {
String baseUrl = "http://messenger.yahoo.com/";
WebDriver driver = new FirefoxDriver();
 
driver.get(baseUrl);
WebElement downloadButton = driver.findElement(By.id("messenger-download"));
String sourceLocation = downloadButton.getAttribute("href");
System.out.println(System.getProperty("user.dir"));
String wget_command = "cmd /c wget -P c: --no-check-certificate " + sourceLocation;
 
try {
Process exec = Runtime.getRuntime().exec(wget_command);
int exitVal = exec.waitFor();
System.out.println("Exit value: " + exitVal);
} catch (InterruptedException ex) {
	System.out.println(ex.toString());
} catch(IOException ex){
	System.out.println(ex.toString());
}
driver.quit();
}
}