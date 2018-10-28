package com.jenkins.samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinDemo {

	static WebDriver driver;
	
	@Test
	public void testSample() {
		System.out.println("welcome to jenkins world");
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("1");
		driver.manage().window().maximize();
		System.out.println("2");
		System.out.println("hi this is testing");

			
	}
}
