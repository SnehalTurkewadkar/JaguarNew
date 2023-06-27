package day29May2023;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url=("https://www.google.com/");
		driver.get(url);
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Cyber Success");
		Thread.sleep(2000l);
		driver.navigate();
		search.clear();
		Thread.sleep(4000l);
		search.sendKeys(Keys.F5);
//		
//		
////		String k=Keys.chord(Keys.CONTROL,"f5");//pressing control+A
////		search.sendKeys(k);
////	    Thread.sleep(2000l);
//	    
////	    // Copy into clipboard the Current Address by pressing CONTROL+A
////	    k=Keys.chord(Keys.CONTROL,"f5");// press Contrl+c
////	   search.sendKeys(k);
////	    Thread.sleep(2000l);
//	    
//	    
//	    Actions actions =new Actions(driver);	
//	    actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).build().perform();
//	    
		
		
		
		
		
		
		
		

	}

}
