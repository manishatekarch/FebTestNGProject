package com.training.pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.base.BasePage;

public class HomePage<WebElements> extends BasePage {
	
    WebDriver driver;
	public HomePage(WebDriver driver) {
	  super(driver);
	}
	@FindBy(id="home_Tab")
	WebElement hometab;
	
	@FindBy(id="userNavLabel")
	WebElement usermenudropdown;
	
	@FindBy(xpath="//a[contains(text(),'Accounts')]")
	WebElement accountTab;
	
	@FindBy(id="Opportunity_Tab")
	WebElement opportunitiestab;
	
	@FindBy(id="Lead_Tab")
	 WebElement leadstab;
	
	@FindBy(id="Contact_Tab")
    WebElement contactstab;
	
	@FindBy(xpath="//a[@class='userMru']//span[@class='mruText']")
	WebElement firstlastnamelink;
	
	@FindBy(id="tailBreadcrumbNode")
	WebElement verifynamepage;
	
	@FindBy(className = "allTabsArrow")
	WebElement plus;
	
	@FindBy(className = "btnImportant")
	WebElement customizemytab;
	
	@FindBy(xpath = "//option[@value='report']")
	WebElement reports;
	
	@FindBy(className = "leftArrowIcon")
	WebElement remove;
	
	@FindBy(xpath = "//input[@title='Save']")
	WebElement savebutton;
	
	@FindBy(xpath = "//a[contains(text(),'Friday April 5, 2024')]")
	WebElement currentdatelink;
	
	@FindBy(xpath = "//a[contains(text(),'4:00 PM')]")
	WebElement timelinkweeklyreccurance;
	
	@FindBy(xpath = "//a[contains(text(),'8:00 PM')]")
	WebElement timelink;
	
	@FindBy(xpath = "//img[@class='comboboxIcon']")
	WebElement subjectcomboicon;
	
	@FindBy(xpath = "//a[text()='Other']")
	WebElement other;
	
	@FindBy(xpath = "//td[@id='topButtonRow']//input[@title='Save']")
	WebElement save;
	
	@FindBy(id="EndDateTime_time")
	WebElement endtimefield;
	
	@FindBy(id="timePickerItem_38")
	WebElement selecttime;
	
	@FindBy(id="IsRecurrence")
	WebElement recurrence;
	
	
	@FindBy(id="rectypeftw")
	 WebElement weeklybutton;
	
	@FindBy(id="RecurrenceEndDateOnly")
	 WebElement reccurenceend;
	
	@FindBy(id="calMonthPicker")
	 WebElement month;
	
	@FindBy(xpath="//div[@class='calBody']//td[text()='7']")
	 WebElement selecttimefield;
	
	@FindBy(xpath="//td[@id='topButtonRow']//input[@title='Save']")
	 WebElement save1;
	public void clicksaveafterweeklyreccurceselection()
	{
		waitforElement(save1,10);
		save1.click();
	}
	public void clickselecttimefield()
	{
		waitforElement(selecttimefield,10);
		selecttimefield.click();
	}
	public void selectmonthDropdown(String textdropdowninmonthfield)
	{
		SelectDropdown(month,textdropdowninmonthfield);
	}
	public void clickreccurenceend()
	{
    	waitforElement(reccurenceend,30);
    	reccurenceend.click();
    	
	}
	public void clickweeklybutton()
	{
    	waitforElement(weeklybutton,30);
    	weeklybutton.click();
    	
	}
	
	
	public void clickrecurrence()
	{
    	waitforElement(recurrence,30);
    	recurrence.click();
    	
	}
	
	public void clickselecttime()
	{
    	waitforElement(selecttime,30);
    	selecttime.click();
    	
	}
	
	public void clickendtimefield()
	{
    	waitforElement(endtimefield,30);
    	endtimefield.click();
    	
	}
	
	public void clicktimelinkweeklyreccurance()
	{
    	waitforElement(timelinkweeklyreccurance,30);
    	timelinkweeklyreccurance.click();
    	
	}
	
	//@FindBy(xpath = "//ul[contains(@class,'zen-inlineList zen-tabMenu')]//li")
	//WebElements List list;
	
	/*public void verifytabbar()
	{
		String tabbarlist=tabbar.getText();
		if(!tabbarlist.equalsIgnoreCase("Reports"))
		{
			System.out.println("Reports tab is removed from list");
		}
	}*/
	@FindBy(xpath = "//div[@class='multiLineEventBlock dragContentPointer']//span[@id='p:f:j_id25:j_id69:28:j_id71:0:j_id72:calendarEvent:j_id84']")
	WebElement otherevent;
	public void verifyOthereventinCalenderPage()
	{
		if(otherevent.isDisplayed())
		{
			System.out.println("The 'Calendar for FirstName LastName' page should be displayed with 'Other' event in the time slot 8:00PM to 9:00PM, as a link.");
		}
		
    	
	}
	public void clicksave()
	{
    	waitforElement(save,30);
    	save.click();
    	
	}
	public void clicksubjectcomboiconandAndsaveinparentwindow() 
	{
    	waitforElement(subjectcomboicon,30);
    	String parent=getParentwindow();
    	subjectcomboicon.click();
    	switchingtoWindow();
    	waitforElement(other,10);
    	other.click();
    	switchingtoParentwindow(parent);
        save.click();
 	 
   }
	public void clicksubjectcomboboxAndPerformactiononParentwindow()
	{
		waitforElement(subjectcomboicon,30);
    	String parent=getParentwindow();
    	subjectcomboicon.click();
    	switchingtoWindow();
    	waitforElement(other,10);
    	other.click();
    	switchingtoParentwindow(parent);
    	
	}
	
	public void clicktimelink()
	{
    	waitforElement(timelink,30);
    	timelink.click();
    	
	}
	public void clickcurrentdatelink()
	{
    	waitforElement(currentdatelink,30);
    	currentdatelink.click();
    	
	}
	public void clicksavebutton()
	{
    	waitforElement(savebutton,30);
    	savebutton.click();
    	
	}
	public void clickremove()
	{
    	waitforElement(remove,30);
    	remove.click();
    	
	}
	
	public void clickreports()
	{
    	waitforElement(reports,30);
    	reports.click();
    	
	}
	
	
	public void clickcustomizemytab()
	{
    	waitforElement(customizemytab,30);
    	customizemytab.click();
    	
	}
	public void clickplus()
	{
    	waitforElement(plus,30);
    	plus.click();
    	
	}
	public void verifynamepage()
	{
  
    	if(verifynamepage.isDisplayed())
		{
			System.out.println("User:FirstName LastName page is displayed");
		}
	}
	public void clickfirstlastnamelink()
	{
    	waitforElement(firstlastnamelink,30);
    	firstlastnamelink.click();
    	
	}
	public void clickcontactstab()
	{
    	waitforElement(contactstab,30);
    	contactstab.click();
	}
	public void clickleadstab()
	{
    	waitforElement(leadstab,30);
    	leadstab.click();
	}
	
	public void clickopportunitiestab()
	{
    	waitforElement(opportunitiestab,30);
    	opportunitiestab.click();
	}
	public void clickaccountTab()
	{
    	waitforElement(accountTab,30);
    	accountTab.click();
	}
    public void clickhomeTab()
	{
    	waitforElement(hometab,30);
    	hometab.click();
	}
    public void clickusermenudropdown()
    {
    	waitforElement(usermenudropdown,10);
    	usermenudropdown.click();
    }
    
    
    
}
