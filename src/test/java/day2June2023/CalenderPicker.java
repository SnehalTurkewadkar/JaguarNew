package day2June2023;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField.Read;


public class CalenderPicker {
	static WebDriver driver;
	static WebElement getWebElement(By by ) {
		return driver.findElement(by);
	}
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url=("http://127.0.0.1/login.do");
		driver.get(url);
		
		By textName=By.name("username");
		By password=By.name("pwd");
		By login=By.id("loginButton");
		By prevMonth=By.xpath("(//table[@class='mainSidesPadding']/tbody/tr/td[2]/table/tbody/tr/td)[1]");
		By nextMonth=By.xpath("(//table[@class='mainSidesPadding']/tbody/tr/td[2]/table/tbody/tr/td)[3]");
		
		getWebElement(textName).sendKeys("admin");
		getWebElement(password).sendKeys("manager");
		getWebElement(login).click();
		
		LocalDate todaysDate=LocalDate.now();
		LocalDate selectedDate =LocalDate.of(2023, 9, 15);
		
		int todaysDay = todaysDate.getDayOfMonth();
		int todaysMonth=todaysDate.getMonthValue();
		int todaysYear=todaysDate.getYear();
		
		System.out.println("todaysDay:"+todaysDay);
		System.out.println("todaysMonth:"+todaysMonth);
		System.out.println("todaysYear:"+todaysYear);
		
		int selectedDay=selectedDate.getDayOfMonth();
		int selectedMonth=selectedDate.getMonthValue();
		int selectedYear=selectedDate.getYear();
		System.out.println("======================================");
		
		System.out.println("selectedDay:"+selectedDay);
		System.out.println("selectedMonth:"+selectedMonth);
		System.out.println("selectedYear:"+selectedYear);
		
		boolean goNextMonth= true;
		int monthDiff=0;
		if(selectedDate.isAfter(todaysDate))
		{
			goNextMonth=true;
			monthDiff=selectedMonth-todaysMonth;
		}
		else
		{
			goNextMonth=false;
			monthDiff=todaysMonth-selectedMonth;
		}
		System.out.println("monthDiff:"+monthDiff);
		while(monthDiff>0)
		{
			if(goNextMonth)
			{
				System.out.println("going in next month");
				getWebElement(nextMonth).click();
				
			}
			else
			{
				System.out.println("going in the previous month");
				getWebElement(prevMonth).click();
			}
			monthDiff--;
		}
			int day = selectedDate.getDayOfMonth();  //2
			System.out.println("day: " + day);
			
			String part1 = "//table[@id='calendar_table']//tr//td//span[text()='";
			String part2= "']";
			WebElement element = getWebElement(By.xpath(part1+day+part2));
			element.click();
			
		}
	}
		
		
	

