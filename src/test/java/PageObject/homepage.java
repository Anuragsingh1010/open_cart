package PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage extends basepage{
public homepage(WebDriver driver)
{
	super (driver);
}

@FindBy(xpath="//span[normalize-space()='My Account']")
WebElement myaccount;

@FindBy(xpath="//a[normalize-space()='Login']")
WebElement login;

public void clickmyaccount()
{
	myaccount.click();
}
public void clicklogin()
{
	login.click();
}


}
