package day9June2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InstagramCreateAccc {
	
	public static WebElement  GetElement(By by) {
		return driver.findElement(by);
	}
	public static void sendkeys(By by ,String value) {
		GetElement(by).sendKeys(value);
		
		
	}
	public static void SelectElement (String xpath,int value) {
		WebElement name1=driver.findElement(By.xpath(xpath));
		Select select =new Select(name1);
		select.selectByIndex(value);
	}
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver=new ChromeDriver();
		 driver.get("https://www.instagram.com/accounts/emailsignup/");
		 driver.manage().window().maximize();
		
		 Thread.sleep(2000l);
		By email=By.name("emailOrPhone");
		By name=By.name("fullName");
		By usename=By.name("username");
		By password=By.name("password");
		Thread.sleep(2000l);
		sendkeys(email,"snehal26497@gmail.com");
		sendkeys(name,"snehal");
		sendkeys(usename,"snehal26497");
		sendkeys(password,"snehal@8485");
		 GetElement(By.xpath("//button[@type='submit']")).click();
		 
		 Thread.sleep(2000l);
		SelectElement("//select[@title='Month:']",4);
		SelectElement("//select[@title='Day:']",15);
		SelectElement("//select[@title='Year:']",20);
		Thread.sleep(2000l);
		 GetElement (By.xpath("(//button[@type='button'])[2]")).click();
	}

}
