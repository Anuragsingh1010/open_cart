package TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.homepage;
import Testbase.Baseclass;

public class TC_homepagelogin extends Baseclass{
	@Test
	public void homepagelogin()
	{
		//logger.info("stsrting homepagelogin");
		homepage hp = new homepage(driver);
		hp.clickmyaccount();
		//logger.info("clicked  on account");
		hp.clicklogin();
		//logger.info("clicked on login");
		
	}
	

}
