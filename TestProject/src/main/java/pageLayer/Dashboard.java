package pageLayer;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;


public class Dashboard extends TestBase
{
	public Dashboard()
	{
       PageFactory.initElements(driver, this);
	}

	//-------Object Repository-----------
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement search_textField;
	
	
	@FindBy(xpath="(//div[@class='m-2 card-title'])[2]")
	private WebElement click_Compony;
	
	@FindBy(xpath= "//input[@name='input-Qunatity']")
	private WebElement enter_quantity;

	@FindBy(xpath= "//button[@class='w-md btn btn-success']")
	private WebElement buy_button;
	
	
	@FindBy(xpath="//a[contains(text(),'Sell')]")
	private WebElement click_sellbutton1;
	
	@FindBy(xpath="//input[@id='quantity']")
	private WebElement enter_shareQuantity;
	
	@FindBy(xpath="//button[contains(text(),'Sell')]")
	private WebElement sell_button2;
	
	
	
	
	//--------Action Method--------------
	public void clickOnSearchField()
	{
		search_textField.sendKeys("Tech Mahindra");
	}
	
	public void clickOnListedCompony()
	{
		click_Compony.click();
	}
	
	     //-------------Buy Scenario-------------
	public void buyShare()
	{
		enter_quantity.sendKeys("5");
	}
	
	public void clickBuyButton()
	{
		//UtilClass.element = buy_button;  //For ScrollDown
		buy_button.click();
		//UtilClass.scrollDown();
		
	}
	
	   //-------------Sell Scenario------------
	
		public void clickOnSellButton1()
		{
			click_sellbutton1.click();
		}
		
		public void sellShare()
		{
			enter_shareQuantity.sendKeys("5");
		}
		
		public void clickSellbutton2()
		{
			sell_button2.click();
			driver.quit();
	    }
		
		
}










