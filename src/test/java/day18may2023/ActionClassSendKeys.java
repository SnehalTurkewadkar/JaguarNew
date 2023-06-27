package day18may2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassSendKeys {

	public static void main(String[] args) {
		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement txtAutosuggest =driver.findElement(By.id("autosuggest"));
		Actions action =new Actions(driver);
		action.moveToElement(txtAutosuggest).click().sendKeys("Snehal").build().perform();
		
		WebElement btnOpenWindow=driver.findElement(By.id("openwindow"));
		action.click(btnOpenWindow).build().perform();
		
		

	}

}
