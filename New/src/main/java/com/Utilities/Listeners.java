package com.Utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Testbase.TestBase;

public class Listeners extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Execution Started");
//		logger.info("Test Execution Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Execution Completed");
//		logger.info("Test Execution Completed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Execution Failed");
//		logger.info("Test Execution Failed");
		
		try {
			ScreenShotMethod.takeScreenshot(result.getName() + System.currentTimeMillis());
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Execution Skipped");
//		logger.info("Test Execution Skipped");

	}

}
