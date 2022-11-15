package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.AllumniRegistrationPage;
import pages.AllumniTab;
import setup.Base;
import utils.Utility;

public class VerifyAllumniRegistrationPage extends Base {
	private WebDriver driver;
	private AllumniTab alt;
	private AllumniRegistrationPage arp;
	private Alert alert;
	private String testId;
	static ExtentTest test;  //add
	static ExtentHtmlReporter reporter; //add
	
	
	@BeforeTest
	@Parameters ("browser")
	
	public void openBrowser(String browserName)
	{
		reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html"); //add
		ExtentReports extend = new ExtentReports(); //add
		extend.attachReporter(reporter); //add
		
		if(browserName.equals("Chrome"))
		{
			driver = Base.openChromeBrowser();
		}
		
		if(browserName.equals("Firefox"))
		{
			driver = Base.openFirefoxBrowser();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
		
	@BeforeClass
	public void createPOMobjects()
	{
		alt = new AllumniTab(driver);
		arp = new AllumniRegistrationPage(driver);
	}
		
	@BeforeMethod
	
	public void launchURL()
	{
		driver.get("https://mvp.edu.in/");
		
	}
	
	
	@Test(priority=0)
	
	public void verifySendButtonFunctionality()
	{
		alt.clickOnAllumniTab();
		arp.sendkeysTofirstNameTextBox();
		arp.sendkeysToLastNameTextBox();
		arp.sendkeysToEmailTextBox();
		arp.sendkeysTomobileNoTextBox();
		arp.sendkeysToInstituteNameTextBox();
		arp.sendkeysToPassingYearTextBox();
		arp.sendkeysToCompanyNameTextBox();
		arp.sendkeysToQaulificationTextBox();
		arp.clickOnSendMsgButton();
		//System.out.println("hi");
		Alert alert = driver.switchTo().alert();
		String popupText = alert.getText();
		alert.accept();
		//String url = driver.getCurrentUrl();
		Assert.assertEquals(popupText, "Thank You! Your Response submitted successfully.");
		
	}
	
	@Test (priority=1)
	
	public void verifyResetButtonFunctionality()
	{
		alt.clickOnAllumniTab();
		arp.sendkeysTofirstNameTextBox();
		arp.sendkeysToLastNameTextBox();
		arp.sendkeysToEmailTextBox();
		arp.sendkeysTomobileNoTextBox();
		arp.sendkeysToInstituteNameTextBox();
		arp.sendkeysToPassingYearTextBox();
		arp.sendkeysToCompanyNameTextBox();
		arp.sendkeysToQaulificationTextBox();
		arp.clickOnResetButton();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://mvp.edu.in/alumni/");
	}
	

	@Test(priority=2)

	public void verifyMandatoryTextBoxFunctionality()
	{
		testId ="123";
		alt.clickOnAllumniTab();
		arp.sendkeysTofirstNameTextBox();
		arp.sendkeysToLastNameTextBox();
		arp.sendkeysToEmailTextBox();
		alert = driver.switchTo().alert();
		String popup = alert.getText();
		//NoAlertPresentException:--> no such alert
		Assert.assertEquals(popup, "Please fill out this field");
	
	}

	@Test(dependsOnMethods ="verifyMandatoryTextBoxFunctionality" )

	public void verifySendButtonFunctionality1()
	{
		alt.clickOnAllumniTab();
		arp.sendkeysTofirstNameTextBox();
		arp.sendkeysToLastNameTextBox();
		arp.sendkeysToEmailTextBox();
		arp.sendkeysTomobileNoTextBox();
		arp.sendkeysToInstituteNameTextBox();
		arp.sendkeysToPassingYearTextBox();
		arp.sendkeysToCompanyNameTextBox();
		arp.sendkeysToQaulificationTextBox();
		arp.clickOnSendMsgButton();
		System.out.println("hi");
		Alert alert = driver.switchTo().alert();
		String popupText = alert.getText();
		alert.accept();
		//String url = driver.getCurrentUrl();
		Assert.assertEquals(popupText, "Thank You! Your Response submitted successfully.");
		
	}

	
	
	@AfterMethod
	public void gotoToHomePage(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			//Utility.captureScreenshot(driver, testId);
			Utility.captureScreenshot(driver, result.getName());
		}
		alt.clickOnHomeTab();
	}
	
	@AfterClass
	public void clearObject()
	{
		alt= null;
		arp = null;
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver= null;
		System.gc();
	}
	
	

}
