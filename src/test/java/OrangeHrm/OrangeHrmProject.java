package OrangeHrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrmProject {

	public static void main(String[] args) throws InterruptedException {
		String adminUserData = "Admin";
		String url = "https://opensource-demo.orangehrmlive.com/";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		// Login to the application
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// click on search button
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		search.sendKeys(adminUserData);
		
		//check enter module correct or not 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement actualSearchModule=driver.findElement(By.xpath("//li/a/span"));
		System.out.println(actualSearchModule.getText());
		Thread.sleep(4000l);
		
		for(int i=0;i<adminUserData.length();i++)
			search.sendKeys(Keys.BACK_SPACE);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//ul[@class='oxd-main-menu']//li//a)[1]")).click();

	}

}
