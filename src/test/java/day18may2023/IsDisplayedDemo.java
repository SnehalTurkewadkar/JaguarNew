package day18may2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedDemo {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement element =driver.findElement(By.id("displayed-text"));
		element.clear();
		element.sendKeys("Snehal");
		boolean res=element.isDisplayed();
		System.out.println("res:"+res);// true;
		Thread.sleep(3000l);
		
		driver.findElement(By.id("hide-textbox")).click();
		res=element.isDisplayed();
		System.out.println("res:"+res);// true;
		Thread.sleep(3000l);
		
		driver.findElement(By.id("show-textbox")).click();
		res=element.isDisplayed();
		System.out.println("res:"+res);// true;
		Thread.sleep(3000l);
		element.clear();
		element.click();
		Thread.sleep(3000l);
		driver.quit();

	}

}
