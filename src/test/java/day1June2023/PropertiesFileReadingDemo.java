package day1June2023;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class PropertiesFileReadingDemo {

	public static void main(String[] args) throws IOException {
		WebDriver driver=null;
		String fileName=System.getProperty("user.dir")+"/src/test/java/day1June2023/Config.prperties";
		Properties prop=new Properties();
		System.out.println(""+fileName);
		FileInputStream fis=new FileInputStream(fileName);
		prop.load(fis);
		
		String browser= (String) prop.get("browser");
		System.out.println("browser"+browser);
		
		String maxWindow=(String) prop.get("windowMaximize");
		System.out.println("windowMaximize:"+maxWindow);
		
		
		String city= (String) prop.get("city");
		String age= (String) prop.get("age");
		String weight= (String) prop.get("weight");
		String timeout= (String) prop.get("timeout");
		System.out.println("city:"+city);
		System.out.println("age:"+age);
		System.out.println("weight:"+weight);
		float wt1=Float.parseFloat(weight);
		System.out.println(wt1);
		System.out.println("timeout:"+timeout);
		

	}

}
