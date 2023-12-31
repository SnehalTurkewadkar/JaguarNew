package day29May2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://sajithatharaka.github.io/svg-automation/");
		
		WebElement svgCircle=driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='circle']"));
		System.out.println("X cordinate:"+svgCircle.getAttribute("cx"));
		System.out.println("X-coordinate : "+svgCircle.getAttribute("cx"));
		System.out.println("Y-coordinate : "+svgCircle.getAttribute("cy"));
		System.out.println("Radius       : "+svgCircle.getAttribute("r"));
		System.out.println("Stroke       : "+svgCircle.getAttribute("stroke"));
		System.out.println("Stroke Width : "+svgCircle.getAttribute("stroke-width"));
		System.out.println("Fill Color   : "+svgCircle.getAttribute("fill"));
		
		WebElement svgRect=driver.findElement(By.xpath("//*[local-name()='rect' and @id='rectangle']"));
		System.out.println("width:"+svgRect.getAttribute("width"));
		System.out.println("height : "+svgRect.getAttribute("height"));
		
		WebElement svgText=driver.findElement(By.xpath("//*[local-name()='text']"));
		System.out.println(" Text getText():"+svgText.getText());
		System.out.println("Text using text content  : "+svgText.getAttribute("textcontent"));
		System.out.println("Text using innerHTML  : "+svgText.getAttribute("innerHTML"));
		driver.quit();
		
		
	}

}
