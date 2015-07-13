package objects;

import core.Useractions;
import elements.Registeration_e;

public class Registeration_o extends Useractions{
	
	public void registeration_Validations()
	{
		click(new Registeration_e().disclaymer_close);
		
		click(new Registeration_e().Register_now);
		

	}
	
	public void user_registeration(String name,String email,String password,String confirm_pwd,String phone)
	{
		type(new Registeration_e().name,name);
		type(new Registeration_e().email_address, email);
		type(new Registeration_e().password, password);
		type(new Registeration_e().confirm_password, confirm_pwd);
		type(new Registeration_e().phone, phone);
		click(new Registeration_e().SignIN);
	}


}
