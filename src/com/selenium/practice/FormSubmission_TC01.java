package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.DemoFormSubmission;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormSubmission_TC01 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://phptravels.com/demo/");
		DemoFormSubmission formObj = new DemoFormSubmission(driver);
		formObj.enterFName("Naga");
		formObj.enterLName("Umadhar");
		
		

	}

}
