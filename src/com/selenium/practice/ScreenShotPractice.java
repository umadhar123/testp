package com.selenium.practice;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenShotPractice {
	
	static String captureScreenshots(WebDriver driver,WebElement element) throws IOException {
		String screenShotPath ="D:\\ScreenshotFor.png";
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(screenShotPath));
		return screenShotPath;
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//li[@class='jfHeader-menuListItem hasSubMenu login-btn-wrapper']//a[text()='Login']"));
		//element.sendKeys("Naga");
		JavascriptExecutor js = (JavascriptExecutor) driver;
	      
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow;'border: 6px solid green;');", element);
		captureScreenshots(driver, element);
		/*File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("D:\\Screenshot1.png"));
		
		File f = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\elementScreenshot.png"));
		Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(s.getImage(),"PNG",new File("D:\\fullPageScreenshot.png"));*/

	}

}
