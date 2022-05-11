package com.TESTNG.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleHardAssert {
	
	
	@Test
	public void Org()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		
		WebElement un=driver.findElement(By.name("user_name"));
		boolean value = un.isDisplayed();
		
		Assert.assertEquals(value, true);
		un.sendKeys("admin");
		
		WebElement pwd=driver.findElement(By.name("user_password"));
		boolean pwdvalue = pwd.isDisplayed();
		
		Assert.assertEquals(pwdvalue, true);
		pwd.sendKeys("admin");
		
		
		WebElement login=driver.findElement(By.id("submitButton"));
		login.click();
		
	}

}
