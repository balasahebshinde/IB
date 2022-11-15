
package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "H:\\New SoftWare\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(29));
		driver.get("https://google.com");
	}

	@Test(priority = 1)
	public void googleTitleTest() {
	System.out.println("Google Title Test");
	}

	@Test(priority = 3,dependsOnMethods="googleTitleTest")
	public void logoTest() {
		boolean logo = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		System.out.println(logo);
		System.out.println(github);
	}

	@Test(priority = 2)
	public void mailLinkTest() {
		driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
