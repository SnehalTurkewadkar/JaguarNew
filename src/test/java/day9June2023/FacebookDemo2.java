package day9June2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookDemo2 {
	public class FacebookDemo {
	    WebDriverWait wait;
	    WebDriver driver;

	    public void main(String[] args) throws InterruptedException {
	        FacebookDemo demo = new FacebookDemo();
	        demo.setup();
	        demo.registerOnFacebook("snehal", "Patil", "snehal264@gmail.com", "12364", 9, 3, 16, 2);
	        demo.tearDown();
	    }

	    public void setup() {
	        driver = new ChromeDriver();
	        wait = new WebDriverWait(driver, Duration.ofMillis(5000));
	    }

	    public void registerOnFacebook(String firstName, String lastName, String email, String password,
	                                   int day, int month, int year, int pronounIndex) {
	        driver.get("https://www.facebook.com/");
	        driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]")).click();
	        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
	        element.sendKeys(firstName);
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("lastname"))).sendKeys(lastName);
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("reg_email__"))).sendKeys(email);
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("reg_passwd__"))).sendKeys(password);
	        WebElement date = driver.findElement(By.name("birthday_day"));
	        Select selectDate = new Select(date);
	        selectDate.selectByIndex(day);
	        WebElement monthElement = driver.findElement(By.name("birthday_month"));
	        Select selectMonth = new Select(monthElement);
	        selectMonth.selectByIndex(month);
	        WebElement yearElement = driver.findElement(By.name("birthday_year"));
	        Select selectYear = new Select(yearElement);
	        selectYear.selectByIndex(year);
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='radio'])[3]"))).click();
	        WebElement custom = driver.findElement(By.name("preferred_pronoun"));
	        Select selectCustom = new Select(custom);
	        selectCustom.selectByIndex(pronounIndex);
	    }

	    public void tearDown() {
	        driver.quit();
	    }
	}






}
