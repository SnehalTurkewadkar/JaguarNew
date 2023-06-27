package day24May2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Thread.sleep(3000l);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000);", ",");
		Thread.sleep(4000l);
		
		js.executeScript("window.scrollBy(0,-2000);", ",");
		Thread.sleep(4000l);
		
		// sendkeys/entering text into text field using javascripexecutor
		
		WebElement txtSearch=driver.findElement(By.name("s"));
		js.executeScript("arguments[0].value='snehal rajsi';", txtSearch);
		//js.executeScript("arguments[0].value='Tarun Heetarth';", txtSearch);
		WebElement lnkAbout=driver.findElement(By.xpath("//a[@href='https://jqueryui.com/about/']"));
		js.executeScript("arguments[0].click();", lnkAbout);
		
		String actHdr = driver.findElement(By.xpath("//h1[contains(text(),'About jQuery UI')]")).getText();
		String expHdr = "About jQuery UI";
		
		if(expHdr.equals(actHdr))
			System.out.println("Test case is pass");
		else
			System.out.println("Test case is fail");
		
		driver.navigate().back();
		 WebElement linkTwitter =driver.findElement(By.linkText("Twitter"));
			js.executeScript("arguments[0].click();", linkTwitter);
				
	}
}
