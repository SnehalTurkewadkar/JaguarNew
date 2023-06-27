package day26May2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		String url="https://www.amazon.com";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		//click on the best seller
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@id=\"nav-xshop\"]/a[3]")).click();
		// get header label
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String hdrLabel = driver.findElement(By.id("//*[@id=\"B01M16WBW1\"]/a[2]/span/div")).getText();
		// get header label
		System.out.println(hdrLabel);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@id='B07Q7CNPMV']/a[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String price = driver.findElement(By.xpath("(//div[@id='corePriceDisplay_desktop_feature_div']//span)[6]")).getText();
		System.out.println("price: " + price);
		Thread.sleep(4000l);
		driver.quit();
		
		
		
	}
}
