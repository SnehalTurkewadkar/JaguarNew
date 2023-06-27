package day11June2023;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP {

	/**
	 * 
	 * @return
	 */
	@Test
	@DataProvider(name="DP1")

		public Object[] [] getData1() 
	{
		Object[][] data= {
				{"salman","sam123"},
				{"rahul","rahi123"}
		};
		return data;
	
			
		}
	/**
	 * 
	 * @return
	 */
	@Test
	@DataProvider(name="DP2")
		public Object[][] getData2(){
			Object[][] data= {
					{"hrutik"},
					{"hardik"}
			};
			return data;
		}
		
	}

	


