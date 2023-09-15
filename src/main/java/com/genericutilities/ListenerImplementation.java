package com.genericutilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener{
	
	 public WebDriver driver;

		public void onTestStart(ITestResult result) {
		
		}

		public void onTestSuccess(ITestResult result) {
			
		}

		public void onTestFailure(ITestResult result) {
		      String ssName = result.getName();
		      TakesScreenshot t=(TakesScreenshot) driver;
		      File src=t.getScreenshotAs(OutputType.FILE);
		      File dest= new File(".\\src\\main\\resources\\Screenshot"+ssName+".png");
		      try {
				FileUtils.copyFile(src, dest);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

		public void onTestSkipped(ITestResult result) {
		
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		}

		public void onTestFailedWithTimeout(ITestResult result) {
		}

		public void onStart(ITestContext context) {
		}

		public void onFinish(ITestContext context) {
		
		}


}
