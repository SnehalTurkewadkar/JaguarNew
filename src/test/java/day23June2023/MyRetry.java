package day23June2023;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer{
	private int retryCount                 =0;
	private static final int maxRetryCount =2;

	 public boolean retry(ITestResult result) {
	    if (this.retryCount < MyRetry.maxRetryCount) {
	      this.retryCount++;
	      return true;
	    }
	    return false;
	 }
}
