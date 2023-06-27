package day31May2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000l);
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("demo");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000l);
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();

		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		
		driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		
		
		

	}

}
