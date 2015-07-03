package elements;

import org.openqa.selenium.By;

public class Leave_your_Query {
	public By name=By.id("name");
	public By email=By.id("email");
	public By phoneNo=By.id("phoneNumber");
	public By comments=By.id("comments");
	public By Query_Feedback=By.xpath("//h4[.='Thank you for submitting your query.We will get back to you shortly.']");
	public By Request_CallBack=By.xpath("//a[.='Request a Call back']");
	public By RCB_Name=By.id("name_header");
	public By RCB_phone=By.id("phoneNumber_header");
	public By RCB_comment=By.id("comments_header");
	public By RCB_Header=By.id("button_header");
	public By RCB_Close_button=By.xpath("//a[@class='cross hideQuery']");

}
