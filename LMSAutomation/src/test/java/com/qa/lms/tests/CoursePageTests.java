package com.qa.lms.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.lms.base.BaseClass;
import com.qa.lms.util.ProjectSpecificComponents;
import com.qa.lms.util.ReportComponents;
import com.qa.lms.util.SeleniumComponents;
import com.qa.lms.util.TestUtil;

public class  CoursePageTests extends BaseClass
{
  
	public CoursePageTests()
	{
		super();
	}
	/*LoginPage objLoginPage;
	HomePage objHomePage;
	CoursesPage objCoursesPage;*/
	ProjectSpecificComponents objProjectSpecific  = new ProjectSpecificComponents();	
	public ReportComponents erReport;

	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	/*	objLoginPage = new LoginPage();
		objHomePage = new HomePage();
		objCoursesPage = new CoursesPage();
		objProjectSpecific = new ProjectSpecificComponents();*/
		erReport = new ReportComponents();
	}
	
	@Test 
    public void create_AICC_Course_and_take_as_a_learner() throws IOException 
	{
		try
		{
			objProjectSpecific.createAICCCourseAndTakeCourse();
			SeleniumComponents.updateTestRailResultAsPass("196135");
		}
		
		catch(Exception e )
		{
			TestUtil.takeScreenshotAtEndOfTest();
			SeleniumComponents.updateTestRailResultAsFail("196135");
			Assert.fail(e.getMessage());
			driver.quit();
			
		}
		
	}	
	
	@Test 
	public void f()
	{
		System.out.println("Success");
	}
	
	
	
	@AfterMethod
	public void LogResults (ITestResult itrResult)
	{
		erReport.LogResults(this.getClass().getName().substring(17)+">"+itrResult,itrResult.getStatus(),itrResult.getThrowable());
		
	}
	
	
	
	
}
