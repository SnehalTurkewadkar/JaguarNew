package day16May2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {
		String url="https://www.letskodeit.com/practice";
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement frameEle=driver.findElement(By.id("courses-iframe"));
		
		// driver.switchTo().frame(0);
		// driver.switchTo().frame("iframe-name");
		// driver.switchTo().frame("courses-iframe");
		driver.switchTo().frame(frameEle);
		
		WebElement element=driver.findElement(By.xpath("//div[@class='col-md-4']//h1"));
		System.out.println(element.getText());
		driver.switchTo().defaultContent();
		
		String label=driver.findElement(By.xpath("(//fieldset/legend)[1]")).getText();
		System.out.println("label:"+label);
		driver.quit();
		
		

	}

}
