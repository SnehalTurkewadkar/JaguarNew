package day2June2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000l);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/");

	}

}
