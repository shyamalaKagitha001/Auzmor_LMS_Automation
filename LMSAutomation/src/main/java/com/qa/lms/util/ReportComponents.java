package com.qa.lms.util;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportComponents {

	public ExtentHtmlReporter extReporter;
	public ExtentReports extReport;
	public ExtentTest extTest;

	public ReportComponents()
	{
	extReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "\\ExtentReportServiceDesktop.html");
	extReport = new ExtentReports();
	extReporter.config().setChartVisibilityOnOpen(true);
	extReporter.config().setDocumentTitle("LMS Testing Report");
	extReporter.config().setReportName("Sanity Automation Report");
	extReporter.config().setTheme(Theme.DARK);
	extReporter.setAppendExisting(true);
	extReport.attachReporter(extReporter);
	}

	public void LogResults(String strTestName, Integer intStatusCode, Throwable thrMessage)
	{
	extTest = extReport.createTest(strTestName);
	switch(intStatusCode)
	{
	case 2:
	extTest.log(Status.FAIL, strTestName);
	extTest.log(Status.FAIL, thrMessage);
	break;
	case 1:
	extTest.log(Status.PASS, strTestName);
	break;
	default:
	extTest.log(Status.SKIP, strTestName);
	}
	extReport.flush();
	}

	}

