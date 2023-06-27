package day9June2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestNGDemo2 {

	WebDriver driver;
	
	private WebElement getWebElement(By by) {
		return driver.findElement(by);
	}
	
	private void type(By by,String data) {
		getWebElement(by).sendKeys(data);
		
	}
	

}
