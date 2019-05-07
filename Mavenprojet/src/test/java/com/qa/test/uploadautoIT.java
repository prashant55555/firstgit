package com.qa.test;

import java.awt.Window;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class uploadautoIT {

	@Test
	public void uploadgmai() throws InterruptedException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");// D:\\drivers\\chromedriver.exe
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argumetn[0].scrollIntoView();", driver.findElement(By.id("gd")));
		

		driver.findElement(By.partialLinkText("Gmail")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Sign in")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String Title = driver.getTitle();
		System.out.println(Title);
		for (String childTab : driver.getWindowHandles()) {
			driver.switchTo().window(childTab);
		}
		String Title1 = driver.getTitle();
		System.out.println(Title1);

		// Actions action= new Actions(driver);
		// action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(
				"Prashantt250");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(
				"protri555@");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"))
				.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Runtime.getRuntime().exec("C:\\Users\\Hp\\Desktop\\AutoIT\\autoIT.exe");

	}

}
