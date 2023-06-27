package day29May2023;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardHandling {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	Thread.sleep(2000l);
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/text-box");

	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,200);", "");
    
	// Enter the Full Name
    //WebElement fullName =
	WebElement fullName=driver.findElement(By.id("userName"));
	fullName.sendKeys("My cyber success");
	
	// Enter the Email id
	
	WebElement Emailid=driver.findElement(By.id("userEmail"));
	Emailid.sendKeys("mycybersucess@gmail.com");
	
	// enter current address
	
	WebElement currentAddress=driver.findElement(By.id("currentAddress"));
	currentAddress.sendKeys("Deccan,Asmani Plaza, Pune 411 016");
	
	String k=Keys.chord(Keys.CONTROL,"a");//pressing control+A
	currentAddress.sendKeys(k);
    Thread.sleep(2000l);
    
    // Copy into clipboard the Current Address by pressing CONTROL+A
    k=Keys.chord(Keys.CONTROL,"c");// press Contrl+c
    currentAddress.sendKeys(k);
    Thread.sleep(2000l);
    
    
    //Press the TAB Key to Switch Focus to Permanent Address
    Actions actions = new Actions(driver);
    actions.sendKeys(Keys.TAB).build().perform();
    Thread.sleep(2000l);
    
    //Paste the Address in the Permanent Address field
    WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
//  permanentAddress.clear();  // to set the focus
    permanentAddress.sendKeys(Keys.chord(Keys.CONTROL,"v"));
    
    
    Thread.sleep(5000l);
    driver.quit();
}
	
	
}

