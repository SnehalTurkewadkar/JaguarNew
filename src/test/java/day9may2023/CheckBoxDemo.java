package day9may2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		String url="https://www.letskodeit.com/practice";
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		List<WebElement>lwe=driver.findElements(By.xpath("//input[@name='cars' and @type='checkbox']"));
		System.out.println("size:"+lwe.size());
		for(WebElement we:lwe)
		{
			System.out.println(we.getAttribute("value"));
			we.click();
			Thread.sleep(3000l);
		}
		
			// benz unselect checkbox
			
		for(WebElement we:lwe)
		{
			if(we.getAttribute("value").equals("benz"))
					{
						we.click();
						Thread.sleep(3000l);
						break;
					}
		}
		}
		
	}


