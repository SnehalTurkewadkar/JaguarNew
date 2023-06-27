package day31May2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000l);
		 WebElement ddl=driver.findElement(By.name("animals"));
		 ddl.click();
		 Select select= new Select(ddl);
		 Thread.sleep(3000l);
		 select.selectByIndex(0);
		 select.selectByIndex(1);
		 select.selectByIndex(2);
		 select.selectByIndex(3);
		 
		 List<WebElement> selectedOption=select.getAllSelectedOptions();
		 System.out.println("Selectedoption:"+selectedOption.size());
		 
		 for(WebElement ele:selectedOption)
			 System.out.println(ele.getText());
	}

}

