package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBDemo {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement emailText=driver.findElement(By.name("email"));
		emailText.clear();
		emailText.sendKeys("Snehal.turkewadkar26@gmail.com");
		WebElement passText=driver.findElement(By.name("pass"));
		passText.clear();
		passText.sendKeys("abc123");
		WebElement loginBtn=driver.findElement(By.xpath("login"));
		loginBtn.click();

	}

}
