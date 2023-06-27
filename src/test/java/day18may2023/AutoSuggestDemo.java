package day18may2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDemo {

	public static void main(String[] args) {
		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("autosuggest")).sendKeys("Res");
		driver.findElement(By.id("//ul[@id='ui-id-1']//li[3]/a[@id='ui-id-4']")).click();
		String val=driver.findElement(By.id("autosuggest")).getAttribute("value");
		System.out.println("value :"+val);

	}

}
