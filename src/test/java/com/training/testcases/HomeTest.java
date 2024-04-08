package com.training.testcases;

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

public class HomeTest extends BaseTest {
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
	public void VerifyFirstnamaAndLastname_TC33()
	{ 
		
		Log.startTestCase("HomeTab TC33");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickhomeTab();
		homepage.clickfirstlastnamelink();
		homepage.verifynamepage();
		Log.endTestCase("VerifyFirstnamaAndLastname_TC33 is completed");
	}
	
	@Test
	public void VerifyEditedLastname_TC34()
	{ 
		
		Log.startTestCase("HomeTab TC34");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickhomeTab();
		homepage.clickfirstlastnamelink();
		usermenudropdown.clickeditbutton();
		usermenudropdown.switchToFrame();
		usermenudropdown.clickAboutTab();
		String lastname=prop.getproperties("lastname");
		usermenudropdown.enterintoLastname(lastname);
		Log.info("Successfully entered into lastname of abouttab");
		usermenudropdown.clickonSaveallofabouttab();
		homepage.verifynamepage();
		Log.endTestCase("VerifyEditedLastname_TC34 is completed");
	}
	
	@Test
	public void VerifyTabCustomization_TC35()
	{ 
		
		Log.startTestCase("HomeTab TC35");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickhomeTab();
		homepage.clickplus();
		homepage.clickcustomizemytab();
		homepage.clickreports();
		homepage.clickremove();
		homepage.clicksavebutton();
		homepage.clickusermenudropdown();
		usermenudropdown.clickLogout();
        loginpage.enterintoUsername(username);
	    loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		
		Log.endTestCase("VerifyTabCustomization_TC35 is completed");
	}
	
	@Test
	public void BlockingEventinCalender_TC36() 
	{ 
		
		Log.startTestCase("HomeTab TC36");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickhomeTab();
		homepage.clickcurrentdatelink();
		homepage.clicktimelink();
		homepage.clicksubjectcomboiconandAndsaveinparentwindow();
		
		//homepage.verifyOthereventinCalenderPage();
		Log.endTestCase("BlockingEventinCalender_TC36 is completed");
	}
	
	@Test
	public void Blockinganeventinthecalenderwithweeklyrecurrance_TC37() 
	{ 
		
		Log.startTestCase("HomeTab TC37");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickhomeTab();
		homepage.clickcurrentdatelink();
		homepage.clicktimelinkweeklyreccurance();
		homepage.clicksubjectcomboboxAndPerformactiononParentwindow();
		homepage.clickendtimefield();
		homepage.clickselecttime();
		homepage.clickrecurrence();
		homepage.clickweeklybutton();
		homepage.clickreccurenceend();
		String strmonthdropdowndata=prop.getproperties("strmonthdropdowndata");
		homepage.selectmonthDropdown(strmonthdropdowndata);
		homepage.clickselecttimefield();
		homepage.clicksaveafterweeklyreccurceselection();
		Log.endTestCase("Blockinganeventinthecalenderwithweeklyrecurrance_TC37 is completed");
	}
	
	
	@AfterMethod
	public void teardown()
	{
		//ScreenshotUtility class object accessing method takescreenshot(com.training.utilities package)
		screen.takescreenshot(driver);
		close();
	}
}
