package selenium_api;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Topic_01 {
	// declare a webdriver
	private WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		// run with firefox 47
		driver = new FirefoxDriver();
		
		// run with chrome
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = (WebDriver) new ChromeDriver();
		
		// run with Ie
		System.setProperty("webdriver.ie.driver", ".\\drivers\\IeDriverServer.exe");
		driver = new InternetExplorerDriver();
	}

	@Test
	public void testEasy() {
		driver.get("http://demo.guru99.com/test/guru99home/");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 	
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
