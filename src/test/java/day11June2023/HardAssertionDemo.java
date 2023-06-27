package day11June2023;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo {
	@Test
	public void verifyHardAssertion() {
		int actualI=10,expectedJ=11;
		
		System.out.println("Begin Test");
		//Assert.assertEquals(actualI, expectedJ);
		Assert.assertEquals(actualI, expectedJ,"actual value of i =" +actualI+ "is not equal to the J="+expectedJ);
		System.out.println("End Test");
	}

}
