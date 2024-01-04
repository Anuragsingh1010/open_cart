package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage extends basepage{
	
	public loginpage(WebDriver driver)
	{
		super (driver);
	}
	@FindBy(xpath="//input[@id='input-email']")
	WebElement inputemail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement inputpassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement clickpassword;
	
	public void setemail(String mail)
	{
		inputemail.sendKeys(mail);
	}
	
	public void setpassword(String pwd)
	{
		inputpassword.sendKeys(pwd);
	}
	public void click_password()
	{
		clickpassword.click();
	}
}
