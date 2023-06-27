package day9June2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookDemo {
	static WebElement getWebElement (By by)
	{
		return driver.findElement(by);
	}
	static void findElement ( By by, String value)
	{
		getWebElement(by).sendKeys(value);
	}
	static void webElement(Select select) {
		return;
	}
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
	static WebDriver  driver;
	public static void main(String[] args) throws InterruptedException {
			driver=new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20000));
			By firstName=By.name("firstname");
			By lastName=By.name("lastName");
			By email=By.name("reg_email__");
			By pwd=By.name("reg_passwd__");
			
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]")).click();
		
//		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
//		element.sendKeys("snehal");
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("lastname"))).sendKeys("Patil");
//		 wait.until(ExpectedConditions.presenceOfElementLocated(By.name("reg_email__"))).sendKeys("snehal264@gmail.com");
//		 wait.until(ExpectedConditions.presenceOfElementLocated(By.name("reg_passwd__"))).sendKeys("12364");
//		 
		webElement(firstName, "snehal");
		webElement(lastName, "patil");
		webElement(email, "snehal@123");
		webElement(pwd, "6542");
		 Thread.sleep(3000l);
		WebElement date=driver.findElement(By.name("birthday_day"));
		Select select=new Select(date);
		select.selectByIndex(9);		
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select select1=new Select(month);
		select1.selectByIndex(3);
		
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select selectyear=new Select(year);
		selectyear.selectByIndex(16);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='radio'])[3]"))).click();
		 WebElement custom=driver.findElement(By.name("preferred_pronoun"));
		 Select selectcustom=new Select(custom);
		 selectcustom.selectByValue("2");
		
		
		// driver.findElement(By.xpath("//div[@id='u_2_p_Uy']/select"));
		 
		
		
		
		
		

	}
	private static void webElement(By firstName, String string) {
		// TODO Auto-generated method stub
		
	}

}

 
