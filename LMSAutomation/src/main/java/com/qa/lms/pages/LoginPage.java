package com.qa.lms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.lms.base.BaseClass;

public class LoginPage extends BaseClass
{
 
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Enter your email address / username']")
	public WebElement workEmail;
	
	@FindBy(xpath="//input[@placeholder='Enter your Password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@data-testid='login-submit-btn']")
	public WebElement signInButton;
	
	@FindBy(xpath="//a[@data-testid='login-forgot-password-link']")
	public WebElement forgotPasswordLink;

	
	
	/*public static WebElement element = null;
	public By byWorkEmail = By.xpath("//input[@placeholder='Enter your email address / username']");
	public By byPassword = By.xpath("//input[@placeholder='Enter your Password']");
	public By bySignInButton = By.xpath("//button[@data-testid='login-submit-btn']");
	public By byForgotPasswordLink = By.xpath("//a[@data-testid='login-forgot-password-link']");
	*/
	
	
		
	
	
	
	//Actions:
	
	public void sendWorkEmail(String strWorkEmail)
	{
		workEmail.sendKeys(strWorkEmail);
	}
	
	public void sendPassword(String strPassword)
	{
		password.sendKeys(strPassword);
	}
	
	public void clickSignInButton() throws InterruptedException
	{
		Thread.sleep(2000);
		signInButton.click();
	}
	
	
	
	
	
	
	
}
