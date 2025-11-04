package com.JenkinsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();

	}

}
