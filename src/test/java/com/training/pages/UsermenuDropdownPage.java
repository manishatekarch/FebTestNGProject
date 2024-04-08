package com.training.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;

public class UsermenuDropdownPage extends BasePage{

	WebDriver driver;
	public UsermenuDropdownPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id="userNavMenu")
	WebElement textfromusermenudropdown;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logout;
	
	@FindBy(xpath="//a[contains(text(),'My Profile')]")
	WebElement myprofilebutton;
	
	@FindBy(xpath="//a[@class='contactInfoLaunch editLink']//img")
	WebElement editbutton;
	
	@FindBy(id="contactInfoContentId")
	WebElement iframeeditprofile;
	
	@FindBy(xpath="//a[contains(text(),'About')]")
	WebElement abouttab;
	
	@FindBy(id="lastName")
	WebElement lastname;
	
	@FindBy(xpath="//input[@value='Save All']")
	WebElement saveallofabouttab;
	
	@FindBy(xpath="//li[@class='publisherFeedItemTypeChoice']//span[contains(text(),'Post')]")
	WebElement postlink;
	
	@FindBy(xpath="//iframe[@title='Rich Text Editor, publisherRichTextEditor']")
	WebElement postbodyiframe;
	
	@FindBy(xpath="//body[contains(@class,'chatterPublisherRTE')]")
	WebElement posttext;
	
	@FindBy(id="publishersharebutton")
	WebElement sharebutton;
	
	@FindBy(xpath="//a[contains(text(),'My Settings')]")
	WebElement mysettings;
	
	@FindBy(id="chatterFile")
	WebElement choosefile;
	
	@FindBy(xpath="//span[text()='File']")
	WebElement file;
	
	@FindBy(xpath="//span[@id='PersonalInfo_font']")
	WebElement personallink;
	
	@FindBy(id="LoginHistory_font")
	WebElement loginhistorylink;
	
	@FindBy(xpath="//a[contains(text(),'Download login history')]")
	WebElement downloadloginhistory;
	
	
	
	@FindBy(xpath="//a[text()='Upload a file from your computer']")
	WebElement uploadfile;
	
	@FindBy(id="publishersharebutton")
	WebElement shareuploadfile;
	
	@FindBy(id="displayBadge")
	WebElement moderator;
	
	@FindBy(xpath="//a[@id='uploadLink']")
	WebElement addphoto;
	
	@FindBy(id="uploadPhotoContentId")
	WebElement iframephoto;
	
	@FindBy(id="j_id0:uploadFileForm:uploadInputFile")
	WebElement choosefilephoto;
	
	@FindBy(xpath="//input[@id='j_id0:uploadFileForm:uploadBtn']")
	WebElement saveforphoto;
	
	@FindBy(xpath="//input[@id='j_id0:j_id7:save']")
	WebElement saveaftercropphoto;
	
	@FindBy(id="DisplayAndLayout_font")
	WebElement displayandlayoutlink;
	
	@FindBy(xpath="//span[@id='CustomizeTabs_font']")
	WebElement customizemytab;
	
	@FindBy(id="p4")
	WebElement customapp;
	
	@FindBy(xpath="//option[@value='report']")
	 WebElement reports;
	
	@FindBy(xpath="//img[@title='Add']")
	WebElement addbutton;
	
	@FindBy(xpath="//input[@title='Save']")
	WebElement savebuttondisplayandlayout;
	
	@FindBy(id="tsidLabel")
	WebElement contentinAppMenu;
	
	@FindBy(xpath="//span[@id='tsidLabel']")
	 WebElement salesforcechatterdropdown;
	
	@FindBy(xpath="//ul[@id='tabBar']/li")
	List<WebElement> tabdata;
	
	@FindBy(id="EmailSetup_font")
    WebElement email;
	
	@FindBy(id="EmailSettings_font")
	 WebElement myemailsettings;
	
	@FindBy(id="sender_name")
	WebElement emailname;
	
	@FindBy(id="sender_email")
	 WebElement emailaddress;
	
	@FindBy(id="auto_bcc1")
	WebElement automaticbcc;
	
	@FindBy(xpath="//input[@name='save']")
	 WebElement savebuttonemail;
	
	@FindBy(id="CalendarAndReminders_font")
	WebElement calenderandreminder;
	
	@FindBy(id="Reminders_font")
	WebElement activityreminder;
	
	@FindBy(id="testbtn")
	WebElement testreminder;
	
	@FindBy(xpath="//a[contains(text(),'Developer Console')]")
	WebElement developerconsole;
	
	public void clickOndeveloperconsole()
	{
		waitforElement(developerconsole,30);
		developerconsole.click();
		closingtheWindow();
		
	}
	public void clickOncalenderandreminder()
	{
		//waitforElement(calenderandreminder,10);
		calenderandreminder.click();
	}
	public void clickOnactivityreminder()
	{
		waitforElement(activityreminder,10);
		activityreminder.click();
	}
	public void clickOntestreminder()
	{
		waitforElement(testreminder,10);
		testreminder.click();
		closingtheWindow();//basepage
	}
	
	public void clickOnsavebuttonforemail()
	{
		waitforElement(savebuttonemail,10);
		savebuttonemail.click();
	}
	
	public void clickOnautomaticbccradiobutton()
	{
		waitforElement(automaticbcc,10);
		automaticbcc.click();
	}
	
	public void enterintoemailaddress(String stremailadd)
	{
		emailaddress.clear();
		emailaddress.sendKeys(stremailadd);
	}
	
	public void enterintoemailname(String stremail)
	{
		emailname.clear();
		emailname.sendKeys(stremail);
	}
	public void clickOnmyemailsettings()
	{
		waitforElement(myemailsettings,10);
		myemailsettings.click();
	}
	
	public void clickOnemail()
	{
		waitforElement(email,10);
		email.click();
	}
	public void clickOnsalesforcechatterdropdown()
	{
		waitforElement(salesforcechatterdropdown,10);
		salesforcechatterdropdown.click();
		 for(WebElement tabdatalist:tabdata)
		 {
			 if(tabdatalist.getText().equalsIgnoreCase("Reports"))
			 {
				 System.out.println("Reports tab is present");
				 break;
			 }
			 
		 }
		
	}
	public void clickOncontentinAppMenu()
	{
		waitforElement(contentinAppMenu,10);
		contentinAppMenu.click();
	}
	public void clickOnsavebuttondisplayandlayout()
	{
		waitforElement(savebuttondisplayandlayout,10);
		savebuttondisplayandlayout.click();
	}
	
	public void clickOnaddbutton()
	{
		waitforElement(addbutton,10);
		addbutton.click();
	}
	public void clickOnreports()
	{
		waitforElement(reports,10);
		reports.click();
	}
	public void selectCustomAppDropdown(String strdropdownoptioncustomapp)
	{
		SelectDropdown(customapp, strdropdownoptioncustomapp);
		
	}
	public void clickcustomizemytab()
	{
		waitforElement(customizemytab,10);
		customizemytab.click();
	}
	
	
	public void clickdisplayandlayoutlink()
	{
		waitforElement(displayandlayoutlink,10);
		displayandlayoutlink.click();
	}
	
	public void clickpersonallink()
	{
		waitforElement(personallink,10);
		personallink.click();
	}
	public void clickloginhistorylink()
	{
		waitforElement(loginhistorylink,10);
		loginhistorylink.click();
	}
	public void clickdownloadloginhistory()
	{
		waitforElement(downloadloginhistory,10);
		downloadloginhistory.click();
		
	}

	public void clicksaveaftercropphoto()
	{
		waitforElement(saveaftercropphoto,10);
		saveaftercropphoto.click();
	}
	
	public void clicksaveforphoto()
	{
		saveforphoto.click();
	}
	public void clickchoosefilephoto(String photopath)
	{
		frames(iframephoto);
		choosefilephoto.sendKeys(photopath);
	}
	public void clickaddphoto()
	{  
		//waitforElement(uploadfile,10);
		addphoto.click();
	}
	public void mousehoveronModerator()
	{
		waitforElement(moderator,20);
		mousehover(moderator);
		//Actions action=new Actions(driver);
		//action.moveToElement(moderator).build().perform();
	}
	public void clickshareuploadfile()
	{  
		waitforElement(shareuploadfile,10);
		shareuploadfile.click();
	}
	public void clickuploadfile()
	{  
		//waitforElement(uploadfile,10);
		uploadfile.click();
	}
	public void clickchoosefile(String strfilepath)
	{  
		waitforElement(choosefile,10);
		choosefile.sendKeys(strfilepath);
	}
	public void clickFilelink()
	{  
		waitforElement(file,20);
		file.click();
	}
	public void clickmysettings()
	{
		mysettings.click();
	}
	public void clicksharebutton()
	{
		//driver.switchTo().defaultContent();
		 switchdefaultFrame();
		 waitforElement(sharebutton,10);
		sharebutton.click();
	}
	 public void clickonPostlink()
	    {
		// switchdefaultFrame(driver);
		 waitforElement(postlink,20);
		 postlink.click();
	    }
	 public void enterintopostbody(String strdata)
	 {
		 frames(postbodyiframe);
		 waitforElement(posttext,10);
		 posttext.sendKeys(strdata);
	 }
	 public void clickonSaveallofabouttab()
	    {
	       saveallofabouttab.click();
	       
	      
	    }
	public void enterintoLastname(String str1Password)
	{
		lastname.clear();
		lastname.sendKeys(str1Password);
	}
	public void clickeditbutton()
    {
    	waitforElement(editbutton,20);
    	editbutton.click();
    }
    

	public void clickAboutTab()
    {
    	waitforElement(abouttab,20);
    	abouttab.click();
    }
    public void clickLogout()
    {
    	waitforElement(logout,30);
    	logout.click();
    }
    public void clickMyProfile()
    {
    	waitforElement(myprofilebutton,20);
    	myprofilebutton.click();
    }
    public void checktextInUsermenuDropdown()
    {
    	String dropdowntext=textfromusermenudropdown.getText();
    	if(textfromusermenudropdown.isDisplayed())
		{
			System.out.println("Usermenudropdown is present with content is: \n"+dropdowntext);
		}
		else
		{
			System.out.println("Usermenu dropdown is not present");
		}
    }
	
    public void switchToFrame()
    {
    	frames(iframeeditprofile);
    }
    

}
