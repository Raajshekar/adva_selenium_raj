package com.proj.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class runner_class {
	@Test
	public void run()
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		FirefoxOptions opt=new FirefoxOptions();
		//opt.addArguments("__start_maximized");
		WebDriver driver=new FirefoxDriver(opt);
		driver.get("https://www.instagram.com/");	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("qspider");
		driver.findElement(By.name("password")).sendKeys("sush@123");
		driver.findElement(By.xpath("//div[text()='Log in']")).submit();
		
	}

}




