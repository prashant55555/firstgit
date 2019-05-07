package com.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openchrome {
	
	@Test
	
	public void opench()
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");//D:\\drivers\\chromedriver.exe
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement Title = driver.findElement(By.xpath("//a[@class='gb_x gb_Vb']"));
		
		String title1 = Title.getAttribute("title");
		System.out.println(title1);
		
	}

}
