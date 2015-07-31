package testcase;

import objects.Improve_resume_o;
import objects.homepage;
import objects.homepage_loggedin_o;

import org.testng.annotations.Test;

import core.OpenandcloseBrowser;
import dataprovider.Improve_resume_dp;
import dataprovider.Registeration_dp;
import elements.Homepage_loggedin_e;

public class Improve_resume extends Improve_resume_o{
	

	/*@Test(priority=1,dataProvider="login",dataProviderClass=Registeration_dp.class)
	public void Login(int row,int col,String email,String pwd,String name)
	{
		navigate("http://ecm.timesjobs.com/");

		new homepage().open_registeration();
		new homepage().login(email, pwd);
	}*/
	
	
	@Test(priority=2,dataProvider="improve_resume_hover",dataProviderClass=Improve_resume_dp.class)
	public void Improve_Resume_hover(int row,int col) throws InterruptedException
	{
	new Improve_resume_o().improve_resume_mouseHover();
	}
	

}
