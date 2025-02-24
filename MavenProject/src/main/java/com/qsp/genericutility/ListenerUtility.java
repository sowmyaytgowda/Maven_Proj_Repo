package com.qsp.genericutility;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.Status;

public class ListenerUtility extends BaseClass implements ITestListener {

//source over/impliments and choose ontestStart

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "test script is failed");
		TakesScreenshot ts = (TakesScreenshot) driver;
		String screenshot = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(screenshot);

		try {
			wtil.screenshot(driver);// screenshot taken from webDriverUtility
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//procedure
	// right click,source and select override select failure click
	// then wtil. =it is from webdriverutility then. then give method name
	// screenshot from webdriverutility and click

	@Override
	public void onTestStart(ITestResult result) {
		test = extreport.createTest(result.getName());
	}

//ITestListener.super.onTestFailure(result); delete this line

}
