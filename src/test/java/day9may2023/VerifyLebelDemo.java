package day9may2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLebelDemo {

	public static void main(String[] args) {
		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
	    String actLblValue = driver.findElement(By.xpath("(//legend)[1]")).getText();
	    String expLblValue = "Radio Button example	";
	    if (actLblValue.equals(expLblValue))
		    System.out.println("Test case Passed !!!!");
	    else
		     System.out.println("Test case Failed, expValue: " + expLblValue + " : " + " actValue: " + actLblValue);
		
	   driver.quit();
		}

	}


