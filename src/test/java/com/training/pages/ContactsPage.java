package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class ContactsPage extends BasePage{
	WebDriver driver;
	public ContactsPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//td[@class='pbButton']//input[@title='New']")
	WebElement newbutton;
	
	@FindBy(id="name_lastcon2")
	WebElement lastname;
	
	@FindBy(id="con4")
	WebElement accountname;
	
	@FindBy(xpath="//td[@class='pbButton']//input[@title='Save']")
	WebElement savebutton;
	
	@FindBy(xpath="//h2[@class='topName']")
	WebElement newcreatedcontact;
	
	@FindBy(xpath="//a[contains(text(),'Create New View')]")
	WebElement createnewview;

	@FindBy(id="fname")
	 WebElement viewname;
	
	@FindBy(id="devname") 
	WebElement viewuniquename;
	
	@FindBy(id="hotlist_mode") 
	 WebElement recentlycreated;
	
	@FindBy(xpath="//td[@class='pbButtonb']//input[@data-uidsfdc='3']") 
	WebElement save;
	
	@FindBy(xpath="//table[@class='list']") 
	 WebElement recentlycreatedlist;
	
	@FindBy(id="fcf") 
	WebElement mycontacttab;
	
	@FindBy(xpath="//a[contains(text(),'firstlast6789')]") 
	WebElement contactnamerecentcontact;
	
	@FindBy(xpath="//div[@class='requiredInput']//div[@class='errorMsg']") 
	 WebElement errormessage;
	
	@FindBy(xpath="//div[@class='pbHeader']//input[@title='Cancel']") 
	 WebElement cancel;
	
	@FindBy(xpath="//div[@class='content']")
	WebElement contacthome;
	
	@FindBy(xpath="//td[@id='topButtonRow']//input[@title='Save & New']")
	WebElement saveandnew;
	
	@FindBy(xpath="//div[@class='content']")
	 WebElement newcontactpage;
	public void verifynewcontactpage()
	{
		if(newcontactpage.isDisplayed())
		{
			System.out.println("Contact Edit: New Contact Page is dispalyed with data: "+newcontactpage.getText());
		}
    	
	}
	
	public void clicksaveandnewbutton()
	{
    	waitforElement(saveandnew,30);
    	saveandnew.click();
    	
	}
	
	public void verifyUserisonContactshomepage()
	{
		 String contacthomecontent=contacthome.getText();
		 if(contacthome.isDisplayed())
		 {
			 System.out.println("Contacts Home page is displayed with content: "+contacthomecontent);
		 }
    	
	}
	public void clickcancelbutton()
	{
    	waitforElement(cancel,30);
    	cancel.click();
    	
	}
	public void errormessagefornotenteringdataintoviewnamefield()
	{
		String errormessagedata=errormessage.getText();
		 if(errormessage.isDisplayed())
		 {
			 System.out.println("Error message under view name field:"+errormessagedata);
		 }
	}
	public void clickcontactnamerecentcontact()
	{
    	waitforElement(contactnamerecentcontact,30);
    	contactnamerecentcontact.click();
    	
	}
	
	public void selectmycontacttabdropdown(String strdatamycontacttab)
	{
		SelectDropdown(mycontacttab,strdatamycontacttab);
		
	}
	public void selectRecentlycreatedviewdropdown(String strrecentlycreated)
	{
		SelectDropdown(recentlycreated,strrecentlycreated);
		 String list=recentlycreatedlist.getText();
		 System.out.println("Table data is: "+list);
	}
	public void clicksave()
	{
    	waitforElement(save,30);
    	save.click();
    	
	}
	public void enterintoviewuniquename(String strviewuniquename)
	{   
		waitforElement(viewuniquename,20);
		viewuniquename.clear();
		viewuniquename.sendKeys(strviewuniquename);
	}
	
	public void enterintoviewname(String strviewname)
	{   
		waitforElement(viewname,20);
		viewname.clear();
		viewname.sendKeys(strviewname);
	}
	public void clickcreatenewview()
	{
    	waitforElement(createnewview,30);
    	createnewview.click();
    	
	}
	
	public void clicknewbutton()
	{
    	waitforElement(newbutton,30);
    	newbutton.click();
    	
	}
	
	public void enterintolastname(String strlastname)
	{   
		waitforElement(lastname,20);
		lastname.clear();
		lastname.sendKeys(strlastname);
	}
	public void enterintoAccountname(String straccountname)
	{   
		waitforElement(accountname,20);
		accountname.sendKeys(straccountname);
	}
	public void clicksavebutton()
	{
    	waitforElement(savebutton,30);
    	savebutton.click();
    	if(newcreatedcontact.isDisplayed())
		{
			System.out.println("New contact should be created");
		}
		
    	
	}
	
	

}
