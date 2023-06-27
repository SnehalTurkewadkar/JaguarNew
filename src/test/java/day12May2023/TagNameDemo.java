package day12May2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameDemo {

	public static void main(String[] args) {
		String url="https://demo.openmrs.org./openmrs/login.htm";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		List<WebElement>low=driver.findElements(By.tagName("a"));
		System.out.println(low.size());
		low.get(0).click();
		System.out.println(low.get(1));
		String actUrl=driver.getCurrentUrl();
		String expUrl="https://demo.openmrs.org./openmrs/login.htm";
		if(expUrl.equals(actUrl))
			System.out.println("First link is working");
		else
			System.out.println("Fist link is not working");
		
		low=driver.findElements(By.tagName("a"));
		System.out.println(low.size());
		low.get(1).click();
		System.out.println(low.get(1));
		String actText=driver.findElement(By.xpath("//div[@class='dialog-content']/p")).getText();
		String expText="Please contact your System Administrator.";
		if(expText.equals(actText))
			System.out.println("second link is working");
		else
			System.out.println("Second link is not working");
		
		
		
		
		
	}

}
