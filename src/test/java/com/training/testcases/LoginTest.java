package com.training.testcases;


import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;
import com.training.pages.UsermenuDropdownPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginTest extends BaseTest{
	WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	UsermenuDropdownPage usermenudropdown;
	PropertiesFile prop;
	//creating object of ScreenshotUtility class which is there in com.training.utilities package
	ScreenshotUtility screen = new ScreenshotUtility();
			
	@BeforeMethod
	public void beforeMethod()
	{
		driver=getDriver();
		prop = new PropertiesFile();
		driver.manage().window().maximize();
		String url=prop.getproperties("url");
		driver.get(url);
		loginpage=new LoginPage(driver);
		homepage=new HomePage(driver);
		usermenudropdown=new UsermenuDropdownPage(driver);
		DOMConfigurator.configure("log4j.xml");
	}
	
	@Test
	public void LoginErrorMessage_TC1()
	{  
		Log.startTestCase("Login TC1");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		loginpage.enterintopasswordbyclearing(" ");
		loginpage.clickLogin();
		loginpage.checkErrormessage();
		Log.error("Error message is displayed");
		Log.endTestCase("LoginErrorMessage_TC1 is completed");
		
	}
	
	@Test
	public void LoginToSalesForce_TC2()
	{ 
		//sequence of steps
		Log.startTestCase("Login TC2");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		Log.info("Successfully entered username "+username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		Log.info("Successfully entered password "+password);
		loginpage.clickLogin();
		String actualTitle=driver.getTitle();
		String expectedTitle="Home Page ~ Salesforce - Developer Edition";
		Assert.assertEquals(actualTitle, expectedTitle);
		Log.endTestCase("LoginToSalesForce_TC2 is completed");
	}
	@Test
	public void CheckRemeberMe_TC3()
	{ 
		//getting username and password from application.properties file 
		//prop.getproperties method from PropertiesFile class from com.training.utilities
		//sequence of steps
		Log.startTestCase("Login TC3");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.checkremembermecheckbox();
		loginpage.clickLogin();
		homepage.clickusermenudropdown();
		usermenudropdown.clickLogout();
		loginpage.checkusernamefield(username);
		Log.endTestCase("LoginToSalesForce_TC3 is completed");
		
	}
	@Test
	public void ForgotPassword_TC4A()
	{ 
		
		Log.startTestCase("Login TC4A");
		String username=prop.getproperties("username");
		loginpage.clickForgotpassword();
		loginpage.enterusernameInForgotpasswordpage(username);
		Log.endTestCase("ForgotPassword_TC4A is completed");
		
	}
	@Test
	public void ForgotPassword_4B()
	{ 
		
		Log.startTestCase("Login TC4B");
		String invalidusername=prop.getproperties("invalidusername");
		loginpage.enterintoUsername(invalidusername);
		String invalidpassword=prop.getproperties("invalidpassword");
		loginpage.enterintoPassword(invalidpassword);
		loginpage.clickLogin();
		loginpage.validaterrormessageafterInvalidcredential();
		Log.error("Error message is displayed");
		Log.endTestCase("ForgotPassword_4B is completed");
		
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		//ScreenshotUtility class object accessing method takescreenshot(com.training.utilities package)
		screen.takescreenshot(driver);
		close();
	}

}
