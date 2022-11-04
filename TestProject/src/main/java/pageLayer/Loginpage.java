package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class Loginpage extends TestBase {
	
	public Loginpage()   //Constructor
	{
		PageFactory.initElements(driver, this);  
	}
	
	//-------Object Repository------------
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_textbox;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_textbox;
	
	@FindBy(xpath="//div[@class='mt-3 d-grid']")
	private WebElement login_button;
	
	
	
	
	//-------Action Method------------
	public void enterEmailAddress()
	{
		email_textbox.sendKeys("smitakawathe91@gmail.com");
	}
	
	public void enterPassword()
	{
		password_textbox.sendKeys("Mayursmita");
	}
	
	public void clickOnLoginButton()
	{
		login_button.click();
	}
	
	
	
	

	
}
























