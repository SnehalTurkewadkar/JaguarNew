import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		String url="https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		String destFile=System.getProperty("user.dir")+"/src/test/resources//ScreenShotpkg/facbookError_";
		File sourceFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		captureScreenshot(sourceFile,destFile);
		driver.quit();
		
		
	}

	private static void captureScreenshot(File sourceFile, String destFile) throws IOException {
		Date dt=new Date();
		destFile=destFile+dt.toString().replaceAll("", "_").replaceAll(":", "_")+".jpeg";
		System.out.println("destFile:"+destFile);
		FileUtils.copyFile(sourceFile,new File(destFile));
	}

}
