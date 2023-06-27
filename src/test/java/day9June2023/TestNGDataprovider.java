package day9June2023;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataprovider {

	
		@Test(dataProvider="getData")
		public void login(String username ,String password) {
			System.out.println("user successfully login....");
			System.out.println("username:"+username +"password:" +password);
		}
		@DataProvider
		 
		public Object[][] getData(){
			Object[][] data = new Object[4][2];
			
			data[0][0]="Rahul";
			data[0][1]="Rahul1234";
			
			data[1][0]="Snehal";
			data[1][1]="snehal23";
			
			data[2][0]="Rohan";
			data[2][1]="Rohan123";
			
			data[3][0]="Pratik";
			data[3][1]="Gill@123";
			
			return data;
		}
			
			
			
		

}
