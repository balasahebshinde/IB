package testNg;

import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Demo_Testng {
	@BeforeSuite
	public void dataBase() {
		Reporter.log("DataBase",true);
		
		
	}
	@BeforeTest
	public void browserLaunch() {
		Reporter.log("browser open",true);
		
	}

}
