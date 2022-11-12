package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		//open webpage in selenium
		chromedriver.get("https://phptravels.com/demo/");
		Thread.sleep(1000);
		//Get title of the page
		String title =chromedriver.getTitle();
		System.out.println(title);
		//get current url of the page
		String url=chromedriver.getCurrentUrl();
		System.out.println(url);
		String pageSource = chromedriver.getPageSource();
		System.out.println(pageSource);
		//chromedriver.findElement(By.xpath("//a[@class ='jfHeader-menuListLink jfHeader-dynamicLink jfHeader-login-action']")).click();
		Thread.sleep(500);
		//chromedriver.close();
		//chromedriver.quit();
		//chromedriver.navigate().refresh();
		chromedriver.navigate().back();
		

	}

}
