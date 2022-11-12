package com.selenium.practice;

import java.io.IOException;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import freemarker.log.Logger;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.pages.*;
public class ExtentReportPractice extends ScreenShotPractice {
	
	public static ExtentSparkReporter spark;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static Logger loge;
	public static ChromeDriver driver;
	public static  WebElement element;
	public static void startReport() {
		String path= "D:\\reports.html";
		extent = new ExtentReports();
		spark = new ExtentSparkReporter(path);
		extent.attachReporter(spark);
		
		extent.setSystemInfo("Host Name", "Automation Testing");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("User Name", "Naga");
        spark.config().setDocumentTitle("Test Results report ");
               // Name of the report
        spark.config().setReportName("Test Result report ");
               // Dark Theme
        spark.config().setTheme(Theme.STANDARD);
	}
	static void createTest(String testCaseName) {
		test = extent.createTest(testCaseName);
	}
	static void getResult(String step) throws IOException {
		//test.log(Status.PASS,"First Test case passed" +test.addScreenCaptureFromPath("D:\\screenshot.png"));
		//test.log(Status.PASS,"Second Test case passed" +test.addScreenCaptureFromPath("D:\\screenshot.png"));
		//test.createNode("TestCase used");
		//test.log(Status.PASS,"First Test case passed" +test.addScreenCaptureFromPath(captureScreenshots(driver,element)));
		//test.log(Status.PASS, test.addScreenCaptureFromPath(captureScreenshots(driver, element)));
		test.log(Status.FAIL, MarkupHelper.createLabel( " - Test Case Failed", ExtentColor.RED));
		test.log(Status.FAIL, MarkupHelper.createLabel(" - Test Case Failed", ExtentColor.RED));
		test.fail("Test Case failed"+ test.addScreenCaptureFromPath(captureScreenshots(driver, element)));
		test.log(Status.PASS, MarkupHelper.createLabel(" Test Case PASSED", ExtentColor.GREEN));
		
		
	}

	public static void main(String[] args) throws IOException {
		startReport();
		
	  WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://phptravels.com/demo/");
	   element = driver.findElement(By.xpath("//li[@class='jfHeader-menuListItem hasSubMenu login-btn-wrapper']//a[text()='Login']"));
	 
	  String title =driver.getTitle();
	  createTest("Validation of Page title");
	  if(title.equals("Demo"))
		  getResult("Page tile has verified successfully");
	  else
		  getResult("Page title not verified");
	  
	  createTest("url validation");
	  
	  getResult("url has validated");
	  extent.flush();

	}

}
