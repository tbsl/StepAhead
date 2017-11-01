package testcase;

import objects.Improve_resume_o;
import objects.homepage;
import objects.homepage_loggedin_o;

import org.testng.annotations.Test;

import core.OpenandcloseBrowser;
import dataprovider.Improve_resume_dp;
import dataprovider.Registeration_dp;
import elements.Homepage_loggedin_e;
import elements.Improve_resume_e;

public class Improve_resume extends Improve_resume_o {

	/*
	 * @Test(priority=1,dataProvider="login",dataProviderClass=Registeration_dp.
	 * class) public void Login(int row,int col,String email,String pwd,String
	 * name) throws InterruptedException {
	 * navigate("http://ecm.timesjobs.com/");
	 * 
	 * new homepage().open_registeration(); new homepage().login(email, pwd); }
	 */

@Test(priority = 2, dataProvider = "improve_resume_hover", dataProviderClass = Improve_resume_dp.class)
	public void Improve_Resume_hover(int row, int col)
			throws InterruptedException {
		
		refresh();

		new Improve_resume_o().improve_resume_mouseHover();
		Thread.sleep(2000);
		sa.assertEquals(isPresent(new Improve_resume_e().m_MRI), true,
				"MRI is not visible");
		sa.assertEquals(isPresent(new Improve_resume_e().m_MRINterna), true,
				"MR International is not visible");
		sa.assertEquals(isPresent(new Improve_resume_e().m_Resume_Critique),
				true, "Resume Critique is not visible");
		sa.assertEquals(isPresent(new Improve_resume_e().m_Social_Profiler),
				true, "Social Profiler is not visible");
		sa.assertEquals(isPresent(new Improve_resume_e().m_VAS), true,
				"View All services is not visible");
		sa.assertEquals(isPresent(new Improve_resume_e().m_VRP), true,
				"Visual Resume Premium is not visible");
				sa.assertAll();
	}

	@Test(priority = 3, dataProvider = "click_mri", dataProviderClass = Improve_resume_dp.class)
	public void Click_MRI(int row, int col) throws InterruptedException {
		new Improve_resume_o().improve_resume_mouseHover();
		new Improve_resume_o().click_Mri();
		sa.assertEquals(
				getTitle(),
				"Entry Level Resume Writing Services for Indian Jobs | Magic Resume India",
				"MRI Page is opened WRONG");
		sa.assertAll();
	}

	@Test(priority = 4, dataProvider = "click_mr_international", dataProviderClass = Improve_resume_dp.class)
	public void Click_MR_International(int row, int col)
			throws InterruptedException {
		new Improve_resume_o().improve_resume_mouseHover();
		new Improve_resume_o().click_mr_international();
		sa.assertEquals(
				getTitle(),
				"Entry Level Resume Writing Services for International Jobs | Magic Resume International",
				"MR International is not opened");
	}

	@Test(priority = 5, dataProvider = "click_resume_critique", dataProviderClass = Improve_resume_dp.class)
	public void click_ResumeCritique(int row, int col)
			throws InterruptedException {
		new Improve_resume_o().improve_resume_mouseHover();
		new Improve_resume_o().click_resume_critique();
		sa.assertEquals(
				getTitle(),
				"Resume Analysis | Professional Resume Evaluation | Resume Critique | StepAhead",
				"Resume Critique is not opened");
	}

	@Test(priority = 6, dataProvider = "click_social_profiler", dataProviderClass = Improve_resume_dp.class)
	public void click_socialprofiler(int row, int col)
			throws InterruptedException {
		new Improve_resume_o().improve_resume_mouseHover();
		new Improve_resume_o().click_social_profiler();
		sa.assertEquals(
				getTitle(),
				"Social Media Profile Writing Services | Social Profiler | StepAhead",
				"social profile is not opened");
	}

	@Test(priority = 7, dataProvider = "click_viewresume", dataProviderClass = Improve_resume_dp.class)
	public void click_visual_resume(int row, int col)
			throws InterruptedException {
		new Improve_resume_o().improve_resume_mouseHover();
		new Improve_resume_o().click_visual_resume();
		sa.assertEquals(
				getTitle(),
				"Social Media Profile Writing Services | Social Profiler | StepAhead",
				"social profile is not opened");
	}

	@Test(priority = 8, dataProvider = "click_Visual_resume_premium", dataProviderClass = Improve_resume_dp.class)
	public void click_visual_resume_premium(int row, int col)
			throws InterruptedException {

		new Improve_resume_o().improve_resume_mouseHover();
		new Improve_resume_o().click_visual_resume_premium();
		sa.assertEquals(getTitle(),
				"Visual Resume Premium | Visual Resume Premium | StepAhead",
				"Visual Resume Premium page is not opened");
	}

	@Test(priority = 9, dataProvider = "click_viewall_services", dataProviderClass = Improve_resume_dp.class)
	public void click_view_all_services(int row, int col)
			throws InterruptedException {
		new Improve_resume_o().improve_resume_mouseHover();
		new Improve_resume_o().click_view_all_services();
		sa.assertEquals(getTitle(),
				"Resume Improvement | Professional Resume Writing | StepAhead",
				"View All Service page is not opened");
	}

	//@Test(priority = 10, dataProvider = "click_view_on_samples", dataProviderClass = Improve_resume_dp.class)
	public void click_view_sample_resume(int row, int col)
			throws InterruptedException {
		new Improve_resume_o().improve_resume_mouseHover();
		new Improve_resume_o().click_view_sample_resume();
		SwitchwindowHandles("Resume Samples for entry level profiles, freshers, graduates, new professionals.");
		sa.assertEquals(
				getTitle(),
				"Resume Samples for entry level profiles, freshers, graduates, new professionals.",
				"View Sample Resume page is not opened");
	}
	

}
