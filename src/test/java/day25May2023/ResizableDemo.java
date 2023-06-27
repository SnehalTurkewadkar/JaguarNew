package day25May2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableDemo {

	public static void main(String[] args) {
		String url="https://jqueryui.com";
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on resizable link
	
		driver.findElement(By.xpath("(//div[@id='content']/following-sibling::div//ul/li[3]/a)")).click();
		String expUrl="https://jqueryui.com/resizable/";
		String actUrl=driver.getCurrentUrl();
		if(expUrl.equals(actUrl))
			System.out.println("Test step passed");
			else
				System.out.println("Test step failed");
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,300);","");
		 
		 Actions actions =new Actions(driver);
		 driver.switchTo().frame(0);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement resizable= driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		 actions.clickAndHold(resizable).moveByOffset(100, 100).release().build().perform();
		 
		// actions.clickAndHold(resizable).moveByOffset(100, 0).release().build().perform();
		
	}
}
