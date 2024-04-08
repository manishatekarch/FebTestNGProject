package com.training.base;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;
 //constructor of basepage
	public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void waitforElement(WebElement element,int time)
	{
		WebDriverWait wait=new WebDriverWait(driver,time);
    	wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void frames(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	public void switchdefaultFrame()
	{
	
		driver.switchTo().defaultContent();
	
	}
	public void Acceptalert()
	{
		driver.switchTo().alert().accept();
	
	}
	public void mousehover(WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	public void SelectDropdown(WebElement element,String visibletext)
	{
		Select select=new Select(element);
		select.selectByVisibleText(visibletext);
	}
	public void closingtheWindow()
	{
		String parentwindow=driver.getWindowHandle();
		 Set<String> handles=driver.getWindowHandles();
		 for(String windowhandles:handles)
		 {
			 if(!parentwindow.equals(windowhandles))
			 {
				 driver.switchTo().window(windowhandles).close();
				 
				 
			 }
		 }
		 driver.switchTo().window(parentwindow);
	}
	public void switchingtoWindow()
	{
		String parentwindow=driver.getWindowHandle();
		 Set<String> handles=driver.getWindowHandles();
		 for(String windowhandles:handles)
		 {
			 if(!parentwindow.equals(windowhandles))
			 {
				 driver.switchTo().window(windowhandles);
				 
				 
			 }
		 }
		 
	}
	public void switchingtoParentwindow(String parentwindow)
	{
		
		 Set<String> handles=driver.getWindowHandles();
		 for(String windowhandles:handles)
		 {
			 if(!parentwindow.equals(windowhandles))
			 {
				 driver.switchTo().window(windowhandles);
				 
				 
			 }
		 }
		 driver.switchTo().window(parentwindow);
	}
	public String getParentwindow()
	{
		String parentwindow=driver.getWindowHandle();
		return parentwindow;
		
	}
	
	
}
