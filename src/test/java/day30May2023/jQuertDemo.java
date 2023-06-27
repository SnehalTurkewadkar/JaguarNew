package day30May2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jQuertDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		List<WebElement> listOfWebElement =driver.findElements(By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//span[@class='comboTreeItemTitle']"));
		System.out.println(listOfWebElement.size());
		for(int i=0;i<listOfWebElement.size();i++)
		{
			listOfWebElement.get(i).click();
			System.out.println(listOfWebElement.get(i).getText());
		}
			Thread.sleep(2000l);
			driver.quit();
		}

	}

