package day23June2023;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ViewMobileDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		
		
		Map<String,Object>deviceMetrics=new HashMap<>();
		deviceMetrics.put("width", 400);
		deviceMetrics.put("height", 700);
		deviceMetrics.put("deviceScaleFactor", 50);
		deviceMetrics.put("mobile", true);driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
		
	 	driver.get("https://www.w3schools.com/");
		//	driver.get("https://amazon.com");
		
		
		
		

	}

}
