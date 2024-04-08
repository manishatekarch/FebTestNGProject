package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.ContactsPage;
import com.training.pages.HomePage;
import com.training.pages.LeadsPage;
import com.training.pages.LoginPage;
import com.training.pages.UsermenuDropdownPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class ContactsTest extends BaseTest{

	WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
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
		contactspage=new ContactsPage(driver);
		usermenudropdownpage=new UsermenuDropdownPage(driver);
		DOMConfigurator.configure("log4j.xml");
		
	}
	@Test
	public void Createnewcontact_TC25()
	{ 
		
		Log.startTestCase("Contacts TC25");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
	    homepage.clickcontactstab();
	    contactspage.clicknewbutton();
	    String strlastnameOfcontacts=prop.getproperties("strlastnameOfcontacts");
	    contactspage.enterintolastname(strlastnameOfcontacts);
	    String straccountnameContacts=prop.getproperties("straccountnameContacts");
	    contactspage.enterintoAccountname(straccountnameContacts);
	    contactspage.clicksavebutton();
	    
	    Log.endTestCase("Createnewcontact_TC25 is completed");
	}
	@Test
	public void CreatenewviewintheContactPage_TC26()
	{ 
		
		Log.startTestCase("Contacts TC26");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
	    homepage.clickcontactstab();
	    contactspage.clickcreatenewview();
	    String strviewnamecontacts=prop.getproperties("strviewnamecontacts");
	    contactspage.enterintoviewname(strviewnamecontacts);
	    String strviewuniquenamecontacts=prop.getproperties("strviewuniquenamecontacts");
	    contactspage.enterintoviewuniquename(strviewuniquenamecontacts);
	    contactspage.clicksave();
	    
	    
	    Log.endTestCase("CreatenewviewintheContactPage_TC26 is completed");
	}
	@Test
	public void RecentlycreatedcontactintheContactPage_TC27()
	{ 
		
		Log.startTestCase("Contacts TC27");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
	    homepage.clickcontactstab();
	    String strrecentlycreated=prop.getproperties("strrecentlycreated");
	    contactspage.selectRecentlycreatedviewdropdown(strrecentlycreated);
	    Log.endTestCase("RecentlycreatedcontactintheContactPage_TC27 is completed");
	}
	
	@Test
	public void MyContactView_TC28()
	{ 
		
		Log.startTestCase("Contacts TC28");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
	    homepage.clickcontactstab();
	    String mycontactdropdown=prop.getproperties("mycontactdropdown");
	    contactspage.selectmycontacttabdropdown(mycontactdropdown);
	    
	    Log.endTestCase("MyContactView_TC28 is completed");
	}
	@Test
	public void ViewacontactinthecontactPage_TC29()
	{ 
		
		Log.startTestCase("Contacts TC29");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
	    homepage.clickcontactstab();
	    contactspage.clickcontactnamerecentcontact();
	    Log.endTestCase("ViewacontactinthecontactPage_TC29 is completed");
	}
	@Test
	public void ErrorMessageNewviewinContacts_TC30()
	{ 
		
		Log.startTestCase("Contacts TC30");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
	    homepage.clickcontactstab();
	    contactspage.clickcreatenewview();
	    String strviewuniquenamecontacts=prop.getproperties("strviewuniquenamecontacts");
	    contactspage.enterintoviewuniquename(strviewuniquenamecontacts);
	    contactspage.clicksave();
	    contactspage.errormessagefornotenteringdataintoviewnamefield();
	    Log.endTestCase("ErrorMessageNewviewinContacts_TC30 is completed");
	}
	@Test
	public void CancelButoonInCreateNewView_TC31()
	{ 
		
		Log.startTestCase("Contacts TC31");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
	    homepage.clickcontactstab();
	    contactspage.clickcreatenewview();
	    String strviewnamecontacts=prop.getproperties("strviewnamecontacts");
	    contactspage.enterintoviewname(strviewnamecontacts);
	    String strviewuniquenamecontacts=prop.getproperties("strviewuniquenamecontacts");
	    contactspage.enterintoviewuniquename(strviewuniquenamecontacts);
	    contactspage.clickcancelbutton();
	    contactspage.verifyUserisonContactshomepage();
	    Log.endTestCase("CancelButoonInCreateNewView_TC31 is completed");
	}
	@Test
	public void NewAndSaveButtonInNewContactPage_TC32()
	{ 
		
		Log.startTestCase("Contacts TC32");
		String username=prop.getproperties("username");
		loginpage.enterintoUsername(username);
		String password=prop.getproperties("password");
		loginpage.enterintoPassword(password);
		loginpage.clickLogin();
		Log.info("Successfully entered home page");
	    homepage.clickcontactstab();
	    contactspage.clicknewbutton();
	    String newstrlastnameOfcontacts=prop.getproperties("newstrlastnameOfcontacts");
	    contactspage.enterintolastname(newstrlastnameOfcontacts);
	    String newstraccountnameContacts=prop.getproperties("newstraccountnameContacts");
	    contactspage.enterintoAccountname(newstraccountnameContacts);
	    contactspage.clicksaveandnewbutton();
	    contactspage.verifynewcontactpage();
	    Log.endTestCase("NewAndSaveButtonInNewContactPage_TC32 is completed");
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		//ScreenshotUtility class object accessing method takescreenshot(com.training.utilities package)
		screen.takescreenshot(driver);
		close();
	}
	
}
