package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringTextDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		WebElement textbox=driver.findElement(By.xpath("//input[@placeholder='Start Typing...']"));
		textbox.sendKeys("snehal,Aviraj");
		Thread.sleep(2000l);
		textbox.clear();
		Thread.sleep(2000l);
		textbox.sendKeys("Rahul,Ravi,manish");
		driver.quit();

	}

}
