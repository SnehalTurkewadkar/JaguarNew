package day9may2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MethodForDropDownList {
	static void selectFromList1(String Type, String value, Select select) throws InterruptedException {
		
		select.selectByVisibleText(value);Thread.sleep(200l);
	}

	private static void selectFromList2(String string, int i, Select select) throws InterruptedException {

		select.selectByIndex(i);Thread.sleep(200l);
	}
	
	private static void selectFromList3(String string, String value, Select select) throws InterruptedException {

		select.selectByValue(value);Thread.sleep(200l);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		String url="https://www.letskodeit.com/practice";
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		WebElement ddl=driver.findElement(By.id("carselect"));
		Select select =new Select(ddl);
		
		 selectFromList1("Visible", "Honda", select);
		 selectFromList1("Visible", "BMW", select);
		 selectFromList1("Visible", "Benz", select);
		 
		 selectFromList2("index", 0, select);
		 selectFromList2("index", 1, select);
		 selectFromList2("index", 2, select);
		 
		 
		 selectFromList3("value", "Honda", select);
		 selectFromList3("value", "Bmw", select);
		 selectFromList3("value", "Benz", select);
		 
		

		
		
		


	}




}
