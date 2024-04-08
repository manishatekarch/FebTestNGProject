package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class OpportunityPage extends BasePage{

	WebDriver driver;
	public OpportunityPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="fcf")
	WebElement textfromopportunitiesdropdown;
	
	@FindBy(xpath="//input[@title='New']")
	WebElement newbutton;
	
	@FindBy(id="opp3")
	WebElement opportunityname;
	
	@FindBy(id="opp4")
	WebElement accountname;
	
	@FindBy(xpath="//a[contains(text(),'3/29/2024')]")
	WebElement closedate;
	
	@FindBy(id="opp11")
	WebElement stage;
	
	@FindBy(id="opp12")
	WebElement probability;
	
	@FindBy(id="opp6")
	WebElement leadsource;
	
	@FindBy(xpath="//td[@id='topButtonRow']//input[@title='Save']")
	 WebElement save;
	
	@FindBy(xpath="//a[text()='Opportunity Pipeline']")
	 WebElement opportunitiespipeline;
	
	@FindBy(xpath="//h1[text()='Opportunity Pipeline']")
	WebElement opportunitiespipelinepage;
	
	@FindBy(xpath="//a[text()='Stuck Opportunities']")
	 WebElement stuckopportunities;
	
	@FindBy(xpath="//h1[text()='Stuck Opportunities']")
	WebElement stuckopportunitiespage;
	
	@FindBy(id="quarter_q")
	WebElement interval;
	
	@FindBy(id="open")
	WebElement include;
	
	@FindBy(xpath="//input[@title='Run Report']")
	WebElement runreport;
	
	@FindBy(xpath="//h1[text()='Opportunity Report']")
	WebElement opportunityreport;
	
	public void selectintervalDropdown(String strinterval)
	{
		SelectDropdown(interval,strinterval );
	}
	public void selectincludeDropdown(String strinclude)
	{
		SelectDropdown(include,strinclude );
	}
	public void clickrunreport()
	{
    	waitforElement(runreport,30);
    	runreport.click();
    	 if(opportunityreport.isDisplayed())
		 {
			 System.out.println("Report Page with the Opportunities that satisfies the search criteria will be displayed.");
		 }
	}
	
	public void clickstuckopportunities()
	{
    	waitforElement(stuckopportunities,30);
    	stuckopportunities.click();
    	 if(stuckopportunitiespage.isDisplayed())
		 {
			 System.out.println("User is on  stuck opportunities page");
		 }
	}
	public void clickopportunitiespipeline()
	{
    	waitforElement(opportunitiespipeline,30);
    	opportunitiespipeline.click();
    	 if(opportunitiespipelinepage.isDisplayed())
		 {
			 System.out.println("User is on opportunities pipeline page");
		 }
	}
	
	public void clicksavebutton()
	{
    	waitforElement(save,30);
    	save.click();
	}
	public void selectleadsourceDropdown(String strleadsource)
	{
		SelectDropdown(leadsource,strleadsource );
	}
	public void enterintoprobability(String strprobability)
	{
		probability.clear();
		probability.sendKeys(strprobability);
	}
	public void selectstageDropdown(String strstagedropdown)
	{
		SelectDropdown(stage,strstagedropdown );
	}
	public void clickclosedate()
	{
    	waitforElement(closedate,10);
    	closedate.click();
	}
	public void enterintoaccountname(String straccountname)
	{
		accountname.clear();
		accountname.sendKeys(straccountname);
	}
	public void enterintoopportunityname(String stropportunityname)
	{   
		waitforElement(opportunityname,20);
		opportunityname.clear();
		opportunityname.sendKeys(stropportunityname);
	}
	public void clicknewbutton()
	{
    	waitforElement(newbutton,30);
    	newbutton.click();
	}
	public void checktextfromOpportunityDropdown()
	{
		String dropdowntext=textfromopportunitiesdropdown.getText();
		
		if(textfromopportunitiesdropdown.isDisplayed())
		{
			System.out.println("Textfromopportunitiesdropdown is present with content is: \n"+dropdowntext);
		}
		else
		{
			System.out.println("Textfromopportunitiesdropdown is not present");
		}
	}

}
