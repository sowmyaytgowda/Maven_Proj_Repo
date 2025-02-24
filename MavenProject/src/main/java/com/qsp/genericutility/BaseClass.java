package com.qsp.genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.qsp.objrctrepository.Homepage;
import com.qsp.objrctrepository.LoginPage;
import com.qsp.objrctrepository.WelcomePage;

public class BaseClass {
	public static WebDriver driver;
	public static ExtentReports extreport;
	public static ExtentTest test;

	public FileUtility fUtil = new FileUtility();
	public javaUtility jUtil = new javaUtility();// to attach time
	public WebDriverUtility wtil = new WebDriverUtility();

	public Homepage hp;
	public LoginPage lp;
	public WelcomePage wp;

	@BeforeSuite
	public void configureReport() {

		ExtentSparkReporter spark = new ExtentSparkReporter(
				"./HTML_reports/ExtentReport_" + jUtil.getSystemTime() + ".html");
		// ExtentReport_ is a file name,
		// public static ExtentReports extreport is static here bz we need only once,we
		// generate once
		extreport = new ExtentReports();
		extreport.attachReporter(spark);
	}

	@AfterSuite
	public void reportBackup() {
		extreport.flush();// to cleanup,to dump
	}

	@BeforeClass
	public void openBrowser() throws IOException {
		driver = new ChromeDriver();
		wtil.maximize(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(fUtil.getdatafromproperty("url"));

	}
	

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

	@BeforeMethod
	public void login() throws IOException {
		wp = new WelcomePage(driver);
		wp.getLoginlink().click();

		lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys(fUtil.getdatafromproperty("email"));
		lp.getPwdtetField().sendKeys(fUtil.getdatafromproperty("password"));
		lp.getLoginbutton().click();

	}

	@AfterMethod
	public void logout() {
		hp = new Homepage(driver);
		hp.getLogoutlink().click();
	}
	
	
	
}
