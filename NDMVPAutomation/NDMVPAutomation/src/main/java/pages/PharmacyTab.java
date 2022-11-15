package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PharmacyTab {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium Library\\chromedriver_win32 (2)\\chromedriver.exe");		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://mvp.edu.in/ips/");
	Actions act = new Actions(driver);
	WebElement courses = driver.findElement(By.xpath("//a[text()='Courses']"));
	act.moveToElement(courses).click().build().perform();
	
	
	
	}
}
