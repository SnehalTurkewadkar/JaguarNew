package day25May2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DroppableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://jqueryui.com";
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[@id='content']/following-sibling::div//ul/li[2]/a)")).click();
		
		//switch to frame
		 driver.switchTo().frame(0);
		   WebElement draggable= driver.findElement(By.xpath("//div[@id='draggable'])"));
		   
		   WebElement droppable= driver.findElement(By.xpath("//div[@id='droppable']"));
		   
		   Actions actions=new Actions(driver);
		   
		   actions.dragAndDrop(draggable, droppable).build().perform();
		   
	}

}
