package com.selenium.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		//String urlName ="https://demoqa.com/browser-windows";
		String urlname ="https://phptravels.com/pricing";
		chromedriver.get(urlname);
		Thread.sleep(1000);
		chromedriver.manage().window().maximize();
		chromedriver.findElement(By.xpath("(//a[text()='Login'])[2]")).click();
		Thread.sleep(1000);
		 //String click1 = Keys.chord(Keys.CONTROL,Keys.ENTER);
		// Thread.sleep(1000);
		 //chromedriver.findElement(By.id("inputEmail")).sendKeys(click1);
		 ArrayList<String> newTb = new ArrayList<String>(chromedriver.getWindowHandles());
		 chromedriver.switchTo().window(newTb.get(1));
        System.out.println(chromedriver.getTitle());
		//chromedriver.switchTo().window(newTb.)
		//chromedriver.manage().window().minimize();
		//chromedriver.findElement(By.xpath(""));
		////div[@class ='gubaDc OIC90c RjsPE' and @id ='i2']
		//div[@class ='gubaDc OIC90c RjsPE' or @id ='i2']
		////div[contains(@id,'i2') and @class  ='gubaDc OIC90c RjsPE']
		//div[text() ='*Required']
		Thread.sleep(1000);
		//chromedriver.findElement(By.xpath("//button[text()='New Window']")).click();
		//String parentwinHand =chromedriver.getWindowHandle();
		//System.out.println(parentwinHand);
		//Set <String> allWindows = chromedriver.getWindowHandles();
		//Iterator<String> iter = allWindows.iterator();
		//System.out.println(allWindows.size());
		//while(iter.hasNext()) {
			
			//String childWindow = iter.next();
			//if(!parentwinHand.equalsIgnoreCase(childWindow)) {
				//chromedriver.switchTo().window(childWindow);
				//WebElement ele =chromedriver.findElement(By.id("sampleHeading"));
				//System.out.println(ele.getText());
				//chromedriver.close();
			//}
				
			
		//}
	}

}
