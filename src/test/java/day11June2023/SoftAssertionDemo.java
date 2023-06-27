package day11June2023;

	import org.testng.Assert;
	import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {
	@Test
	
	public void verifySoftAssertion() {
		int i=10, j=20;
		String s1="Cyber", s2="Cyber";
		float f1=10.5f, f2=10.5f;
		
		Assert.assertEquals(i, j);
		Assert.assertEquals(s1, s2);
		Assert.assertEquals(f1, f2);
		
		System.out.println("begin test");
		SoftAssert sa=new SoftAssert();
		
		sa.assertEquals(i, j,"i i is not equal to j");
		sa.assertEquals(s1,s2,"s1 is not equal to s2");
		sa.assertEquals(f1,f2,"f1 is not eqqual to f2");
		
		sa.assertAll();
		System.out.println("End test");
		
		
	}
}
