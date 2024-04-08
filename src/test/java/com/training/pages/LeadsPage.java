package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class LeadsPage extends BasePage{
	WebDriver driver;
	public LeadsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="fcf")
	WebElement leadstabdropdown;
	
	@FindBy(id="fcf")
	WebElement leadsviewdropdown;
	
	@FindBy(xpath="//input[@title='Go!']")
	WebElement gobutton;
	
	@FindBy(id="00Baj000004saaE_listSelect")
	 WebElement viewpage;
	
	@FindBy(xpath="//input[@title='New']")
	WebElement newbutton;
	
	@FindBy(id="name_lastlea2")
	WebElement lastname;
	
	@FindBy(id="lea3")
	WebElement company;
	
	@FindBy(xpath="//td[@id='topButtonRow']//input[@title='Save']")
	WebElement savebutton;
	
	@FindBy(xpath="//h2[@class='topName']")
	WebElement newcreatedview;
	
	public void clicksavebutton()
	{
    	waitforElement(savebutton,30);
    	savebutton.click();
    	if(newcreatedview.isDisplayed())
		{
			System.out.println("Newly created lead page is displayed");
		}
		
    	
	}
	public void enterintocompany(String strcompany)
	{   
		waitforElement(company,20);
		company.clear();
		company.sendKeys(strcompany);
	}
	public void enterintolastname(String strlastname)
	{   
		waitforElement(lastname,20);
		lastname.clear();
		lastname.sendKeys(strlastname);
	}
	public void clicknewbutton()
	{
    	waitforElement(newbutton,30);
    	newbutton.click();
    	
	}
	public void clickgobutton()
	{
    	waitforElement(gobutton,30);
    	gobutton.click();
    	/*waitforElement(viewpage,20);
    	String actualtextpage= viewpage.getText();
    	
		 if(actualtextpage.equalsIgnoreCase("Today's Leads"))
		 {
			 System.out.println("Selected view page is displayed");
		 }*/
	}
	public void selectleadsviewdropdown(String strleadsviewdropdown)
	{
		SelectDropdown(leadsviewdropdown,strleadsviewdropdown );
	}
	public void checktextfromleadstabdropdown()
	{
		String dropdowntext=leadstabdropdown.getText();
		
		if(leadstabdropdown.isDisplayed())
		{
			System.out.println("leadstabdropdown is present with content is: \n"+dropdowntext);
		}
		else
		{
			System.out.println("leadstabdropdown is not present");
		}
	}

}
