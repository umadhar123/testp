package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManagerExample {

	public static void main(String[] args) {
		 
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();

	}

}
