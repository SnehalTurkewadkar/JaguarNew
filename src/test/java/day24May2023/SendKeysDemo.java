package day24May2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String s1="snehal";
		String s2="prachi";
		String s3="Smita";
		String s4="Pooja";
		String s5="Aishwarya";
		driver.findElement(By.name("s")).sendKeys(s1,s2,s3,s4,s5);
	}

}
