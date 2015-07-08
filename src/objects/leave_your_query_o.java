package objects;

import core.Useractions;
import elements.Leave_your_Query;

public class leave_your_query_o extends Useractions {
	
	public void querysubmission(String Name,String Email,String phone,String Message)
	{
	type(new Leave_your_Query().name,Name);	
	type(new Leave_your_Query().email,Email);
	type(new Leave_your_Query().phoneNo,phone);
	type(new Leave_your_Query().comments,Message);
	click(new Leave_your_Query().SubmitQuery_btn);
	}
	
	public void queryvalidation()
	{
		click(new Leave_your_Query().SubmitQuery_btn);
	}


}
