package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.HomePage;
import com.training.pages.LeadsPage;
import com.training.pages.LoginPage;
import com.training.pages.OpportunityPage;
import com.training.pages.UsermenuDropdownPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class LeadsTest extends BaseTest{
	WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	LeadsPage leadspage;
	UsermenuDropdownPage usermenudropdownpage;
	PropertiesFile prop;
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
		leadspage=new LeadsPage(driver);
		usermenudropdownpage=new UsermenuDropdownPage(driver);
		DOMConfigurator.configure("log4j.xml");
		
	}
	@Test
	public void LeadsTab_TC20()
	{ 
		
		Log.startTestCase("LeadsTab TC20");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
	    homepage.clickleadstab();
	    Log.endTestCase("LeadsTab_TC20 is completed");
	}
	@Test
	public void LeadsSelectView_TC21()
	{ 
		
		Log.startTestCase("LeadsTab TC21");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
	    homepage.clickleadstab();
	    leadspage.checktextfromleadstabdropdown();
	    Log.endTestCase("LeadsSelectView_TC21 is completed");
	}
	@Test
	public void DefaultView_TC22()
	{ 
		
		Log.startTestCase("LeadsTab TC22");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
	    homepage.clickleadstab();
	    String leadsviewdropdowndata=prop.getproperties("leadsviewdropdowndata");
	    leadspage.selectleadsviewdropdown(leadsviewdropdowndata);
	    homepage.clickusermenudropdown();
	    usermenudropdownpage.clickLogout();
	    loginpage.enterintoUsername(username);
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickleadstab();
		leadspage.clickgobutton();
		
	    Log.endTestCase("DefaultView_TC22 is completed");
	}
	@Test
	public void TodaysLeadTab_TC23()
	{ 
		
		Log.startTestCase("LeadsTab TC23");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
	    homepage.clickleadstab();
	    String leadsviewdropdowndata=prop.getproperties("leadsviewdropdowndata");
	    leadspage.selectleadsviewdropdown(leadsviewdropdowndata);
	    leadspage.clickgobutton();
	    Log.endTestCase("TodaysLeadTab_TC23 is completed");
	}
	@Test
	public void NewbuttonLeadsHome_TC24()
	{ 
		
		Log.startTestCase("LeadsTab TC24");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
	    homepage.clickleadstab();
	    leadspage.clicknewbutton();
	    String strlastname=prop.getproperties("strlastname");
	    leadspage.enterintolastname(strlastname);
	    String strcompany=prop.getproperties("strcompany");
	    leadspage.enterintocompany(strcompany);
	    leadspage.clicksavebutton();
	    Log.endTestCase("NewbuttonLeadsHome_TC24 is completed");
	}
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		//ScreenshotUtility class object accessing method takescreenshot(com.training.utilities package)
		screen.takescreenshot(driver);
		close();
	}

}
