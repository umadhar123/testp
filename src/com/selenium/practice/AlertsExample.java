package com.selenium.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.geckodriver.driver", "D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//String urlName ="https://demoqa.com/browser-windows";
		//String urlname ="C:/Users/welcome/OneDrive/Desktop/Sample.html";
		String urlname ="https://the-internet.herokuapp.com/javascript_alerts";
		driver.get(urlname);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		/*Thread.sleep(1000);
		chromedriver.findElement(By.xpath("//a[text() ='Show Alert']")).click();
		Thread.sleep(1000);
		chromedriver.switchTo().alert().accept();
		Thread.sleep(1000);
		chromedriver.switchTo().alert().dismiss();
		Thread.sleep(1000);*/
		WebElement element=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		Thread.sleep(5000);
		element.click();
		// ((JavascriptExecutor) chromedriver).executeScript("arguments[0].click()", element);
		Alert alertTest =driver.switchTo().alert();
		String text = alertTest.getText();
		System.out.println(text);
		Thread.sleep(5000);
		//((JavascriptExecutor) chromedriver).executeScript("window.alert = () => 0");
		alertTest.sendKeys("Hello");
		Thread.sleep(5000);
		alertTest.accept();
		//alertTest.dismiss();
		//chromedriver.switchTo().alert().sendKeys("Test Naga");
		

	}

}
