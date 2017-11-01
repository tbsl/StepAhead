package elements;

import org.openqa.selenium.By;

public class Registeration_e {
	public By name=By.id("firstName");
	public By firstName_Error=By.id("firstName_Error");
	public By email_address=By.id("emailAdd");
	public By emailAdd_Error=By.id("emailAdd_Error");
	
	public By password=By.id("password");
	public By confirm_password=By.id("retypePassword");
	
	public By SignIN=By.xpath("//*[@id='basicUserRegistrationBean']/div[2]/p[7]/input[2]");
	
	public By phone=By.id("mobNumber");
	public By checkbox=By.name("termsOfUseStatus");
	public By Register_now=By.xpath("//*[@value='Register Now']");
	public By disclaymer_close=By.xpath(".//a[@class='disclaimer_close fr']");
	
	
	

}
