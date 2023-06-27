package day25May2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramDemo {

	public static void main(String[] args) {
		String url = "https://www.instagram.com/";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.findElement(By.xpath("//span[@class='_aacl _aaco _aacw _aad0 _aad7']")).click();
		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("8485061759");
		driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys("Snehal patil");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("snehallaptop");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("snehal@123");
		driver.findElement(By.xpath("//div[7]/div")).click();	
		
	}
}
		
		
		
	   

