package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo3 {
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Setup");
	}
	
	@Test(priority=3)
	public void c()
	{
		System.out.println("priority 1");
	}
	@Test(priority=1)
	public void z()
	{
		System.out.println("NO priority");
	}
	@Test(priority=2)
	public void a() {
		System.out.println("Method A");
	}
	@AfterMethod()
	public void tearDown()
	{
		System.out.println("Closed");
	}

}
