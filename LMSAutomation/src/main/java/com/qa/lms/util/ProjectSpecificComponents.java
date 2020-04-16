package com.qa.lms.util;

import java.awt.AWTException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.Assert;

import com.qa.lms.base.BaseClass;
import com.qa.lms.pages.CoursesPage;
import com.qa.lms.pages.HomePage;
import com.qa.lms.pages.LoginPage;

public class ProjectSpecificComponents extends BaseClass
{

	/*//LoginPage objLoginPage;
	HomePage  objHomePage;
	CoursesPage objCoursesPage;*/
	
	
	
public void createAICCCourseAndTakeCourse() throws InterruptedException, IOException, AWTException
{
	JSONObject joTestData = JSONComponent.GetData("Verify_user_is_able_to_login");
	//String email= (String) joTestData.get("email");
	LoginPage objLoginPage = new LoginPage();
	HomePage  objHomePage = new HomePage();
	CoursesPage objCoursesPage = new CoursesPage();
	objLoginPage.sendWorkEmail(joTestData.get("email").toString());
	objLoginPage.sendPassword(prop.getProperty("password"));
	objLoginPage.clickSignInButton();
	objHomePage.clickCoursesTab();
	objCoursesPage.clickCreateCoursesButton();
	objCoursesPage.clickUploadFileButton();
    objCoursesPage.clickChooseFileButton(joTestData.get("filepath").toString());
    objCoursesPage.sendCourseTitle(joTestData.get("cname").toString());
    objCoursesPage.clickCategoryButton();
    objCoursesPage.clickSaveContinueButton();
    objCoursesPage.sendDescription(joTestData.get("cdesc").toString());
    objCoursesPage.clickSaveButton();
    objCoursesPage.clickStartAddQns();
    objCoursesPage.selectSingleQns();
    objCoursesPage.sendQuestion(joTestData.get("cQuestion").toString());
    objCoursesPage.sendAnswers(joTestData.get("Option1").toString(), joTestData.get("Option2").toString(), joTestData.get("Option3").toString());
    objCoursesPage.selectAnswer();
    objCoursesPage.clickShuffleResponseCheckbox();
    objCoursesPage.clickSaveQuestionButton();
    objCoursesPage.clickContinueButton();
    objCoursesPage.clickCreateCertificateButton();
    objCoursesPage.sendAuthJobTitle(joTestData.get("AuthJobTitle").toString());
    objCoursesPage.clickCreateCertificateButton();
    Assert.assertEquals(objCoursesPage.getPublishTitle(), joTestData.get("status").toString());
    objCoursesPage.clickStartAddingPeopleButton();
    objCoursesPage.sendPeopleEmail(joTestData.get("email").toString());
    objCoursesPage.clickSelectButton();
    objCoursesPage.clickInviteButton();
    objCoursesPage.clickSetCourseSettingsButton();
    objCoursesPage.clickSaveAndExitButton();
    objCoursesPage.switchToLearnersViewButton();
    objCoursesPage.clickAssignedCoursesLink();
    objCoursesPage.clickAICCCourse();
    objCoursesPage.clickEnrollButton();
    objCoursesPage.clickLaunchCourseButton();
    objCoursesPage.clickStartCourseButton();
    objCoursesPage.clickLessonButton();
    objCoursesPage.clickStartQuizButton();
    objCoursesPage.clickAnswer1();
    objCoursesPage.clickSubmitButton();
    objCoursesPage.clickNextButton();
    objCoursesPage.clickAnswer2();
    objCoursesPage.clickSubmit2Button();
    objCoursesPage.clickResumeButton();
    objCoursesPage.clickTakeAssessmentButton();
    objCoursesPage.sendNativeAnswer1();
    objCoursesPage.clickNativeSubmitButton();
    objCoursesPage.clickCompleteAssessmentButton();
    Assert.assertEquals( objCoursesPage.getTestSuccessMessage(), joTestData.get("message").toString());
    if(objCoursesPage.isCertificatePresent() == true)
    {
    	SeleniumComponents.updateTestRailResultAsPass("196135");
    }
    
}
}
