package com.selenium.practice;

//import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class ActionsParactice{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.xpath("//div[@id='double-click']"));
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		
		System.out.println("Background color before double click:"+element.getCssValue("background-color"));
		actions.doubleClick(element).perform();
		
		Thread.sleep(3000);
		System.out.println("Background color after double click:"+element.getCssValue("background-color"));
		Thread.sleep(3000);
		WebElement element1 =driver.findElement(By.xpath("//div[@id='click-box']"));
	actions.clickAndHold(element1).perform();
	Thread.sleep(3000);
	actions.release(element1).perform();
	WebElement fromLocation= driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement toLocation =driver.findElement(By.xpath("//div[@id='droppable']"));
	actions.dragAndDrop(fromLocation, toLocation).perform();
	WebElement mouseHover = driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
	Thread.sleep(3000);
	actions.moveToElement(mouseHover);
	actions.build().perform();
	WebElement subMenu =driver.findElement(By.xpath("//button[text()='Hover Over Me Second!']//preceding::a[text()='Link 1']"));
		
		actions.moveToElement(subMenu);
		actions.click().build().perform();
		driver.quit();

	}

}
