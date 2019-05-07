package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	static WebDriver driver;

	public static WebDriver startbrowser(String BrowserName,String URL) throws Exception {
		if (BrowserName.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else{
			throw new Exception("driver not available");
		}
		driver.manage().window().maximize();
		driver.get(URL);
		return driver;
	}
	

}
