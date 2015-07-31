package testcase;

import objects.Registeration_o;
import objects.homepage;
import objects.homepage_loggedin_o;
import objects.mailinator;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dataprovider.Registeration_dp;
import dataprovider.homepage_dp;
import elements.Homepage;
import elements.Homepage_loggedin_e;
import elements.Registeration_e;

public class Registeration extends homepage {

	@Test(priority=1,dataProvider="open_shutter_singnin",dataProviderClass=homepage_dp.class)
	public void openRegisteration(int row,int col) throws InterruptedException
	{
	Thread.sleep(2000);	
	new homepage().open_registeration();
	sa.assertEquals(isPresent(new Homepage().Signin_email),true, "Email is not visible");
	sa.assertEquals(isPresent(new Homepage().signin_password),true, "password is not visible");
	sa.assertEquals(isPresent(new Homepage().signIn_btn),true, "Signin Button is not visible");
	sa.assertAll();
	}
	
	@Test(priority=2,dataProvider="close_shutter_singnin",dataProviderClass=homepage_dp.class)
	public void closeRegisteration_Shutter(int row,int col) throws InterruptedException
	{
	new homepage().close_registeration();
	sa.assertEquals(isPresent(new Homepage().Signin_email),false, "Email is not visible");
	sa.assertEquals(isPresent(new Homepage().signin_password),false, "password is not visible");
	sa.assertEquals(isPresent(new Homepage().signIn_btn),false, "Signin Button is not visible");
	sa.assertAll();
	}
	
	
	
	
	@Test(priority=3,dataProvider="registeration_validations",dataProviderClass=Registeration_dp.class,alwaysRun=true)
	public void user_Registeration_Validations(int row,int col) throws InterruptedException
	{
		new homepage().open_registeration();
		new homepage().open_registeration_form();
		new Registeration_o().registeration_Validations();
		Thread.sleep(1000);
		sa.assertEquals(getTitle(),"Sign Up | Create Account | StepAhead","You are on wrong page");
		sa.assertEquals(isPresent(new Registeration_e().firstName_Error),true,"Name error is missing");
		sa.assertEquals(isPresent(new Registeration_e().emailAdd_Error),true,"Email error is missing");
		sa.assertAll();
	}
	
	@Test(priority=4,dataProvider="user_registeration",dataProviderClass=Registeration_dp.class)
	public void user_Registeration(int row,int col,String Name,String Email,String password,String Confirm_password,String Mobile)
	{
		
		new Registeration_o().user_registeration(Name, Email, password, Confirm_password, Mobile);
		navigate_to_mailinator(Email);
		new mailinator().openmail();
		//sa.assertEquals(getPageSource().contains(Name), true, "Name is missing");
		sa.assertEquals(getPageSource().contains(Email), true, "Email is missing");
		//sa.assertEquals(getPageSource().contains(password), true, "Password is missing");
		sa.assertAll();
	}

	
	
	
	
	
	@Test(priority=5,dataProvider="logout",dataProviderClass=Registeration_dp.class)
	public void logout(int row,int col) throws InterruptedException
	{
	navigate("http://ecm.timesjobs.com/");
	Thread.sleep(3000);
	new homepage_loggedin_o().open_Myaccount();
	Thread.sleep(1000);
	new homepage_loggedin_o().logout();
	sa.assertEquals(driver.getTitle(),"Resume Writing Services | Profile Verification | Career Astrology | StepAhead","You are on WRONG Page.Logout is redirecting wrong");
	}
	
	@Test(priority=6,dataProvider="forgetPassword",dataProviderClass=Registeration_dp.class)
	public void forgetPassword(int row,int col,String email) throws InterruptedException
	{
		System.out.println("Email is"+email);
		new homepage().open_registeration();
		new homepage().submit_forgetpassword(email);
		
		
	}
	
	
	@Test(priority=7,dataProvider="forgetPassword",dataProviderClass=Registeration_dp.class)
	public void forget_pwd_email_verification(int row,int col,String name)
	{
		navigate_to_mailinator(name);	
		new mailinator().openmail();


	}

	@Test(priority=8,dataProvider="login",dataProviderClass=Registeration_dp.class)
	public void Login(int row,int col,String email,String pwd,String name) throws InterruptedException
	{
		navigate("http://ecm.timesjobs.com/");

		new homepage().open_registeration();
		new homepage().login(email, pwd);
		new homepage_loggedin_o().open_Myaccount();
		sa.assertEquals(gettext(new Homepage_loggedin_e().loggedin_username(name)),name,"Loggedin user name not matched");
	}




	
	
}
