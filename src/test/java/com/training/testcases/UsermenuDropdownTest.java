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
import com.training.pages.UsermenuDropdownPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

import junit.framework.Assert;

public class UsermenuDropdownTest extends BaseTest{
	WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	UsermenuDropdownPage usermenudropdown;
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
		usermenudropdown=new UsermenuDropdownPage(driver);
		DOMConfigurator.configure("log4j.xml");
		
	}
	
	@Test
	public void SelectMyProfileoptionfromusermenuAndEditAboutTab_TC6()
	{ 
		
		Log.startTestCase("UsermenuDropdown TC5");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickusermenudropdown();
		usermenudropdown.clickMyProfile();
		usermenudropdown.clickeditbutton();
		usermenudropdown.switchToFrame();
		usermenudropdown.clickAboutTab();
		String lastname=prop.getproperties("lastname");
		usermenudropdown.enterintoLastname(lastname);
		Log.info("Successfully entered into lastname of abouttab");
		usermenudropdown.clickonSaveallofabouttab();
		Log.endTestCase("SelectMyProfileoptionfromusermenuAndEditAboutTab_TC6 is completed");
	}
	@Test
	public void SelectMyProfileoptionfromusermenuAndPostlink_TC6()
	{ 
		
		Log.startTestCase("UsermenuDropdown TC6");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickusermenudropdown();
		usermenudropdown.clickMyProfile();
		usermenudropdown.clickonPostlink();
		String postbodydata=prop.getproperties("postbodydata");
		usermenudropdown.enterintopostbody(postbodydata);
		usermenudropdown.clicksharebutton();
		Log.endTestCase("SelectMyProfileoptionfromusermenuAndPostlink_TC6 is completed");
	}
	@Test
	public void SelectMyProfileoptionfromusermenuAndFilelink_TC6()
	{ 
		
		Log.startTestCase("UsermenuDropdown TC6");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickusermenudropdown();
		usermenudropdown.clickMyProfile();
		usermenudropdown.clickFilelink();
		usermenudropdown.clickuploadfile();
		String filepath=prop.getproperties("filepath");
		usermenudropdown.clickchoosefile(filepath);
		usermenudropdown.clickshareuploadfile();
		Log.endTestCase("SelectMyProfileoptionfromusermenuAndFilelink_TC6 is completed");
	}
	@Test
	public void SelectMyProfileoptionfromusermenuAndPhotoupload_TC6()
	{ 
		
		Log.startTestCase("UsermenuDropdown TC6");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickusermenudropdown();
		usermenudropdown.clickMyProfile();
		usermenudropdown.mousehoveronModerator();
		usermenudropdown.clickaddphoto();
		String photopath=prop.getproperties("photopath");
		usermenudropdown.clickchoosefilephoto(photopath);
		usermenudropdown.clicksaveforphoto();
		usermenudropdown.clicksaveaftercropphoto();
		Log.endTestCase("SelectMyProfileoptionfromusermenuAndPhotoupload_TC6 is completed");
	}
	
	@Test
	public void MySettingFromUsermenuDropdownPersonallinkAndLoginHistorylink_TC7()
	{ 
		
		Log.startTestCase("UsermenuDropdown TC7");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickusermenudropdown();
		usermenudropdown.clickmysettings();
		usermenudropdown.clickpersonallink();
		usermenudropdown.clickloginhistorylink();
		usermenudropdown.clickdownloadloginhistory();
		String actualTitle=driver.getTitle();
		String expectedTitle="Login History ~ Salesforce - Developer Edition";
		Assert.assertEquals(actualTitle, expectedTitle);
		Log.endTestCase("MySettingFromUsermenuDropdownPersonallinkAndLoginHistorylink_TC7 is completed");
	}
	@Test
	public void MySettingFromUsermenuDropdownDisplayAndLayoutlink_TC7()
	{ 
		
		Log.startTestCase("UsermenuDropdown TC7");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickusermenudropdown();
		usermenudropdown.clickmysettings();
		usermenudropdown.clickdisplayandlayoutlink();
		usermenudropdown.clickcustomizemytab();
		String dropdownoptioncustomapp=prop.getproperties("dropdownoptioncustomapp");
		usermenudropdown.selectCustomAppDropdown(dropdownoptioncustomapp);
		usermenudropdown.clickOnreports();
		usermenudropdown.clickOnaddbutton();
		usermenudropdown.clickOnsavebuttondisplayandlayout();
		usermenudropdown.clickOncontentinAppMenu();
		usermenudropdown.clickOnsalesforcechatterdropdown();
		Log.endTestCase("MySettingFromUsermenuDropdownDisplayAndLayoutlink_TC7 is completed");
	}
	@Test
	public void MySettingFromUsermenuDropdownEmaillink_TC7()
	{ 
		
		Log.startTestCase("UsermenuDropdown TC7");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickusermenudropdown();
		usermenudropdown.clickmysettings();
		usermenudropdown.clickOnemail();
		usermenudropdown.clickOnmyemailsettings();
		String emailstrname=prop.getproperties("emailstrname");
		usermenudropdown.enterintoemailname(emailstrname);
		String address=prop.getproperties("address");
		usermenudropdown.enterintoemailaddress(address);
		usermenudropdown.clickOnautomaticbccradiobutton();
		usermenudropdown.clickOnsavebuttonforemail();
		String actualTitle=driver.getTitle();
		String expectedTitle="My Email Settings ~ Salesforce - Developer Edition";
		Assert.assertEquals(actualTitle, expectedTitle);
	    Log.endTestCase("MySettingFromUsermenuDropdownEmaillink_TC7 is completed");
	}
	
	@Test
	public void MySettingFromUsermenuDropdownCalendersAndReminders_TC7()
	{ 
		
		Log.startTestCase("UsermenuDropdown TC7");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickusermenudropdown();
		usermenudropdown.clickmysettings();
		usermenudropdown.clickOncalenderandreminder();
		usermenudropdown.clickOnactivityreminder();
		usermenudropdown.clickOntestreminder();
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Activity Reminders ~ Salesforce - Developer Edition";
		Assert.assertEquals(actualTitle, expectedTitle);
	    Log.endTestCase("MySettingFromUsermenuDropdownCalendersAndReminders_TC7 is completed");
	}
	@Test
	public void DevelopersConsoleFromDropdown_TC8()
	{ 
		
		Log.startTestCase("UsermenuDropdown Logout_TC8");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickusermenudropdown();
		usermenudropdown.clickOndeveloperconsole();
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Home Page ~ Salesforce - Developer Edition";
		Assert.assertEquals(actualTitle, expectedTitle);
		Log.endTestCase("DevelopersConsoleFromDropdown_TC8 is completed");
	}
	
	
	@Test
	public void Logout_TC9()
	{ 
		
		Log.startTestCase("UsermenuDropdown Logout_TC9");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickusermenudropdown();
		usermenudropdown.clickLogout();
		Log.endTestCase("Logout_TC9 is completed");
	}
	
	@AfterMethod
	public void teardown()
	{
		//ScreenshotUtility class object accessing method takescreenshot(com.training.utilities package)
		screen.takescreenshot(driver);
		close();
	}

}
