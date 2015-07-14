package elements;

import org.openqa.selenium.By;

public class Homepage_loggedin_e {
	
	public By MyAccount=By.id("home_account");
	public By MyProfile=By.xpath("//a[.='My Profile']");
	public By Myorders=By.xpath("//a[.='My Orders']");
	public By barClose=By.xpath("//a[@class='topbar_close']");
	public By logout=By.xpath("//a[.='Logout']");
	
	
	//public By ausername(String name)=By.xpath("//li/strong[.='"+name+']");
			
	public By loggedin_username(String Name)
	{
		return By.xpath("//li/strong[.='"+Name+"']");
	}

}
