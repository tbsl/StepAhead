package objects;
import core.Useractions;
import elements.*;
public class homepage extends Useractions{
	
	public void open_contact_us()
	{
	click(new Homepage().Contact_us);	
		
	}
	
	public void open_Leave_ur_Query()
	{
	click(new Homepage().Contact_US_Query);	
		
	}

	public void close_contact_us()
	{
	click(new Homepage().Contact_US_toolbar_Close);	
		
	}
	//SignIn#Registeration
	
	public void open_registeration()
	{
	click(new Homepage().Sign_and_Register);	
	}
	
	public void open_registeration_form()
	{
	click(new Homepage().register_now);	
	}
	
	
	public void close_registeration() throws InterruptedException
	{
		Thread.sleep(4000);
	click(new Homepage().Contact_US_toolbar_Close);
	}
	
}
