package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase
{
    public static WebDriver driver;  // use static varible
   
    
    //-----for log 4j--------

	
	@BeforeSuite
	public void test1()
	{
		
	}
	
	
	
	
    @Parameters("browser")
	@BeforeMethod
	public void setUp(String browser) throws InterruptedException
	{
		//browser = "Chrome";
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();   //driver is webdriver
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else 
		{
			System.out.println("Please Provide Correct Browser");
		}
		
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000), this);
		Thread.sleep(2000);
		
		
		//----------------Login Steps----------------
		//Loginpage login = new Loginpage();
		//login.enterEmailAddress();
		//login.enterPassword();
		//login.clickOnLoginButton();
	}
	
	@AfterMethod
	public void shutDown()
	{
		driver.quit();
		
	}
	
}
