package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeDemoCollection {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://127.0.0.1/login.do;jsessionid=1trbtyndmq2cr");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.findElement(By.xpath("(//div[@class='label'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("snehal2 Patil");
		driver.findElement(By.name("description")).sendKeys("This is sample task for Actitime customer create");
		 WebElement element =driver.findElement(By.xpath("//label[text()='Import projects assignments']"));
		element.isSelected();
		driver.findElement(By.name("createCustomerSubmit")).click();
		
		WebElement ActualcustomerName=driver.findElement(By.xpath("//a[text()='snehal2 Patil']"));
		System.out.println(ActualcustomerName.getText());
		String expCustomerName="snehal2 Patil";
		if(ActualcustomerName.equals(expCustomerName))
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("test case failed");
		}
		//Create new project
		
	
	
		
		
		
		
	}

	
	
}
