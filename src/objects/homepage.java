package objects;
import core.Useractions;
import elements.*;
public class homepage extends Useractions{
	
	public void get_header_TJ_Clicked()
	{
	click(new Homepage().h_tj);
	SwitchwindowHandles("Jobs in India | Recruitment | Employment | Job Vacancies & Openings");
	}
	
	
	public void get_header_JB_Clicked()
	{
	click(new Homepage().h_jb);
	SwitchwindowHandles("Make Intelligent Career Decisions - JobBuzz");
	}
	
	public void get_header_SA_Clicked()
	{
		click(new Homepage().h_sa);
		SwitchwindowHandles("StepAhead Premium Career Services | Resume Writing Services | Resume Distribution Services | Profile Verification | Career Astrology");
	}

}
