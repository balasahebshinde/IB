package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "H:\\New SoftWare\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	@Test(priority = 1)
	public void checkMail() {
		String target = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).getText();
		//Actions act = new Actions(driver);
	//	act.moveToElement(target).click().perform();
		System.out.println(target);
		
	}

	@Test()
	public void aiframeHandle() {
		driver.switchTo().frame("callout");
		String print = driver.findElement(By.xpath("//button[contains(text(),'No thanks')]")).getText();
		System.out.println(print);
	}

	@Test()
	public void serachTest() {
		driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("htmlunit gradle", Keys.ENTER);
	}

	@AfterMethod
	public void tearDown() {
		//driver.close();
		System.out.println("Methods Run SucessFully");
	}

}
