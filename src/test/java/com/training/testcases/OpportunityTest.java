package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;
import com.training.pages.OpportunityPage;
import com.training.pages.UsermenuDropdownPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class OpportunityTest extends BaseTest{
	WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	OpportunityPage opportunitypage;
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
		opportunitypage=new OpportunityPage(driver);
		DOMConfigurator.configure("log4j.xml");
		
	}
	@Test
	public void OpportunitiesDropdown_TC15()
	{ 
		
		Log.startTestCase("OpportunityTab TC15");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickusermenudropdown();
		homepage.clickopportunitiestab();
		opportunitypage.checktextfromOpportunityDropdown();
	    Log.endTestCase("OpportunitiesDropdown_TC15 is completed");
	}
	@Test
	public void CreateNewOpportunity_TC16()
	{ 
		
		Log.startTestCase("OpportunityTab TC16");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickusermenudropdown();
		homepage.clickopportunitiestab();
		opportunitypage.clicknewbutton();
		String opportunityname=prop.getproperties("opportunityname");
		opportunitypage.enterintoopportunityname(opportunityname);
		String accountname=prop.getproperties("accountname");
		opportunitypage.enterintoaccountname(accountname);
		opportunitypage.clickclosedate();
		String stagedropdowndata=prop.getproperties("stagedropdowndata");
		opportunitypage.selectstageDropdown(stagedropdowndata);
		String probabilitydata=prop.getproperties("probabilitydata");
		opportunitypage.enterintoprobability(probabilitydata);
		String leadsourcedropdown=prop.getproperties("leadsourcedropdown");
		opportunitypage.selectleadsourceDropdown(leadsourcedropdown);
		opportunitypage.clicksavebutton();
	    Log.endTestCase("CreateNewOpportunity_TC16 is completed");
	}
	@Test
	public void OpportunityPipelineReport_TC17()
	{ 
		
		Log.startTestCase("OpportunityTab TC17");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickusermenudropdown();
		homepage.clickopportunitiestab();
		opportunitypage.clickopportunitiespipeline();
	    Log.endTestCase("OpportunityPipelineReport_TC17 is completed");
	}
	@Test
	public void StuckOpportunitiesReport_TC18()
	{ 
		
		Log.startTestCase("OpportunityTab TC18");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickusermenudropdown();
		homepage.clickopportunitiestab();
		opportunitypage.clickstuckopportunities();
	    Log.endTestCase("StuckOpportunitiesReport_TC18 is completed");
	}
	@Test
	public void QuarterlySummaryReport_TC19()
	{ 
		
		Log.startTestCase("OpportunityTab TC19");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickusermenudropdown();
		homepage.clickopportunitiestab();
		String intervaldropdowndata=prop.getproperties("intervaldropdowndata");
		opportunitypage.selectintervalDropdown(intervaldropdowndata);
		String includedropdowndata=prop.getproperties("includedropdowndata");
		opportunitypage.selectincludeDropdown(includedropdowndata);
		opportunitypage.clickrunreport();
		
	    Log.endTestCase("QuarterlySummaryReport_TC19 is completed");
	}
	
	
	@AfterMethod
	public void teardown()
	{
		//ScreenshotUtility class object accessing method takescreenshot(com.training.utilities package)
		screen.takescreenshot(driver);
		close();
	}
}
