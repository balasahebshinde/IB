package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllumniRegistrationPage {
	
	@FindBy (xpath ="//input[@id='form_name']")
	private WebElement fName ; 
	
	@FindBy (xpath ="//input[@id='form_lastname']")
	private WebElement lName ;
	
	@FindBy (xpath ="//input[@id='form_email']")
	private WebElement emailid ;
	
	@FindBy (xpath ="//input[@id='form_phone']")
	private WebElement mobNo ;
	
	@FindBy (xpath ="//input[@id='form_Institute']")
	private WebElement collegeName ;
	
	@FindBy (xpath ="//input[@id='form_Passing']")
	private WebElement passYear ;
	
	@FindBy (xpath ="(//input[@id='form_Company'])[1]")
	private WebElement  companyName;
	
	@FindBy (xpath ="(//input[@id='form_Company'])[2]")
	private WebElement qaulification ;
	
	@FindBy (xpath ="//input[@type='reset']")
	private WebElement resetButton ;
	
	@FindBy (xpath ="//input[@type='submit']")
	private WebElement sendMsgButton ;
	
	/*@FindBy (xpath ="//a[text()='Alumini']")
	private WebElement  ;
	
	@FindBy (xpath ="//a[text()='Alumini']")
	private WebElement  ;
	
	@FindBy (xpath ="//a[text()='Alumini']")
	private WebElement  ;
	
	@FindBy (xpath ="//a[text()='Alumini']")
	private WebElement  ;
	
	@FindBy (xpath ="//a[text()='Alumini']")
	private WebElement  ;
	*/

	public AllumniRegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendkeysTofirstNameTextBox()
	{
		fName.sendKeys("Swapy");
	}
	
	public void sendkeysToLastNameTextBox()
	{
		lName.sendKeys("Patil");
	}
	
	public void sendkeysToEmailTextBox()
	{
		emailid.sendKeys("swapy12@gmail.com");
	}
	
	public void sendkeysTomobileNoTextBox()
	{
		mobNo.sendKeys("8800000000");
	}
	
	public void sendkeysToInstituteNameTextBox()
	{
		collegeName.sendKeys("Bytco college");
	}
	
	public void sendkeysToPassingYearTextBox()
	{
		passYear.sendKeys("2013");
	}
	
	public void sendkeysToCompanyNameTextBox()
	{
		companyName.sendKeys("MJsco");
	}
	
	public void sendkeysToQaulificationTextBox()
	{
		qaulification.sendKeys("Bsc.computer science");
	}
	
	public void clickOnResetButton()
	{
		resetButton.click();
	}
	
	public void clickOnSendMsgButton()
	{
		sendMsgButton.click();
	}

}
