package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {
	WebDriver driver;

	@BeforeSuite
	public void setUp() {
		System.out.println("Set System Property from Chrome");
	}

	@BeforeTest(dependsOnMethods= {"setUp"})
	public void launchBrowser() {
		System.out.println("launch chrome Browser");
	}

	@BeforeClass
	public void login() {
		System.out.println("Login");
	}

	@BeforeMethod
	public void enterURL() {
		System.out.println("Enter URL");
	}

	@Test(priority = 2)
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}

	@Test(priority = 1)
	public void logoTest() {
		System.setProperty("webdriver.chrome.driver", "H:\\New SoftWare\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.switchTo().frame("callout");
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();

		String logo = driver.findElement(By.xpath("//img[@alt='Google']")).getText();
		System.out.println(logo);

	}

	@AfterMethod
	public void logout() {
		System.out.println("Logout From Application");
	}

	@AfterTest
	public void deletedAllCookies() {
		System.out.println("Delete All Cookies");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}

	@AfterSuite
	public void generateTestReport() {
		System.out.println("Generate Test Report");
	}

}
