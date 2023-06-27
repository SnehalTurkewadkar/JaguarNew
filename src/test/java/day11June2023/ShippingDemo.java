package day11June2023;

import org.testng.annotations.Test;

public class ShippingDemo {
	@Test(dataProvider="DP2",dataProviderClass=DP.class)
	public void verifyShipping(String userName) {
		System.out.println(userName);
	}

}
