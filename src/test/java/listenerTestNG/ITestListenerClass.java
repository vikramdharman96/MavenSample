package listenerTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass implements ITestListener{
	
	//listener is interface ,we are listen to the events that are performed by testng
	//we can use testlistener adapter
	public void onTestStart(ITestResult result) {
	System.out.println("onTestStart");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
		
	}

	public void onStart(ITestContext context) {
		System.out.println("onStart");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
		
	}


	

}
