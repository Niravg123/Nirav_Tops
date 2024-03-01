package com;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {

	Base b = new Base();
	int count = 1;
	
	public void onTestFailure(ITestResult result) {
	
		b.getScreenShot(result.getInstanceName()+"_"+result.getName()+"_"+count);
		count++;
		
	}
	
}
