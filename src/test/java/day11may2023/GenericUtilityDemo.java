package day11may2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericUtilityDemo {
	static WebDriver driver;
	static WebElement getWebElement (By by)
	{
		return driver.findElement(by);
	}
	static void type (By by, String value)
	{
		getWebElement(by).sendKeys(value);
	}

	public static void main(String[] args) {
		By firstName=By.name("firstname");
		By lastName=By.name("lastName");
		By email=By.name("email");
		By pwd=By.name("pwd");
		
		String url="https://www.facebook.com";
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		getWebElement(By.linkText("Create new account")).click();
		 type(firstName, "snehal");
		 type(lastName, "patil");
		 type(email, "snehal@123");
		 type(pwd, "6542");
		 

	}

}
