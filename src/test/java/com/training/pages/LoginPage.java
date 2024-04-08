package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.base.BasePage;

import junit.framework.Assert;

public class LoginPage extends BasePage {
	WebDriver driver;
	//constructor of loginpage
	public LoginPage(WebDriver driver) {
		//calling constructor from parent class i.e. base page
		super(driver);
	}
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="Login")
	WebElement login;
	
	@FindBy(id="error")
	WebElement errormessage;
	
	@FindBy(xpath="//input[@name='rememberUn']")
	WebElement remembermecheckbox;
	
	@FindBy(id="idcard-identity")
	WebElement usernamefield;
	
	@FindBy(id="forgot_password_link")
	WebElement forgotpassword;
	
	@FindBy(id="un")
	WebElement enterusernameInForgotpasswordpage;
	
	@FindBy(id="error")
	WebElement errormessageafterinvalidcredwntials;
	
	public void enterintoUsername(String strUsername)
	{   
		waitforElement(login,20);
		username.sendKeys(strUsername);
	}
	public void enterintoPassword(String strPassword) {
		password.sendKeys(strPassword);
	}
	public void enterintopasswordbyclearing(String str1Password)
	{
		password.clear();
		password.sendKeys(str1Password);
	}
	public void enterusernameInForgotpasswordpage(String strUsername)
	{   
		enterusernameInForgotpasswordpage.sendKeys(strUsername);
	}
	public void clickLogin()
	{
		login.click();
	}
	
	public void checkErrormessage()
	{
		if(errormessage.isDisplayed())
		{
			System.out.println("Error message data is: "+errormessage.getText());
		}
		else
		{
			System.out.println("Error message is not displayed");
		}
		
	}
	public void checkremembermecheckbox()
	{
		remembermecheckbox.click();
	}
	
	public void checkusernamefield(String strUsername)
	{   
		waitforElement(usernamefield,30);
		String actualtext=usernamefield.getText();
		String expectedtext=strUsername;
		Assert.assertEquals(actualtext, expectedtext);
	}
	public void clickForgotpassword()
	{
		forgotpassword.click();
	}
	
	public void validaterrormessageafterInvalidcredential()
	{   
		waitforElement(errormessageafterinvalidcredwntials,30);
		String actualtext=errormessageafterinvalidcredwntials.getText();
		String expectedtext="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		Assert.assertEquals(actualtext, expectedtext);
	}

}
