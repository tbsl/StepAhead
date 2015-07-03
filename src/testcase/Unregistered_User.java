package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.thoughtworks.selenium.webdriven.commands.Open;

import core.OpenandcloseBrowser;
import elements.Homepage;
import objects.homepage;

public class Unregistered_User extends homepage{
	
	@Test(priority=1)
	public void open_contact_us()
	{
	new homepage().open_contact_us();
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(gettext(new Homepage().Contact_US_Email), "stepahead@timesjobs.com");
	sa.assertEquals(gettext(new Homepage().Contact_US_LiveChat), "Live Chat");
	sa.assertEquals(gettext(new Homepage().Contact_US_Number), "1860-500-5500");
	sa.assertEquals(gettext(new Homepage().Contact_US_Query), "Leave your Query");
	sa.assertFalse(isPresent(new Homepage().Contact_US_toolbar_Close));
	sa.assertAll();
	
	}
	
	
	
	
}
