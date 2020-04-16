package com.qa.lms.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass 
{
	
public static void main(String[] args) throws InterruptedException 
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://learn-staging.auzmor.com/login");
	driver.findElement(By.xpath("//input[@placeholder='Enter your email address / username']")).sendKeys("atctest@clrmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Enter your Password']")).sendKeys("Prod@123");
	driver.findElement(By.xpath("//button[@data-testid='login-submit-btn']")).click();
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-testid='courses-menu']")));
	driver.findElement(By.xpath("//a[@data-testid='courses-menu']")).click();
	Thread.sleep(5000);
	WebElement icon = driver.findElement(By.xpath("//div[@data-testid='icon']"));
	icon.click();
	WebElement s=driver.findElement(By.xpath("//input[@placeholder='Search for Courses']"));
	s.sendKeys("category");
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement e1=driver.findElement(By.xpath("//span[text()='category']"));
	//js.executeScript("arguments[0].scrollIntoView(true);", e1);

	//js.executeScript("arguments[0].scrollIntoView(true);", e1);
	Actions a =new Actions(driver);
	a.moveToElement(e1).click().build().perform();
	Thread.sleep(1000);
	WebElement e2=driver.findElement(By.xpath("//*[@id='Oval-2-Copy-2']"));
	a.moveToElement(e2).click().build().perform();
	s.clear();
	Thread.sleep(1000);
	s.sendKeys("public weblink");
	Thread.sleep(1000);
	js.executeScript("arguments[0].scrollIntoView(true);", icon);
	Thread.sleep(2000);
	WebElement s1=driver.findElement(By.xpath("//span[text()='public weblink']"));
	//js.executeScript("arguments[0].scrollIntoView(true);", s1);
	Thread.sleep(1000);
	System.out.println("test1");
	a.moveToElement(s1).click().build().perform();
	String sb=s1.getText();
	System.out.println(sb);
	Thread.sleep(2000);
	WebElement e3=driver.findElement(By.xpath("//*[@id='Oval-2-Copy-2']"));
	
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='circle' and @id='Oval-2-Copy']")));
	a.moveToElement(e3).click().build().perform();
	System.out.println("test2");
	//a.moveToElement(e2).click().build().perform();
	Thread.sleep(1000);
	s.clear();
	Thread.sleep(1000);
	s.sendKeys("dsdd");
	Thread.sleep(2000);
	WebElement s2=driver.findElement(By.xpath("//span[text()='dsdd']"));
	js.executeScript("arguments[0].scrollIntoView(true);", s2);
	Thread.sleep(1000);
	//WebElement e=driver.findElement(By.xpath("//*[@id='Oval-2-Copy-2']"));
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='circle' and @id='Oval-2-Copy']")));
	a.moveToElement(s2).click().build().perform();
	Thread.sleep(1000);
	WebElement e4=driver.findElement(By.xpath("//*[@id='Oval-2-Copy-2']"));
	Thread.sleep(2000);
	a.moveToElement(e4).click().build().perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//body/div[@id='root']/div/div/div/div/div/div[2]/div//*[local-name()='svg']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='atctest@clrmail.com']")).click();
	WebElement e5=driver.findElement(By.xpath("//span[text()='Select']"));
	a.moveToElement(e5).click().build().perform();
	driver.findElement(By.xpath("//span[text()='Invite!']")).click();
	driver.findElement(By.xpath("//span[text()='Continue']")).click();
	
	//Thread.sleep(2000);
	/*a.moveToElement(e2).click().build().perform();
	WebElement e3=driver.findElement(By.xpath("//span[text()='public weblink']"));
	js.executeScript("arguments[0].scrollIntoView(true);", e3);
	a.moveToElement(e3).click().build().perform();
	a.moveToElement(e2).click().build().perform(); */
	
	
	
	//js.executeScript("arguments[0].click();", e1);
	//Thread.sleep(1000);
	//e1.click();
	
	
	
	
	
	
	
    
	/*Thread.sleep(1000);
	a.moveToElement(e2).build().perform();
	Thread.sleep(1000);
	e2.click(); */
	
	
	
	
	
	

	/*driver.findElement(By.xpath("//a[@data-testid='paths-menu']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@data-testid='events-menu']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@data-testid='peoples-menu']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@data-testid='insights-menu']")).click(); */
	
	
}
}
