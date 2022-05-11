package com.TESTNG.practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenShot {
	@Test
	public void screenshot() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File destpath = new File("D:\\Selenium\\SDET6-master\\ScreenShot/vtiger.png");
		
		Files.copy(src, destpath);
	}
	

}
