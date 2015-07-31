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
	
	
	
	public By Improve_Resume_menu=By.xpath("//div[@class='home_midAlign']/ul/li/a[.='Improve Resume']");
	
	public By Magic_Resume_India=By.xpath("//a[.='Magic Resume India']");
	
	public By Magic_Resume_International=By.xpath("//a[.='Magic Resume International']");
	public By Resume_Criticue=By.xpath("//a[.='Resume Critique']");
	
	public By Social_Profiler=By.xpath("//a[.='Social Profiler']");
	public By Visual_Resume_Premium=By.xpath("//a[.='Visual Resume Premium']");
	
	
	
	
	
	

}
