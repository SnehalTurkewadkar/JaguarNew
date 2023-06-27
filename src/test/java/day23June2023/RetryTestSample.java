package day23June2023;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTestSample {


		@Test(retryAnalyzer=MyRetry.class)
		public void Test1() {
			System.out.println("Test1 executed");
			Assert.assertTrue(1==1,"Test1 Failed due to mismatch condition");
			
		}
		@Test(retryAnalyzer=MyRetry.class)
		
	public void Test2() {
			Random rnd=new Random();
			int x=rnd.nextInt(5);
			System.out.println("X:"+x);
			Assert.assertTrue(4==x,"Test2 Failed due to mismatch condition");
			//Assert.assertTrue(4==5,"Test2 Failed due to mismatch condition");
		}
		

	}


