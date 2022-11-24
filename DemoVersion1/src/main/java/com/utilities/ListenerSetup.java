package com.utilities;


import org.testng.ITestListener;
import org.testng.ITestResult;

import com.testbase.TestBase;


public class ListenerSetup extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Testcase Execution Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Testcase Execution completed");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Testcase Execution Failed");
        UtilClass.takeScreenshot(result.getName()+System.currentTimeMillis());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Testcase Execution Skipped");
	
	}

	

}
