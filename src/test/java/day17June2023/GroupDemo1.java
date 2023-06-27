package day17June2023;

import org.testng.annotations.Test;

public class GroupDemo1 {
	@Test(groups= {"cars"})
	public void testBenz() {
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
