package day6June2023;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
public static void main(String[] args) throws IOException, InterruptedException {
		test();
	}
	public static void test() throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000l);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000l);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	//	driver.findElement(By.name().click();
		Thread.sleep(3000l);
		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")).click();
		Thread.sleep(3000l);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(3000l);
		driver.findElement(By.xpath("//img[@class='employee-image']")).click();
		Runtime.getRuntime().exec("D:\\FileUploadScript.exe");
		Thread.sleep(2000l);
		driver.close();
	}

	

}
