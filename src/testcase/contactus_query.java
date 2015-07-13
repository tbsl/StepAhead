package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.thoughtworks.selenium.webdriven.commands.Open;

import core.OpenandcloseBrowser;
import dataprovider.Leave_your_query_DP;
import dataprovider.homepage_dp;
import elements.Homepage;
import elements.Leave_your_Query;
import objects.homepage;
import objects.leave_your_query_o;

public class contactus_query extends homepage{
	
	@Test(priority=1,dataProvider="open_shutter",dataProviderClass=homepage_dp.class)
	public void open_contact_us(int row,int col)
	{
	new homepage().open_contact_us();
	
	
	sa.assertEquals(gettext(new Homepage().Contact_US_Email), "stepahead@timesjobs.com");
	sa.assertEquals(gettext(new Homepage().Contact_US_LiveChat), "Live Chat");
	sa.assertEquals(gettext(new Homepage().Contact_US_Number), "1860-500-5500");
	sa.assertEquals(gettext(new Homepage().Contact_US_Query), "Leave your Query","leave ur querry is not matched");
	
	sa.assertEquals(isPresent(new Homepage().Contact_US_toolbar_Close),true);
	sa.assertAll();
	
	}
	
	@Test(priority=2,dataProvider="close_shutter",dataProviderClass=homepage_dp.class)
	public void close_contact_us(int row,int col)
	{
		
	new homepage().close_contact_us();
	sa.assertEquals(false,isPresent(new Homepage().Contact_US_Email));
	sa.assertEquals(false,isPresent(new Homepage().Contact_US_LiveChat));
	sa.assertEquals(false,isPresent(new Homepage().Contact_US_Number));
	sa.assertEquals(false,isPresent(new Homepage().Contact_US_Query));
	sa.assertAll();
	}
	
	
	@Test(priority=3,dataProvider="query_validation",dataProviderClass=Leave_your_query_DP.class)
	public void submitQuery_Validations(int row,int col)
	{
		
	new homepage().open_contact_us();
	new homepage().open_Leave_ur_Query();
	new leave_your_query_o().queryvalidation();
	sa.assertEquals(gettext(new Leave_your_Query().name_error), "Enter Name");
	sa.assertEquals(gettext(new Leave_your_Query().email_error), "Please enter a valid email address");
	sa.assertEquals(gettext(new Leave_your_Query().phone_error), "Please enter Mobile No.");
	sa.assertEquals(gettext(new Leave_your_Query().comments_error), "Enter a comprehensive query");
	sa.assertAll();
	}
	
	@Test(priority=4,dataProvider="query",dataProviderClass=Leave_your_query_DP.class)
	public void submitQuery(int row,int col,String name,String email,String phone,String Query)
	{
		
		new homepage().open_contact_us();
		new homepage().open_Leave_ur_Query();
		new leave_your_query_o().querysubmission(name, email, phone, Query);
	sa.assertEquals(gettext(new Leave_your_Query().Query_Feedback),"Thank you for submitting your query.We will get back to you shortly.");
	sa.assertAll();
	}
	
	
	
}
