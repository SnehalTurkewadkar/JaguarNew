package day11June2023;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo3 {
	@Test(dataProvider="DP")
	public void verifyLogin(Map<String,String> map)
	{
		System.out.println("username"+":"+map.get("password"));
		
	}
	@DataProvider(name="DP")
	public Object[] getObject()
	{
		Object[] object=new Object[4];
		 
		Map<String,String> m1=new HashMap();
		m1.put("username", "Rahul");
		m1.put("password", "Rahul@123");
		object[0]=m1;
		
		m1.put("username", "snehal");
		m1.put("password", "snehal@123");
		object[1]=m1;
		
		m1.put("username", "AbhiShek");
		m1.put("password", "Abhi@123");
		object[2]=m1;
		
		
		m1.put("username", "Pavan");
		m1.put("password", "pavan@123");
		object[3]=m1;
	
	return object;
	}
}

