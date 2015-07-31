package objects;

import org.openqa.selenium.By;

import core.Useractions;
import elements.Homepage_loggedin_e;
import elements.Improve_resume_e;

public class Improve_resume_o extends Useractions {
	
	public void improve_resume_mouseHover() throws InterruptedException
	{
	mouseHover(new Homepage_loggedin_e().Improve_Resume_menu);	
	}
	
	public void click_Mri() throws InterruptedException
	{
	click(new Improve_resume_e().m_MRI);	
	}
	
	public void click_mr_international()
	{
	click(new Improve_resume_e().m_MRINterna);	
	}
	
	public void click_resume_critique()
	{
	click(new Improve_resume_e().m_Resume_Critique);	
	}
	
	public void click_social_profiler()
	{
	click(new Improve_resume_e().m_Social_Profiler);
	}
	
	public void click_visual_resume_premium()
	{
	click(new Improve_resume_e().m_VRP);
	}
	
	public void click_view_all_services()
	{
	click(new Improve_resume_e().m_VAS);
	}
	
	public void click_view_sample_resume()
	{
	click(new Improve_resume_e().m_VSR);
	}


}