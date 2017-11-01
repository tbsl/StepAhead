package testcase;

import objects.Improve_resume_o;
import objects.Magic_Resume_India_o;

import org.testng.annotations.Test;

import dataprovider.Magic_Resume_india_dp;

public class Magic_Resume_India extends Magic_Resume_India_o{
	
	@Test(priority=1,dataProvider="Click_body_Improve_resume_Link",dataProviderClass=Magic_Resume_india_dp.class)
	public void Click_body_Improve_resume_Link(int row,int col) throws InterruptedException
	{
		
	new Improve_resume_o().improve_resume_mouseHover();	
	new Improve_resume_o().click_Mri();
	new Magic_Resume_India_o().Click_body_Improve_resume_Link();
	sa.assertEquals(getTitle(),"Resume Improvement | Professional Resume Writing | StepAhead","You are on Wrong PAGE");
	}
	
	//@Test(priority=2,dataProvider="click_improve_resume_lindia_ink",dataProviderClass=Magic_Resume_india_dp.class)
	public void click_improve_resume_lindia_ink(int row,int col) throws InterruptedException
	{
	new Improve_resume_o().improve_resume_mouseHover();
	new Improve_resume_o().click_Mri();
	new Magic_Resume_India_o().click_improve_resume_lindia_ink();
	sa.assertEquals(getTitle(),"Entry Level Resume Writing Services for Indian Jobs | Magic Resume India","You are on Wrong PAGE");
	}
	
	@Test(priority=3,dataProvider="click_MR_India_Button",dataProviderClass=Magic_Resume_india_dp.class)
	public void click_MR_India_Button(int row,int col) throws InterruptedException
	{
	new Improve_resume_o().improve_resume_mouseHover();
	new Improve_resume_o().click_Mri();
	click_MR_India_Button();

	sa.assertEquals(getTitle(),"Entry Level Resume Writing Services for Indian Jobs | Magic Resume India","You are on Wrong PAGE");
	}

	@Test(priority=4,dataProvider="Click_MR_India_EntryLevel_Tab",dataProviderClass=Magic_Resume_india_dp.class)
	public void Click_MR_India_EntryLevel_Tab(int row,int col) throws InterruptedException
	{
	Click_MR_India_EntryLevel_Tab();
	sa.assertEquals(getTitle(),"Entry Level Resume Writing Services for Indian Jobs | Magic Resume India","You are on Wrong PAGE");
	}
	
	@Test(priority=5,dataProvider="Click_MR_India_MidLevel_Tab",dataProviderClass=Magic_Resume_india_dp.class)
	public void Click_MR_India_MidLevel_Tab(int row,int col) throws InterruptedException
	{
	Click_MR_India_MidLevel_Tab();
	sa.assertEquals(getTitle(),"Mid Level Resume Writing Services for Indian Jobs | Magic Resume India");
	}
	
	@Test(priority=6,dataProvider="Click_MR_India_SeniorLevel_Tab",dataProviderClass=Magic_Resume_india_dp.class)
	public void Click_MR_India_SeniorLevel_Tab(int row,int col) throws InterruptedException
	{
	Click_MR_India_SeniorLevel_Tab();
	sa.assertEquals(getTitle(),"Senior Level Professional Resume Writing Services for Indian Jobs | Magic Resume India");
	}

	@Test(priority=7,dataProvider="click_MR_Internation_Button",dataProviderClass=Magic_Resume_india_dp.class)
	public void click_MR_Internation_Button(int row,int col) throws InterruptedException
	{
	click_MR_Internation_Button();
	sa.assertEquals(getTitle(),"Entry Level Resume Writing Services for International Jobs | Magic Resume International");
	}
	
	@Test(priority=8,dataProvider="Click_MR_Internation_EntryLevel_Tab",dataProviderClass=Magic_Resume_india_dp.class)
	public void Click_MR_Internation_EntryLevel_Tab(int row,int col) throws InterruptedException
	{
	Click_MR_Internation_EntryLevel_Tab();
	sa.assertEquals(getTitle(),"Entry Level Resume Writing Services for International Jobs | Magic Resume International");
	}
	
	@Test(priority=9,dataProvider="Click_MR_Internation_MidLevel_Tab",dataProviderClass=Magic_Resume_india_dp.class)
	public void Click_MR_Internation_MidLevel_Tab(int row,int col) throws InterruptedException
	{
	Click_MR_Internation_MidLevel_Tab();
	sa.assertEquals(getTitle(),"Mid Level Resume Writing Services for International Jobs | Magic Resume International");
	}
	
	@Test(priority=10,dataProvider="Click_MR_Internation_SeniorLevel_Tab",dataProviderClass=Magic_Resume_india_dp.class)
	public void Click_MR_Internation_SeniorLevel_Tab(int row,int col) throws InterruptedException
	{
	Click_MR_Internation_SeniorLevel_Tab();
	sa.assertEquals(getTitle(),"Senior Level Professional Resume Writing Services for International Jobs | Magic Resume International");
	}
	
	//Bussiness Logic
	
	
	//@Test(priority=10,dataProvider="Click_MR_Internation_SeniorLevel_Tab",dataProviderClass=Magic_Resume_india_dp.class)
	public void Purchase_MRI_0to1_Deliveryin_48(int row,int col) throws InterruptedException
	{
	
	}
	
	
	public void Purchase_MRI_0to1_Deliveryin_24(int row,int col) throws InterruptedException
	{
	
	}
	
	public void Purchase_MRI_1to3_Deliveryin_48(int row,int col) throws InterruptedException
	{
	
	}
	
	
	public void Purchase_MRI_1to3_Deliveryin_24(int row,int col) throws InterruptedException
	{
	
	}
	
	
	
	
	
	


}
