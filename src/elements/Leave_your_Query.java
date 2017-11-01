package elements;

import org.openqa.selenium.By;

public class Leave_your_Query {
	public By name=By.id("name");
	public By name_error=By.id("name_error");
	public By email=By.id("email");
	public By email_error=By.id("email_error");
	
	public By phoneNo=By.id("phoneNumber");
	public By phone_error=By.id("phoneNumber_error");
	
	
	public By comments=By.id("comments");
	public By comments_error=By.id("comments_error");
	
	public By SubmitQuery_btn=By.xpath(".//input[@value='Submit Query']");
	public By pageheader=By.xpath("//h1[.='Leave Your Query']");
	public By Query_Feedback=By.xpath("html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[1]/p");
	
	public By Request_CallBack=By.xpath("//a[.='Request a Call back']");
	public By RCB_Name=By.id("name_header");
	public By RCB_phone=By.id("phoneNumber_header");
	public By RCB_comment=By.id("comments_header");
	public By RCB_Header=By.id("button_header");
	public By RCB_Close_button=By.xpath("//a[@class='cross hideQuery']");

}
