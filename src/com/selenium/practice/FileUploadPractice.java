package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(4000);
		//WebElement element = driver.findElement(By.xpath("//input[@id='file-upload']"));
		//Thread.sleep(3000);
		//element.click();
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
	   // executor.executeScript("arguments[0].click();", element);
		Actions actions = new Actions(driver);
		WebElement element= driver.findElement(By.xpath("//div[@class='example']/h3"));
		element.click();
		System.out.println(element.getText());
		actions.keyDown(Keys.CONTROL);
        actions.sendKeys("t");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
		//actions.keyUp(Keys.CONTROL);
		//WebElement element= driver.findElement(By.xpath("//div[@class='example']/h3"));
		//Thread.sleep(4000);
		
       
	}

}
