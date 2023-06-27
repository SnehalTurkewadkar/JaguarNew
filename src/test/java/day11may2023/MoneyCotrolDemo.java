package day11may2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoneyCotrolDemo {

	public static void main(String[] args) {
		String url="https://www.moneycontrol.com/";
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		//List<WebElement>lwe=driver.findElements(By.xpath("//table[@class='bxcom']//tbody/tr"));
			}
	}


