package day11June2023;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo2 {
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
		
		Map<String,String> m2=new HashMap();
		m2.put("username", "snehal");
		m2.put("password", "snehal@123");
		object[1]=m2;
		
		Map<String,String> m3=new HashMap();
		m3.put("username", "AbhiShek");
		m3.put("password", "Abhi@123");
		object[2]=m3;
		
		Map<String,String> m4=new HashMap();
		m4.put("username", "Pavan");
		m4.put("password", "pavan@123");
		object[3]=m4;
	
	return object;
	}
}