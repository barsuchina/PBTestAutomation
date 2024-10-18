package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager { //Opens browsers
	
	public WebDriver getChromeDriver(WebDriver driver) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		//Chrome browser
		
	}
	
	public WebDriver getFirefoxDriver(WebDriver driver) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
		//Firefox browser
		
	}
	
	public WebDriver getEdgeDriver(WebDriver driver) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		return driver;
		//Edge browser
		
	}

}
