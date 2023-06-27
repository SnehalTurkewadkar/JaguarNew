package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchElementDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000l);
		
		WebElement text=driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		text.sendKeys("snehal");
		Thread.sleep(3000l);
		text.clear();
		
//		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
//		driver.findElement(By.id("demo")).click();
		Thread.sleep(2000l);
		driver.findElement(By.className("hasDatepicker")).click();
		new WebDriverWait(driver,Duration.ofSeconds(5))
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all")));
		 String monthYearval=driver.findElement(By.className("ui-datepicker-title")).getText();
		 System.out.println(monthYearval);
		 
	}

}
