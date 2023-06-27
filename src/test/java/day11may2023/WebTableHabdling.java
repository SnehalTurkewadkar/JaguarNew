package day11may2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHabdling {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		/*// table [@id='product']/tbody/tr[3]/td[2]
		 * (// table [@id='product']//td[2])[2]
		 * 
		 */ //tr [3]/td[2]
		
		WebElement elementWt=driver.findElement(By.xpath( "//tr [3]/td[2]"));
		System.out.println(elementWt.getText());
		WebElement elementWt1=driver.findElement(By.xpath( "//tr [3]/td[3]"));
		System.out.println(elementWt1.getText());
		Thread.sleep(3000l);
		driver.quit();
	}

}
