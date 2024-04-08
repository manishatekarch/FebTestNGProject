package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.AccountsPage;
import com.training.pages.HomePage;
import com.training.pages.LoginPage;
import com.training.pages.UsermenuDropdownPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class AccountsTest extends BaseTest{
	WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	AccountsPage accountspage;
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
		accountspage=new AccountsPage(driver);
		DOMConfigurator.configure("log4j.xml");
	}
	@Test
	public void CreateAccount_TC10()
	{ 
		
		Log.startTestCase("AccountsTab TC10");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickusermenudropdown();
		homepage.clickaccountTab();
		accountspage.clicknewbuttonaccounts();
		String accountnamestr=prop.getproperties("accountnamestr");
		accountspage.enterintoaccountname(accountnamestr);
		String typedropdown=prop.getproperties("typedropdown");
		accountspage.selecttypedropdown(typedropdown);
		String customerprioritydropdown=prop.getproperties("customerprioritydropdown");
		accountspage.selectcustomerprioritydropdown(customerprioritydropdown);
		accountspage.clicksavebuttonnewaccounts();
		Log.endTestCase("CreateAccount_TC10 is completed");
	}
	@Test
	public void Createnewview_TC11()
	{ 
		
		Log.startTestCase("AccountsTab TC11");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickusermenudropdown();
		homepage.clickaccountTab();
		accountspage.clickcreatenewview();
		String viewnamestr=prop.getproperties("viewnamestr");
		accountspage.enterintoviewname(viewnamestr);
		String viewuniquenamestr=prop.getproperties("viewuniquenamestr");
		accountspage.enterintoviewuniquename(viewuniquenamestr);
		accountspage.clicksavebuttoncreatenewvies();
		Log.endTestCase("Createnewview_TC11 is completed");
	}
	
	@Test
	public void Editview_TC12()
	{ 
		
		Log.startTestCase("AccountsTab TC12");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickusermenudropdown();
		homepage.clickaccountTab();
		String viewnamefromdropdown=prop.getproperties("viewnamefromdropdown");
		accountspage.selectviewnamefromDropdown(viewnamefromdropdown);
		accountspage.clickeditbuttonAccounts();
		String strnewviewname=prop.getproperties("strnewviewname");
		accountspage.enterintonewviewname(strnewviewname);
		String strfileddropdown=prop.getproperties("strfileddropdown");
		accountspage.selectfieldfromDropdown(strfileddropdown);
		String stroperator=prop.getproperties("stroperator");
		accountspage.selectoperatorDropdown(stroperator);
		String strvalue=prop.getproperties("strvalue");
		accountspage.enterintovalue(strvalue);
		accountspage.clickOnlastactivity();
		accountspage.clickOnaddbutton();
		accountspage.clickOnsavebutton();
		Log.endTestCase("Editview_TC12 is completed");
	}
	@Test
	public void MergeAccounts_TC13()
	{ 
		
		Log.startTestCase("AccountsTab TC13");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickusermenudropdown();
		homepage.clickaccountTab();
		accountspage.clickOnmergeaccount();
		String text=prop.getproperties("text");
		accountspage.enterintotextbox(text);
		accountspage.clickOnfindaccounts();
		accountspage.clickOnnextbutton();
		accountspage.clickOnmerge();
		Log.endTestCase("MergeAccounts_TC13 is completed");
	}
	@Test
	public void CreateAccountReport_TC14()
	{ 
		
		Log.startTestCase("AccountsTab TC14");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
		homepage.clickusermenudropdown();
		homepage.clickaccountTab();
		accountspage.clickOnaccountswithlastactivity();
		accountspage.clickOndatefrom();
		accountspage.clickOnselectdate();
		accountspage.clickOnsave();
		String reportnamestr=prop.getproperties("reportnamestr");
		accountspage.enterintoreportname(reportnamestr);
		String reportuniquenamestr=prop.getproperties("reportuniquenamestr");
		accountspage.enterintoreportuniquename(reportuniquenamestr);
		accountspage.clickOnsaveandrun();
		Log.endTestCase("CreateAccountReport_TC14 is completed");
	}
	
	
	@AfterMethod
	public void teardown()
	{
		//ScreenshotUtility class object accessing method takescreenshot(com.training.utilities package)
		screen.takescreenshot(driver);
		close();
	}

}
