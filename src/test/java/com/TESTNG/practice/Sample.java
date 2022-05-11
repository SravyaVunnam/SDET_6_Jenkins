package com.TESTNG.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(Listeners12.class)
public class Sample {
	static WebDriver sdriver;
	WebDriver driver;

	@BeforeClass
	public void bc()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		sdriver=driver;
	}


    @Test
	public void Org()
	{
		driver.get("http://localhost:8888");

		WebElement un=driver.findElement(By.name("user_name"));

		un.sendKeys("admin");

		WebElement pwd=driver.findElement(By.name("user_password"));

		pwd.sendKeys("admin");


		WebElement login=driver.findElement(By.id("submitButton"));
		login.click();

		Assert.assertEquals(false, true);

	}


	@Test
	public void contact()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://localhost:8888");

		WebElement un=driver.findElement(By.name("user_name"));

		un.sendKeys("admin");

		WebElement pwd=driver.findElement(By.name("user_password"));

		pwd.sendKeys("admin");


		WebElement login=driver.findElement(By.id("submitButton"));
		login.click();

		Assert.assertEquals(false, true);	
	}

}
