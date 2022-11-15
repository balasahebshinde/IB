package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import okio.Timeout;

public class ProfessionalColleges {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Library\\chromedriver_win32 (2)\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mvp.edu.in/");
		Actions act = new Actions(driver);
	
		WebElement pc = driver.findElement(By.xpath("//a[text()='Professional Colleges']"));
		act.moveToElement(pc).perform();
		
		//WebElement lawCollege = driver.findElement(By.xpath("//a[text()='Law College']"));
		//act.moveToElement(lawCollege).click().build().perform();

		//WebElement collegeOfPharm = driver.findElement(By.xpath("//a[text()='College of Pharmacy']"));
		//act.moveToElement(collegeOfPharm).click().build().perform();
		//explicitly wait-->applicable to individual element
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		//WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement courses = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='dropdown open']")));
		
		WebElement pharmCollege = driver.findElement(By.xpath("//a[text()='INSTITUTE OF PHARMACEUTICAL SCIENCES']"));
		
		act.moveToElement(pharmCollege).click().build().perform();
		//courses.click();
		
		
		
		//act.moveToElement(dept).perform();
		 driver.findElement(By.xpath("//a[text()='Courses']")).click();
		//act.moveToElement(courses).click().build().perform();
		driver.close();
		
		
		
	}

}
