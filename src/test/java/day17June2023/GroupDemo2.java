package day17June2023;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GroupDemo2 {
	@Parameters({"browser","env","responseCodes"})
	@Test(groups= {"cars"})
	public void testBenz(String browserName, String envName,String rcs) {
		System.out.println("broswerName:"+browserName);
		System.out.println("envName:"+envName);
		System.out.println("responseCodes:"+rcs);
		
		String[] rc=rcs.split(",");
		for(String s:rc)
			System.out.println(Integer.parseInt(s)+100);
		System.out.println("Benz Method");
	}
		
		
	
	@Test(groups= {"cars","bikes"})
	public void testHonda() {
		System.out.println("Honda Method");
	}
	@Test(groups= {"cars"})
	public void testAudi() {
		System.out.println("Audi Method");
	}
	@Test(groups= {"bikes"})
	public void testYamaha() {
		System.out.println("Yamaha Method");
	}
	@Test(groups= {"bikes"})
	public void testBajaj() {
		System.out.println("Bajaj MEthod");
	}
	

}
