package com.qa.lms.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.lms.base.BaseClass;
import com.qa.lms.util.SeleniumComponents;

public class CoursesPage extends BaseClass
{
Actions a =new Actions(driver);
WebDriverWait wbwait = new WebDriverWait(driver,480);
JavascriptExecutor js = (JavascriptExecutor) driver;

@FindBy(xpath="//button[@data-testid='create-course']")
public WebElement createCourseButton;

@FindBy(xpath="//body/div/div/div/div[2]/div[1]/div[1]/span[1]")
public WebElement hoverAICCSCORM;

@FindBy(xpath="//button[@data-testid='course-by-upload']")
public WebElement uploadFileButton;

@FindBy(xpath="//button[@data-testid='course-title']")
public WebElement courseTitleTextBox;

@FindBy(xpath="//div[@data-testid='app-dropdown']")
public WebElement questionDropdown;

@FindBy(xpath="//span[text()='Single Choice']")
public WebElement singleChoice;


public static WebElement element;
public By byCreateCourseButton = By.xpath("//button[@data-testid='create-course']");
public By byHoverAICCSCORM = By.xpath("//body/div/div/div/div[2]/div[1]/div[1]/span[1]");
public By byUploadFileButton = By.xpath("//button[@data-testid='course-by-upload']");
public By byChooseFileButton = By.xpath("//button[@data-testid='normal-btn']");
public By byCourseTitleTextbox = By.xpath("//input[@placeholder='Enter title']");
public By byCategoryButton = By.xpath("//button[@data-testid='category-157']");
public By bySaveContinueButton = By.xpath("//button[@data-testid='save-detail-btn']");
public By byDescriptionTextbox = By.xpath("(//span[text()='Description'])[1]");
public By bySaveButton = By.xpath("//button[@data-testid='save-description']");
public By byStartAddQns = By.xpath("//button[@data-testid='add-assesment']");
public By byQuestionDropdown = By.xpath("//div[@data-testid='app-dropdown']");
public By byQuestionTextbox = By.xpath("//input[@placeholder='Enter your question here']");
public By byOption1Textbox = By.xpath("//input[@placeholder='Option 1']");
public By byOption2Textbox = By.xpath("//input[@placeholder='Option 2']");
public By byOption3Textbox = By.xpath("//input[@placeholder='Option 3']");
public By byAnswerRadioButton = By.xpath("//body//div[@id='root']//div//div//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[1]//div[1]");
public By byShuffleResponseCheckbox = By.xpath("(//div[@data-testid='checkbox'])[1]");
public By bySaveQuestionButton = By.xpath("//span[text()='Save Question']");
public By byContinueButton = By.xpath("//button[@data-testid='normal-btn']");
public By byCreateCertificateButton = By.xpath("//span[text()='Create Certificate']");
public By byAuthJobTitleTextbox = By.xpath("//input[@placeholder='Authority Job Title']");
public By byPublishedMessage = By.xpath("//span[text()='Published!']");
public By byStartAddingPeople = By.xpath("//span[text()='Start Adding People']");
public By bySearchPeople = By.xpath("//input[@placeholder='Search People...']");
public By byemail = By.xpath("//body/div/div/div/div/div/div/div/div[1]/div[1]/div[1]/div[1]/span[1]");
public By bySelectButton = By.xpath("//span[text()='Select']");
public By byInviteButton = By.xpath("//span[text()='Invite!']");
public By bySetCourseSettingsButton = By.xpath("//span[text()='Set Course Settings']");
public By bySaveAndExitButton = By.xpath("(//span[text()='Save and Exit'])[2]");
public By byLearnersViewButton = By.xpath("//span[text()='Learners View']");
public By byUserIcon = By.xpath("//body/div[@id='root']/div/div/div/div/div/div/div/div/div/span/span[1]");
public By bySwitchToLearnersView = By.xpath("//span[text()='Switch to Learner's View']");
public By byAssignedCoursesLink = By.xpath("//div[@name='CoursesCreatedForYou']//section//div//div//div//div//div//span[contains(text(),'Assigned')]");
public By byAICCCourse = By.xpath("//span[text()='AICC course']");
public By byEnrollButton = By.xpath("//span[text()='Enroll']");
public By byLaunchCourseButton = By.xpath("//span[contains(text(),'Launch Course')]");
public By byStartCourseButton = By.xpath("//a[contains(text(),'START COURSE')]");
public By byLessonButton = By.xpath("(//div[@class='lesson-link__name brand--ui'])[2]");
public By byStartQuizButton = By.xpath("//span[contains(text(),'START QUIZ')]");
public By byInternalAnswer1 = By.xpath("//p[text()='sea']");
public By byInternalSubmitButton = By.xpath("(//button[text()='SUBMIT'])[1]");
public By byNextButton = By.xpath("(//button[text()='NEXT'])[1]");
public By byInternalAnswer2 = By.xpath("//p[text()='Marina']");
public By byInternalSubmit2Button = By.xpath("(//button[text()='SUBMIT'])[2]");
public By byResumeCourseButton=By.xpath("//span[text()='Resume Course']");
public By byTakeAssessmentsButton=By.xpath("//span[text()='Take Assessments']");
public By byNativeAnswer1=By.xpath("(//div[@class='ui fitted radio checkbox sc-LAuEU fMyOLT'])[1]");
public By byNativeSubmitButton=By.xpath("//span[text()='Submit']");
public By byCompleteAssessmentButton=By.xpath("(//span[text()='Complete Assessment'])[2]");
public By byTestSucessMessage=By.xpath("//span[text()='Wow, you aced the test!']");
public By byCertificate=By.xpath("//div[@class='sc-igwadP lhBBE']");

//Actions

public void clickCreateCoursesButton() throws InterruptedException
{
	wbwait.until(ExpectedConditions.visibilityOfElementLocated(byCreateCourseButton));
	element=driver.findElement(byCreateCourseButton);
	element.click();
}

public void clickUploadFileButton() throws InterruptedException
{
    Thread.sleep(1000);
	element=driver.findElement(byHoverAICCSCORM);
	element.click();
	Thread.sleep(1000);
	element=driver.findElement(byUploadFileButton);
    element.click();
}

public void clickChooseFileButton(String strFileUpload) throws InterruptedException, IOException, AWTException
{
	Thread.sleep(4000);
	element=driver.findElement(byChooseFileButton);
	element.click();
	Thread.sleep(1000);
	StringSelection sel = new StringSelection(strFileUpload);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
	Robot robot = new Robot();
	Thread.sleep(1000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	Thread.sleep(1000); 
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	/*SeleniumComponents.fileUpload(strFileUpload);
	Runtime.getRuntime().exec("‪C:\\Users\\Deepak\\Documents\\AICCFileUpload.exe");*/
}


public void sendCourseTitle(String strCourseTitle) throws InterruptedException
{
	wbwait.until(ExpectedConditions.visibilityOfElementLocated(byCourseTitleTextbox));
	Thread.sleep(1000);
	element=driver.findElement(byCourseTitleTextbox);
	element.click();
	element.sendKeys(Keys.CONTROL+"a",Keys.DELETE);
	Thread.sleep(1000);
	element.sendKeys(strCourseTitle);
}

public void clickCategoryButton() throws InterruptedException
{
	Thread.sleep(1000);
	element=driver.findElement(byCategoryButton);
	element.click();
}

public void clickSaveContinueButton() throws InterruptedException
{
	Thread.sleep(1000);
	element=driver.findElement(bySaveContinueButton);
	element.click();
}

public void sendDescription(String strCourseDescription) throws InterruptedException
{
	Thread.sleep(4000);
	element=driver.findElement(byDescriptionTextbox);
	element.click();
	element.sendKeys(Keys.CONTROL+"a",Keys.DELETE);
	Thread.sleep(1000);
	element.sendKeys(strCourseDescription);
}


public void clickSaveButton() throws InterruptedException
{
	Thread.sleep(1000);
	element=driver.findElement(bySaveButton);
	element.click();
}

public void clickStartAddQns() throws InterruptedException
{
	Thread.sleep(4000);
	element=driver.findElement(byStartAddQns);
	element.click();
	Thread.sleep(2000);
}

public void selectSingleQns() throws InterruptedException
{
	Thread.sleep(2000);
	/*Actions a =new Actions(driver);
	a.moveToElement(questionDropdown).click().build().perform();*/
	Thread.sleep(2000);
	/*a.moveToElement(singleChoice).click().build().perform();*/
	element=driver.findElement(byQuestionDropdown);
	element.click();
	Thread.sleep(2000);
	element.sendKeys(Keys.ENTER,Keys.TAB);
}

public void sendQuestion(String strQuestion) throws InterruptedException
{
	Thread.sleep(4000);
	element=driver.findElement(byQuestionTextbox);
	element.click();
	element.sendKeys(strQuestion);
}

public void sendAnswers(String strQ1, String strQ2, String strQ3) throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byOption1Textbox);
	element.click();
	element.sendKeys(strQ1);
	Thread.sleep(2000);
	element=driver.findElement(byOption2Textbox);
	element.click();
	element.sendKeys(strQ2);
	Thread.sleep(2000);
	element=driver.findElement(byOption3Textbox);
	element.click();
	element.sendKeys(strQ3);		
}

public void selectAnswer() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byOption1Textbox);
	element.click();
	Thread.sleep(4000);
	element=driver.findElement(byAnswerRadioButton);
	element.click();
}

public void clickShuffleResponseCheckbox() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byShuffleResponseCheckbox);
	element.click();
}

public void clickSaveQuestionButton() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(bySaveQuestionButton);
	element.click();
}

public void clickContinueButton() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byContinueButton);
	element.click();
}

public void clickCreateCertificateButton() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byCreateCertificateButton);
	element.click();
}

public void sendAuthJobTitle(String strAuthJobTitle) throws InterruptedException
{
	Thread.sleep(4000);
	element=driver.findElement(byAuthJobTitleTextbox);
	element.click();
	element.sendKeys(strAuthJobTitle);
}

public String getPublishTitle() throws InterruptedException
{
	Thread.sleep(4000);
	element=driver.findElement(byPublishedMessage);
	return element.getText();
}

public void clickStartAddingPeopleButton() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byStartAddingPeople);
	element.click();
}

public void sendPeopleEmail(String strPeopleEmail) throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(bySearchPeople);
	element.click();
	element.sendKeys(strPeopleEmail);
}

public void clickSelectButton() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byemail);
	element.click();
	Thread.sleep(2000);
	element=driver.findElement(bySelectButton);
	element.click();
}

public void clickInviteButton() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byInviteButton);
	element.click();
}

public void clickSetCourseSettingsButton() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(bySetCourseSettingsButton);
	element.click();
}

public void clickSaveAndExitButton() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(bySaveAndExitButton);
	element.click();
}

public void clickLearnersViewButton() throws InterruptedException
{
	Thread.sleep(6000);
	element=driver.findElement(byLearnersViewButton);
	element.click();
}

public void clickUserIcon() throws InterruptedException
{
	Thread.sleep(6000);
	element=driver.findElement(byUserIcon);
	element.click();
}

public void clickSwitchToLearnersView() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(bySwitchToLearnersView);
	element.click();
}

public void clickAssignedCoursesLink() throws InterruptedException
{
	Thread.sleep(6000);
	element=driver.findElement(byAssignedCoursesLink);
	element.click();
}

public void clickAICCCourse() throws InterruptedException
{
	Thread.sleep(4000);
	element=driver.findElement(byAICCCourse);
	element.click();
}

public void clickEnrollButton() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byEnrollButton);
	element.click();
}

public void clickLaunchCourseButton() throws InterruptedException
{
	Thread.sleep(4000);
	element=driver.findElement(byLaunchCourseButton);
	element.click();
}

public void clickStartCourseButton() throws InterruptedException
{
	//wbwait.until(ExpectedConditions.visibilityOfElementLocated(byStartCourseButton));
	Thread.sleep(14000);
	driver.switchTo().frame("scormLoaderFrame");
	Thread.sleep(2000);
	driver.switchTo().frame("ALScormContent");
	Thread.sleep(2000);
	driver.switchTo().frame("content-frame");
	Thread.sleep(2000);
	element=driver.findElement(byStartCourseButton);
	element.click();
	js.executeScript("window.scrollBy(0,2000)");
}

public void clickLessonButton() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byLessonButton);
	element.click();	
}

public void clickStartQuizButton() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byStartQuizButton);
	element.click();	
}

public void clickAnswer1() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byInternalAnswer1);
	element.click();
	
}

public void clickSubmitButton() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byInternalSubmitButton);
	element.click();
	
}

public void clickNextButton() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byNextButton);
	element.click();	
}

public void clickAnswer2() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byInternalAnswer2);
	element.click();	
}

public void clickSubmit2Button() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byInternalSubmit2Button);
	element.click();	
}

public void switchToLearnersViewButton() throws InterruptedException
{
	Thread.sleep(2000);
	driver.get(prop.getProperty("learnerurl"));	
}

public void clickResumeButton() throws InterruptedException
{
	Thread.sleep(4000);
	element=driver.findElement(byResumeCourseButton);
	element.click();	
}

public void clickTakeAssessmentButton() throws InterruptedException
{
	Thread.sleep(4000);
	element=driver.findElement(byTakeAssessmentsButton);
	element.click();	
}

public void sendNativeAnswer1() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byNativeAnswer1);
	element.click();	
}

public void clickNativeSubmitButton() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byNativeSubmitButton);
	element.click();	
}

public void clickCompleteAssessmentButton() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byCompleteAssessmentButton);
	element.click();	
}

public String getTestSuccessMessage() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byTestSucessMessage);
	return element.getText();
}

public boolean isCertificatePresent() throws InterruptedException
{
	Thread.sleep(2000);
	element=driver.findElement(byCertificate);
	return element.isDisplayed();
}

}
