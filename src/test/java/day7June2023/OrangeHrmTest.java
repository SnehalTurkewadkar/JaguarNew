package day7June2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrmTest {
	WebDriver driver;
  @Test (priority=1)
  public void LaunchApp() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  
  @Test (priority=2)
   public void Login() throws InterruptedException {
	   Thread.sleep(2000l);
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
   }
  @Test (priority=3)
  public void navigateToPMIModule() {
	  driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[2]")).click();
  }
   
}
