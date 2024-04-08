package com.training.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class AccountsPage extends BasePage{
	WebDriver driver;
	public AccountsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@title='New']")
	WebElement newbuttonaccounts;
	
	@FindBy(id="acc6")
	WebElement type;
	
	@FindBy(id="acc2")
	WebElement accountname;
	
	@FindBy(id="00Naj00000120BS")
    WebElement customerpriority;
	
	@FindBy(xpath="//input[@name='save' and @tabindex='34']")
	 WebElement savebuttonnewaccounts;
	
	@FindBy(xpath="//h2[@class='topName']")
	WebElement newaccountpagedata;
	
	@FindBy(xpath="//a[contains(text(),'Create New View')]")
	WebElement createnewview;
	
	@FindBy(id="fname")
	WebElement viewname;
	
	@FindBy(id="devname")
	WebElement viewuniquename;
	
	@FindBy(xpath="//input[@data-uidsfdc='3']")
	WebElement savebuttoncreatenewvies;
	
	@FindBy(xpath="//select[@id='00Baj000005Ktof_listSelect']/option")
	List<WebElement> accountviewlist;
	
	@FindBy(id="fcf")
	WebElement selectviewname;
	
	@FindBy(xpath="//a[text()='Edit']")
	WebElement editbuttonAccounts;
	
	@FindBy(id="fname")
	WebElement newviewname;
	
	@FindBy(id="fcol1")
	WebElement field;
	
	@FindBy(id="fop1")
	WebElement operator;
	
	@FindBy(id="fval1")
	WebElement value;
	
	@FindBy(xpath="//select[@id='colselector_select_1']//option[@value='ACCOUNT.LAST_ACTIVITY'][normalize-space()='Last Activity']")
	WebElement selectforactivity;
	
	@FindBy(xpath="//a[@id='colselector_select_0_right']//img[@title='Add']")
	WebElement addbutton;
	
	@FindBy(xpath="//input[contains(@data-uidsfdc,'5')]")
	WebElement savebutton;
	
	@FindBy(xpath="//a[contains(text(),'Merge Accounts')]")
	WebElement mergeaccount;
	
	@FindBy(id="srch")
	WebElement textbox;
	
	@FindBy(xpath="//input[@value='Find Accounts']")
	WebElement findaccounts;
	
	@FindBy(xpath="//div[@class='pbBottomButtons']//input[@title='Next']")
	WebElement nextbutton;
	
	@FindBy(xpath="//div[@class='pbTopButtons']//input[@title='Merge']")
	WebElement merge;
	
	@FindBy(xpath="//a[contains(text(),'Accounts with last activity > 30 days')]")
	WebElement accountswithlastactivity;
	
	@FindBy(id="ext-gen152")
	WebElement datefrom;
	
	@FindBy(xpath="//span[text()='30']")
	WebElement selectdate;
	
	@FindBy(id="ext-gen49")
	WebElement save;
	
	@FindBy(id="saveReportDlg_reportNameField")
	WebElement reportname;
	
	@FindBy(id="saveReportDlg_DeveloperName")
	WebElement reportuniquename;
	
	@FindBy(id="ext-gen297")
	WebElement saveandrun;
	public void clickOnsaveandrun()
	{
    	waitforElement(saveandrun,20);
    	saveandrun.click();
    	
	}
	public void enterintoreportuniquename(String strreportuniquename)
	{
		reportuniquename.clear();
		reportuniquename.sendKeys(strreportuniquename);
	}
	
	
	public void enterintoreportname(String strreportname)
	{
		
		reportname.sendKeys(strreportname);
	}
	
	public void clickOnsave()
	{
    	waitforElement(save,20);
    	save.click();
    	switchingtoWindow();
	}
	public void clickOnselectdate()
	{
    	waitforElement(selectdate,20);
    	selectdate.click();
    	
	}
	
	
	public void clickOndatefrom()
	{
    	waitforElement(datefrom,20);
    	datefrom.click();
    	
	}
	public void clickOnaccountswithlastactivity()
	{
    	waitforElement(accountswithlastactivity,30);
    	accountswithlastactivity.click();
    	
	}
	public void clickOnmerge()
	{
    	waitforElement(merge,30);
    	merge.click();
    	Acceptalert();
	}
	public void clickOnnextbutton()
	{
    	waitforElement(nextbutton,30);
    	nextbutton.click();
	}
	public void clickOnfindaccounts()
	{
    	waitforElement(findaccounts,30);
    	findaccounts.click();
	}
	public void enterintotextbox(String strtextbox)
	{
		textbox.clear();
		textbox.sendKeys(strtextbox);
	}
	public void clickOnmergeaccount()
	{
    	waitforElement(mergeaccount,30);
    	mergeaccount.click();
	}
	
	public void clickOnsavebutton()
	{
    	waitforElement(savebutton,30);
    	savebutton.click();
	}
	public void clickOnaddbutton()
	{
    	waitforElement(addbutton,30);
    	addbutton.click();
	}
	public void clickOnlastactivity()
	{
    	waitforElement(selectforactivity,30);
    	selectforactivity.click();
	}
	public void enterintovalue(String strnewviewname)
	{
		value.clear();
		value.sendKeys(strnewviewname);
	}
	public void selectoperatorDropdown(String stroperatordropdown)
	{
		SelectDropdown(operator,stroperatordropdown );
	}
	public void selectfieldfromDropdown(String strfielddropdown)
	{
		SelectDropdown(field,strfielddropdown );
	}
	public void enterintonewviewname(String strnewviewname)
	{
		newviewname.clear();
		newviewname.sendKeys(strnewviewname);
	}
	public void clickeditbuttonAccounts()
	{
    	waitforElement(editbuttonAccounts,30);
    	editbuttonAccounts.click();
	}
	
	public void selectviewnamefromDropdown(String strviewnamedropdown)
	{
		SelectDropdown(selectviewname,strviewnamedropdown );
	}
	public void clicksavebuttoncreatenewvies()
	{
    	waitforElement(savebuttoncreatenewvies,30);
    	savebuttoncreatenewvies.click();
    	for(WebElement listele:accountviewlist)
		 {
			 if(listele.getText().equalsIgnoreCase("firstlastdemo"))
			 {
				 System.out.println("Newly added view is present");
				 break;
			 }
			 
		 }
    	
	}
	public void enterintoviewuniquename(String struniqueviewname)
	{
		viewuniquename.clear();
		viewuniquename.sendKeys(struniqueviewname);
	}
	public void enterintoviewname(String strviewname)
	{
		viewname.clear();
		viewname.sendKeys(strviewname);
	}
	
	public void clickcreatenewview()
	{
    	waitforElement(createnewview,30);
    	createnewview.click();
	}
	public void clicksavebuttonnewaccounts()
	{
    	waitforElement(savebuttonnewaccounts,10);
    	savebuttonnewaccounts.click();
    	 if(newaccountpagedata.isDisplayed())
		 {
			 System.out.println("New account page is displayed with account details");
		 }
    	
	}
	
	public void selectcustomerprioritydropdown(String strpriority)
	{   
		waitforElement(customerpriority,20);
		SelectDropdown(customerpriority,strpriority);
	}
	
	public void selecttypedropdown(String dropdownOfType)
	{
		SelectDropdown(type,dropdownOfType);
	}
	public void clicknewbuttonaccounts()
	{
    	waitforElement(newbuttonaccounts,30);
    	newbuttonaccounts.click();
	}
	
	public void enterintoaccountname(String straccountname)
	{
		accountname.clear();
		accountname.sendKeys(straccountname);
	}
	

}
