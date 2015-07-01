package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.Open;

import core.OpenandcloseBrowser;
import objects.homepage;

public class Unregistered_User extends homepage{
	
	
	/*public static void main(String args[])
	{
		System.out.println("hello");
	}
	*/
	
	@Test(priority=1,dataProviderClass=dataprovider.homepage.class,dataProvider="h_tj")
	public void header_TJ_Click(int rowN,int colN)
	{
		System.out.println("before title is"+driver.getTitle());
		System.out.println("in method"+rowN+colN);
		new homepage().get_header_TJ_Clicked();
		
		Assert.assertEquals(driver.getTitle(), "Jobs in India | Recruitment | Employment | Job Vacancies & Openings");
	}
	
	
	@Test(priority=2,dataProviderClass=dataprovider.homepage.class,dataProvider="h_jb")
	public void header_JB_click(int rowN,int colN)
	{
		
		new homepage().get_header_JB_Clicked();
		
		Assert.assertEquals(driver.getTitle(), "Make Intelligent Career Decisions - JobBuzz");
	}
	
	@Test(priority=3,dataProviderClass=dataprovider.homepage.class,dataProvider="h_sa")
	public void header_SA_click(int rowN,int colN)
	{
		
		new homepage().get_header_SA_Clicked();
		System.out.println("SA Clicked");
	System.out.println(driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "Make Intelligent Career Decisions - JobBuzz");
	}
	
	
}
