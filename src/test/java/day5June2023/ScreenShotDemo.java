package day5June2023;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShotDemo {

	public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	String url="https://www.letskodeit.com/practice";
	driver.get(url);
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)", "");
	
	String destFile=System.getProperty("user.dir")+"/src/test/resources//ScreenShotpkg/scriptError_";
	File sourceFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	captureScreenshot(sourceFile,destFile);
	driver.quit();
	
	}

	static void captureScreenshot(File sourceFile, String destFile) throws IOException 
	{
		Date dt=new Date();
		destFile=destFile+dt.toString().replaceAll("", "_").replaceAll(":", "_")+".jpeg";
		System.out.println("destFile:"+destFile);
		FileUtils.copyFile(sourceFile,new File(destFile));
		
		
		
	}

}
