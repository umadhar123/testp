package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoFormSubmission {
	WebDriver driver;
	
	public DemoFormSubmission(WebDriver driver)
	{
		this.driver =driver;
	}
	
	//Locator for the First Name
	By fName =By.xpath("//input[@name='first_name']");
	By lName =By.xpath("//input[@name='last_name']");
	By bName =By.xpath("//input[@name='business_name']");
	By emaiId=By.xpath("//input[@name='email']");
	By formSubmit =By.xpath("//button[@id='demo']");
	By formTxtValidation = By.xpath("//h2[@class='text-center cw']//strong");
	
	public void enterFName(String firstName)
	{
		driver.findElement(fName).sendKeys(firstName);
	}
	public void enterLName(String lastName) {
		driver.findElement(lName).sendKeys(lastName);
		
	}

}
