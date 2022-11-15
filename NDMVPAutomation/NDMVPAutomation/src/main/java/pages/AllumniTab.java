package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllumniTab {
	
	@FindBy (xpath ="//a[text()='Alumini']")
	private WebElement allumniTab ; 
	
	@FindBy (xpath ="//a[text()='Home']")
	private WebElement HomeTab ; 

	public AllumniTab(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAllumniTab()
	{
		allumniTab.click();
	}
	public void clickOnHomeTab()
	{
		HomeTab.click();
	}
	
}
