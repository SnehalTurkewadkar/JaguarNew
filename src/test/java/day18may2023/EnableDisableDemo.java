package day18may2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisableDemo {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement element =driver.findElement(By.id("enabled-example-input"));
		element.clear();
		element.sendKeys("Snehal");
		boolean res=element.isEnabled();
		System.out.println("res:"+res);// true;
		Thread.sleep(3000l);
		
		WebElement btnDisable =driver.findElement(By.id("disabled-button"));
		btnDisable.click();
		 res=element.isEnabled();
		System.out.println("res:"+res);// false
		Thread.sleep(3000l);
		
		WebElement btnEnable =driver.findElement(By.id("enabled-button"));
		btnEnable.click();
		 res=element.isEnabled();
		 element.click();
		System.out.println("res:"+res);// true
		Thread.sleep(3000l);
		element.clear();
		Thread.sleep(3000l);
		driver.quit();

		
	}

}
