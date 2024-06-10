
package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		String res = result.getName();
		Reporter.log(res + " Has Been Started",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String res = result.getName();
		Reporter.log(res + " Has Been Passed",true);

	}

	@Override
	public void onTestFailure(ITestResult result) {
		String res = result.getName();
		Reporter.log(res+ " Has Been Failed", true);
		TakesScreenshot ts = (TakesScreenshot) driver;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./deliverables/screenshot/"+ res+".png");
		try {
			FileUtils.copyFile(src, dest);
			
		} catch (IOException e) {
			
		}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String res = result.getName();
		Reporter.log(res+" Has Been Skipped", true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
}
