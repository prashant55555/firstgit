package openbrowser;


import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class finalmaven {
	@Test
	public void gettitle() throws InterruptedException{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		String title = driver.getTitle();
		Assert.assertEquals("Googl", title);
		
	}

}
