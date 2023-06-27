package day1June2023;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesFileUsage {
		 
	public static void main(String[] args) throws IOException {
		WebDriver driver=null;
		String fileName=System.getProperty("user.dir")+"/src/test/java/day1June2023/Config.properties";
		Properties prop=new Properties();
		System.out.println("fileName: "+fileName);
		FileInputStream fis=new FileInputStream(fileName);
		prop.load(fis);
		
		String br= (String)prop.get("browser");
		if(br.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		if(br.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
		if(br.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();	
		
		String url=(String)prop.get("url");
		driver.get(url);
		
		String max=(String)prop.get("windowMaximize");
		if(max.equalsIgnoreCase("true"))
		driver.manage().window().maximize();
		 String timeout=(String)prop.get("timeout");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(timeout)));
				
		
		
	}

}
