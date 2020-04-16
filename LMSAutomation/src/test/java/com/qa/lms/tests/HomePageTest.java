package com.qa.lms.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.lms.base.BaseClass;
import com.qa.lms.pages.HomePage;


public class HomePageTest extends BaseClass
{
 
	HomePage homePage;
	
	public  HomePageTest() 
	{
		super();

	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		homePage = new HomePage();	
	}
	
  @Test
  public void f()

  {
	  
	homePage.coursesTab.click();  
	  
  }
  
  
}
