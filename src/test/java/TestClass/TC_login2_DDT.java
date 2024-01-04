package TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.homepage;
import PageObject.loginpage;
import Testbase.Baseclass;
import Utilities.DataProviders;

public class TC_login2_DDT extends Baseclass{
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	void logintest(String email,String password,String expected)
	{
		//logger.info("login testcase going to start");
		homepage hp = new homepage(driver);
		hp.clickmyaccount();
		//logger.info("clicked  on account");
		hp.clicklogin();
		//logger.info("clicked on login");
		loginpage lp=new loginpage(driver);
		//logger.info("object of loginpage made");
		lp.setemail(email);
		lp.setpassword(password);
		Assert.fail();
		lp.click_password();
		//logger.info("after entering details click button pressed");
		
	}

}
