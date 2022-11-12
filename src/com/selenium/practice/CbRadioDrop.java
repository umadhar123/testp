package com.selenium.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CbRadioDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://formsmarts.com/form/mfe?mode=h5");
		//WebElement element=driver.findElement(By.xpath("//input[@id='u_duj_127984']"));
		WebElement element = driver.findElement(By.cssSelector("input[name='u_f8c_127984']"));
		element.click();
		Thread.sleep(5000);
		element.click();
		boolean elmentSelected=element.isSelected();
		System.out.println(elmentSelected);
		
		WebElement element1 =driver.findElement(By.xpath("//input[@id='u_f8c_127983_0']"));
		element1.click();
		Select select =new Select(driver.findElement(By.xpath("//select[@id='u_f8c_127982']")));
		//Select select =new Select(element1);
		select.selectByIndex(5);
		Thread.sleep(5000);
		select.selectByValue("AR");
		Thread.sleep(5000);
		select.selectByVisibleText("Angola");
		List<WebElement> lst = select.getOptions();
		for(WebElement options:lst ) {
			System.out.println(options.getText());
		}
		
       select.deselectByVisibleText("Angola");
	}

}
