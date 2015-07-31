package objects;

import org.openqa.selenium.By;

import core.Useractions;
import elements.Homepage_loggedin_e;

public class Improve_resume_o extends Useractions {
	
	public void improve_resume_mouseHover() throws InterruptedException
	{
	mouseHover(new Homepage_loggedin_e().Improve_Resume_menu);	
	}

}
