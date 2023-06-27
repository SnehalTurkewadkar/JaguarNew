package day10May2023;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdownList {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.letskodeit.com/practice";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement multipledropDowmList =driver.findElement(By.id("multiple-select-example"));
		
		//control+shift+0
		Select select=new Select(multipledropDowmList);
		System.out.println("isMultiple:"+select.isMultiple());
		
		select.selectByIndex(0);
		select.selectByIndex(1);
		select.selectByIndex(2);
		
		List<WebElement> low=select.getOptions();
		for(int i=0;i<low.size();i++)
			select.selectByIndex(i);
		Thread.sleep(4000l);
		select.deselectByIndex(0);
		
		List<WebElement> selectOptionList=select.getAllSelectedOptions();//3
		System.out.println("selected option size:"+selectOptionList.size());
		System.out.println("selected option ->");
		for(WebElement x:selectOptionList)
			System.out.println(x.getText());
		
		for(int i=0;i<low.size();i++)
		select.deselectByIndex(i);
		select.deselectAll();
		// want to print all options present in the list
		List<String> actList=new ArrayList<>();
		
		for(WebElement x:low)
		{
			System.out.println(x.getText());
			actList.add(x.getText());
			
		}
		// verify all option present in the list with explist
		List<String>expList =new ArrayList<>(List.of("Apple","Orange","peach"));
		
		if(actList.equals(expList))
			System.out.println("Test case #1 passed!!!");
		else
			System.out.println("Test case #1 failed!!!");
		
		if(actList.containsAll(expList))
			System.out.println("Test case #2 passed!!!");
		else
			System.out.println("Test case #2 failed!!!");
		Thread.sleep(4000l);
		driver.quit();

		}
	
	

}
