package com.qa.lms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.lms.base.BaseClass;

public class HomePage extends BaseClass
{
	WebDriverWait wbwait = new WebDriverWait(driver,360);
	
	@FindBy(xpath="//a[@data-testid='home-menu']")
	public WebElement homeTab;
	
	@FindBy(xpath="//a[@data-testid='courses-menu']")
	public WebElement coursesTab;
	
	@FindBy(xpath="//a[@data-testid='paths-menu']")
	public WebElement pathsTab;
	
	@FindBy(xpath="//a[@data-testid='events-menu']")
	public WebElement eventsTab;	
	
	@FindBy(xpath="//a[@data-testid='peoples-menu']")
	public WebElement peopleTab;
	
	@FindBy(xpath="//a[@data-testid='insights-menu']")
	public WebElement insightsTab;
	
	public static WebElement element = null;
	public By byCoursesTab = By.xpath("//a[@data-testid='courses-menu']");
	
	//Actions
	
	public void clickHomeTab()
	{
		homeTab.click();
	}
	
	public void clickCoursesTab() throws InterruptedException
	{
		wbwait.until(ExpectedConditions.visibilityOfElementLocated(byCoursesTab));
		element=driver.findElement(byCoursesTab);
		element.click();
	}
	
	public void clickPathsTab()
	{
		pathsTab.click();
	}
	
	public void clickEventsTab()
	{
		eventsTab.click();
	}
	
	public void clickPeopleTab()
	{
		peopleTab.click();
	}
}
