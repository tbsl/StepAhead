package testcase;

import objects.Registeration_o;
import objects.homepage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dataprovider.Registeration_dp;
import dataprovider.homepage_dp;
import elements.Homepage;

public class Registeration extends homepage {

/*	@Test(priority=1,dataProvider="open_shutter_singnin",dataProviderClass=homepage_dp.class)
	public void openRegisteration(int row,int col)
	{
	new homepage().open_registeration();
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(isPresent(new Homepage().Signin_email),true, "Email is not visible");
	sa.assertEquals(isPresent(new Homepage().signin_password),true, "password is not visible");
	sa.assertEquals(isPresent(new Homepage().signIn_btn),true, "Signin Button is not visible");
	sa.assertAll();
	}
	
	@Test(priority=2,dataProvider="close_shutter_singnin",dataProviderClass=homepage_dp.class)
	public void closeRegisteration_Shutter(int row,int col) throws InterruptedException
	{
	new homepage().close_registeration();
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(isPresent(new Homepage().Signin_email),false, "Email is not visible");
	sa.assertEquals(isPresent(new Homepage().signin_password),false, "password is not visible");
	sa.assertEquals(isPresent(new Homepage().signIn_btn),false, "Signin Button is not visible");
	sa.assertAll();
	}*/
	
	
	@Test(dataProvider="open_shutter",dataProviderClass=homepage_dp.class)	
	public void test_open(int row,int col){
		System.out.println("aa");
	}

	
	/*
	@Test(dataProvider="registeration_validations",dataProviderClass=Registeration_dp.class)
	public void help(int row,int col)
	{
		System.out.println("aaaaaaa");
		new homepage().open_registeration();
		new homepage().open_registeration_form();
		new Registeration_o().registeration_Validations();
		
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(isPresent(new Homepage().Signin_email),false, "Email is not visible");
	sa.assertEquals(isPresent(new Homepage().signin_password),false, "password is not visible");
	sa.assertEquals(isPresent(new Homepage().signIn_btn),false, "Signin Button is not visible");
	sa.assertAll();

	}
	
	*/
	
	/*@Test(priority=3,dataProvider="registeration_validations",dataProviderClass=Registeration_dp.class,alwaysRun=true)
	public void user_Registeration_Validations(int row,int col)
	{
		System.out.println("in 3");
		new homepage().open_registeration();
		new homepage().open_registeration_form();
		new Registeration_o().registeration_Validations();
		
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(isPresent(new Homepage().Signin_email),false, "Email is not visible");
	sa.assertEquals(isPresent(new Homepage().signin_password),false, "password is not visible");
	sa.assertEquals(isPresent(new Homepage().signIn_btn),false, "Signin Button is not visible");
	sa.assertAll();
	}
	
	@Test(priority=4,dataProvider="user_registeration",dataProviderClass=Registeration_dp.class)
	public void user_Registeration(int row,int col,String Name,String Email,String password,String Confirm_password,String Mobile)
	{
		new homepage().open_registeration();
		new homepage().open_registeration_form();
		new Registeration_o().user_registeration(Name, Email, password, Confirm_password, Mobile);
		
		SoftAssert sa=new SoftAssert();
	sa.assertEquals(isPresent(new Homepage().Signin_email),false, "Email is not visible");
	sa.assertEquals(isPresent(new Homepage().signin_password),false, "password is not visible");
	sa.assertEquals(isPresent(new Homepage().signIn_btn),false, "Signin Button is not visible");
	sa.assertAll();
	}
	
*/	
	
}
