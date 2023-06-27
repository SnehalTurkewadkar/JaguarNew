package day9June2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookDemoWithoutMethod {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
	static WebDriver  driver;
	
	public void waitElement(String name,String value) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name(name))).sendKeys(value);
	}
	
	public void getWebElement(String name, int value) {
		
		WebElement data= driver.findElement(By.name(name));
		Select selectyear=new Select(data);
		selectyear.selectByIndex(value);
	}
	
	public void getWebElement(String name, String value) {

		WebElement data = driver.findElement(By.name(name));
		Select selectyear = new Select(data);
		selectyear.selectByValue(value);
	}

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20000));
		
		FacebookDemoWithoutMethod face = new FacebookDemoWithoutMethod();
		face.waitElement("firstname", "snehal");
		face.waitElement("lastname", "Patil");
		face.waitElement("reg_email__", "snehal264@gmail.com");
		face.waitElement("reg_passwd__", "123648");
		face.waitElement("reg_email_confirmation__", "snehal264@gmail.com");
		
		
		face.getWebElement("birthday_day", 9);
		face.getWebElement("birthday_month", 3);
		face.getWebElement("birthday_year", 16);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='radio'])[3]"))).click();
		face.getWebElement("preferred_pronoun", "2");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		
		 
		// driver.findElement(By.xpath("//div[@id='u_2_p_Uy']/select"));
		 
		
			
		
		
		

	

}
}
