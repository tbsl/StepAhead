package objects;

import core.Useractions;
import elements.mailinator_e;

public class mailinator extends Useractions{
	
	public void openmail()
	{
		click(new mailinator_e().Subject_click);
	}

}
