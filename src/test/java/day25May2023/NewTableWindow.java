package day25May2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTableWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String pWind=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.amazon.com");
		String cWind=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.flipKart.com");
		driver.close();
		driver.switchTo().window(cWind);
		driver.close();
		driver.switchTo().window(pWind);
		driver.close();
		
		
		
				
		

	}

}
