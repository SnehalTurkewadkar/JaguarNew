package day17June2023;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		// When test method starts
		System.out.println("onTestStart() -> Test Name: " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// If test method is successful
		System.out.println("onTestSuccess() -> Test Name: " + result.getName());
	}


	public void onTestFailure(ITestResult result) {
		// If test method is failed
		System.out.println("onTestFailure() -> Test Name: " + result.getName());
	}

	
	public void onTestSkipped(ITestResult result) {
		// If test method is failed
		System.out.println("onTestSkipped() -> Test Name: " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// Ignore this
	}
}

