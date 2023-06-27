package day5June2023;

import java.time.LocalDateTime;
import java.util.Date;

public class DateHandlingDemo {

	public static void main(String[] args) throws InterruptedException {
		Date dt=new Date();
		System.out.println(dt);
		System.out.println(dt.toString().replace(" ", "_").replace(":", "_")+".png");
		System.out.println("--------------------------------");
		
		for(int i=1;i<10;i++)
		{
			Thread.sleep(2000l);
			System.out.println(System.currentTimeMillis());
		}
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.toString());
		
	}

}
