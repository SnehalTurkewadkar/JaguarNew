package day31May2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableHandling3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		
		
		List<WebElement> low= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		List<WebElement> loc=low.get(0).findElements(By.xpath("th"));
		
		for(WebElement ele:loc)
			System.out.print(String.format("%-20S", ele.getText()));
		System.out.println();
		
		for(int i=1;i<low.size();i++)
		{
			loc=low.get(i).findElements(By.xpath("td"));
			for(WebElement ele:loc)
				System.out.print(String.format("%-20S", ele.getText()));
			System.out.println();
		}
		
		driver.quit();
	}

}
