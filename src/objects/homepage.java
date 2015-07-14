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
	
	
	public void open_forgetpassword(String Email)
	{
	click(new Homepage().forget_pwd);	
	//driver.switchTo().frame("GB_frame1");
	//driver.switchTo().frame("GB_frame");
	//type(new Forget_pwd_e().email,Email);
	

	}
	
	public void cancel_forgetpassword(String Email)
	{
	click(new Homepage().forget_pwd);	
	driver.switchTo().frame("GB_frame1");
	driver.switchTo().frame("GB_frame");
	click(new Forget_pwd_e().cancel);
	//type(new Forget_pwd_e().email,Email);
	}
	
	public void submit_forgetpassword(String Email)
	{
	click(new Homepage().forget_pwd);	
	driver.switchTo().frame("GB_frame1");
	driver.switchTo().frame("GB_frame");
	
	type(new Forget_pwd_e().email,Email);
	}
	
	public void close_registeration() throws InterruptedException
	{
		Thread.sleep(4000);
	click(new Homepage().Close_icon);
	}
	
}
