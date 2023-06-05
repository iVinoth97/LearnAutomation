package testNgExamples;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenersEg implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case is going to execute");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case is passed");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case is failed.");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case is skipped.");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("before everything");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("after everything");
	}

}
