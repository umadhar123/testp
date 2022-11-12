package com.selenium.practice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name to intiate for testing:");
		String bName = sc.nextLine();
		if(bName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		}
		if(bName.equals("ie")) {
			System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
			WebDriver edgedriver = new EdgeDriver();
		}
		
		if(bName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			WebDriver firedriver = new FirefoxDriver();
		}
		
		
	}
}
