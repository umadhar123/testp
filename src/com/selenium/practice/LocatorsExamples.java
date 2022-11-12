package com.selenium.practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		String urlName ="https://phptravels.com/demo/";
		chromedriver.get(urlName);
		chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chromedriver.findElement(By.name("first_name")).sendKeys("Naga");
		//chromedriver.findElement(By.className("last_name input mb1")).sendKeys("Umadhar");
		//WebElement element =chromedriver.findElement(By.tagName("input"));
		//chromedriver.findElement(By.linkText("Pricing")).click();
		chromedriver.findElement(By.partialLinkText("Pric")).click();
		//chromedriver.findElement(By.cssSelector("input[name='email']")).sendKeys("test@test.com");
		chromedriver.findElement(By.id("demo")).click();
		
		

	}

}
