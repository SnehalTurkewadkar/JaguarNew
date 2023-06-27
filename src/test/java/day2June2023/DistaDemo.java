package day2June2023;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DistaDemo {
	static WebDriver driver;
	static WebElement getWebElement(By by ) {
		return driver.findElement(by);
		}
public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url=("http://dista.ai/");
		driver.get(url);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500);","");
		Thread.sleep(2000l);
		By Text50=(By.xpath("//div[@class='elementor-counter']/div/span[2]"));
		By Text50M =(By.xpath("//div[@class='elementor-counter']/div/span[3]"));
		By longText1=(By.xpath("//div[@class='elementor-counter-title']"));
		By Text15 =(By.xpath("//span[@data-to-value='15']"));
		By Text15M=(By.xpath("//span[text()='M+']"));
		By jobs =(By.xpath("//div[text()='Jobs scheduled/month']"));
		By Text35 =(By.xpath("//span[@data-to-value='35']"));
		By Text35M =(By.xpath("//span[text()='+']"));
		By customers =(By.xpath("//div[text()='Customers']"));
		System.out.println(getWebElement (Text50).getText());
		System.out.print(getWebElement (Text50M).getText());
		System.out.println(getWebElement (longText1).getText());
		System.out.print(getWebElement (Text15).getText());
		System.out.println(getWebElement (Text15M).getText());
		System.out.println(getWebElement (jobs).getText());
		System.out.println(getWebElement (Text35).getText());
		System.out.println(getWebElement (Text35M).getText());
		System.out.println(getWebElement (customers).getText());
		}
	}

