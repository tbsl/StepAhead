package elements;

import org.openqa.selenium.By;

public class Homepage {
	//These are Header Links for other Verticals
	public By Contact_us=By.id("home_support");
	public By Contact_US_LiveChat=By.xpath("//strong[.='Live Chat']");
	public By Contact_US_Email=By.xpath("//strong[.='stepahead@timesjobs.com']");
	public By Contact_US_Number=By.xpath("//strong[.='1860-500-5500']");
	public By Contact_US_Query=By.xpath("//strong[.='Leave your Query']");
	public By Contact_US_toolbar_Close=By.xpath("//a[@class='topbar_close']");
	
//Signin-Registeration
	
	public By Sign_and_Register=By.id("login_lnk");
	public By Signin_email=By.id("j_username");
	public By signin_password=By.id("j_password");
	public By forget_pwd=By.id("linkobj");
	public By signIn_btn=By.xpath(".//*[@id='loginForm']/p[3]/input[2]");
	public By register_now=By.xpath(".//input[@value='Register Now']");
	public By Close_icon=By.xpath(".//*[@id='home_topbar']/div[2]/center/a");

	
	

}
