package testLayer;


import org.testng.annotations.Test;

import pageLayer.Dashboard;
import pageLayer.Loginpage;
import testBase.TestBase;



public class LoginpageTest extends TestBase 
{
	String expected_url = "https://www.apps.dalalstreet.ai/dashboard";
	
	
	@Test
	public void veryLoginTest() throws InterruptedException
	{
		Loginpage login = new Loginpage();
		
        login.enterEmailAddress();
		login.enterPassword();
		login.clickOnLoginButton();
		Thread.sleep(3000);
	
    
		
		
		
		Dashboard dash = new Dashboard();
		Thread.sleep(2000);
		dash.clickOnSearchField();
		System.out.println("Click On Search Field");
		Thread.sleep(3000);
		dash.clickOnListedCompony();
		System.out.println("Click On Listed Compony");
		Thread.sleep(3000);
		
		dash.buyShare();
		dash.clickBuyButton();
		
		Thread.sleep(2000);
	    dash.clickOnSellButton1();
	    dash.sellShare();
	   
	    dash.clickSellbutton2();
		
		
		
		
		
	
		
	}
	
	
	

}
