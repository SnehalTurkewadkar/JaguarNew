package day24May2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlinkElementDemo {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();
		JavascriptExecutor js=(JavascriptExecutor ) driver;
		Thread.sleep(5000l);
		WebElement txtFirstName=driver.findElement(By.name("firstname"));
		js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 15px solid blue;');",txtFirstName);
		txtFirstName.sendKeys("Snehal");
		Thread.sleep(4000l);
		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid grey;');",txtFirstName);
		
		WebElement txtLastName=driver.findElement(By.name("lastname"));
		js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 5px dashed red;');",txtLastName);
		txtLastName.sendKeys("Turkewadkar");
		Thread.sleep(4000l);
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 1px solid grey;');",txtLastName);
		
		WebElement txtEmail=driver.findElement(By.name("reg_email__"));
		js.executeScript("arguments[0].setAttribute('style', 'background: pink; border: 5px solid red;');",txtEmail);
		txtEmail.sendKeys("snehal@26497");
		Thread.sleep(4000l);
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 1px solid grey;');",txtEmail);
		
		String val=driver.findElement(By.name("firstname")).getAttribute("value");
		System.out.println("value:"+val);
		
		String txt= driver.findElement(By.name("firstname")).getText();
		System.out.println("txt:"+txt);
		
		System.out.println(txtFirstName.getCssValue("background-color"));
		System.out.println(txtLastName.getCssValue("background-color"));
		System.out.println(txtEmail.getCssValue("background-color"));
		
		
		
	}

}
