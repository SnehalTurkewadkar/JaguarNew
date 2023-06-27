package day18may2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovorDemo {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement btnMouseHover =driver.findElement(By.id("mousehover"));
		Actions action =new Actions(driver);
		action.moveToElement(btnMouseHover).perform();
		driver.findElement(By.xpath("//a[@href='#top']")).click();
		Thread.sleep(5000l);
		
		action.moveToElement(btnMouseHover).perform();
		driver.findElement(By.xpath("//div[@class='mouse-hover-content']/a[2]']")).click();
		Thread.sleep(3000l);
		
		
		

	}

}
