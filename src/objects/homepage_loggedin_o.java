package objects;

import core.Useractions;
import elements.Homepage_loggedin_e;

public class homepage_loggedin_o extends Useractions{
	
	public void open_Myaccount()
	{
	click(new Homepage_loggedin_e().MyAccount);

	}
	
	
	public void close_Myaccount() throws InterruptedException
	{
		Thread.sleep(1000);
	click(new Homepage_loggedin_e().barClose);
	}
	
	
	public void logout()
	{
	click(new Homepage_loggedin_e().logout);	
	}

}
