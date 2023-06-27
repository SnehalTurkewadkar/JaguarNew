package day14June2023;


import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSizeDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	//	driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.3");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			Point getPos=driver.manage().window().getPosition();
			System.out.println(getPos.getX() + " :: y=" + getPos.getY() + " :: x="+getPos.x + "  :: y="+getPos.y);
	 
			Dimension dim=driver.manage().window().getSize();
			System.out.println("dim.height=>"+dim.getHeight());
			System.out.println("dim.getWidth=>"+dim.getWidth());
			
			System.out.println("driver.getWidth=>"+driver.manage().window().getSize().getWidth());
			System.out.println("driver.getHeight=>"+driver.manage().window().getSize().getHeight());
			
			driver.manage().window().maximize();
			System.out.println("After maxmizing the window");
			System.out.println("driver.getWidth=>"+driver.manage().window().getSize().height);
			System.out.println("driver.getHeight=>"+driver.manage().window().getSize().width);
			
			System.out.println("After setting the window size");
			Dimension d=new Dimension(748,798);
			driver.manage().window().setSize(d);
			System.out.println("driver.getWidth=>"+driver.manage().window().getSize().width);
			System.out.println("driver.getHeight=>"+driver.manage().window().getSize().height);
			
			driver.manage().window().maximize();
			int windowHeight = driver.manage().window().getSize().getHeight();
			System.out.println("windowHeight : " + windowHeight);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0," + windowHeight + ")", "");
			
			
			
			
			
	}

}
