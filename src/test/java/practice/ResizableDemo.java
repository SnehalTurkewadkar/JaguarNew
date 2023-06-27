package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.linkText("Resizable")).click();
		String expUrl="https://jqueryui.com/resizable/";
		String actUrl=driver.getCurrentUrl();
		if(expUrl.equals(actUrl))
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		JavascriptExecutor js= ( JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300);", "");
		
		Actions action=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement resizable=driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
         action.clickAndHold(resizable).moveByOffset(100, 100).release().build().perform();
		
//		actions.clickAndHold(resizable).moveByOffset(200, 0).release().build().perform();
		
}

}
