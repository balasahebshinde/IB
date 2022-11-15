package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

	public class Utility {
	
	public static void captureScreenshot(WebDriver driver, String screenshotName)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH.mm.ss");
		Date date = new Date();
		String d = formatter.format(date);
	try
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String path = "F:\\VELOCITY\\Automation Testing\\screenshot\\"+screenshotName+d+".jpeg";
		FileHandler.copy(source,new File(path));
		System.out.println("Screenshot taken");
	}
	catch(Exception e)
	{
		System.out.println("Exception while taking screenshot"+e.getMessage());
	}

}
	
	public static void getDataFromExcel()
	{
	
	}
}