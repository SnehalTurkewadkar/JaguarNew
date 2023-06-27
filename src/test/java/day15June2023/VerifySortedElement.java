package day15June2023;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifySortedElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//ul[@class='oxd-main-menu']/li)[1]")).click();
		driver.findElement(By.xpath("//div[@id='app']//div[4]/div/i")).click();  // button
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span'])[6]")).click();
		List<WebElement> low =	driver.findElements(By.xpath("//div[@class='oxd-table-body']/div/div/div[4]"));
		List<String> empNameList = low.stream().map(s->s.getText())
				.collect(Collectors.toList());
		
		List<String> loString = empNameList.stream().sorted().collect(Collectors.toList());
		Assert.assertEquals(empNameList, loString,"Both list are not equal !!!");
		
	//	driver.quit();
	
	
	}



		
	}


