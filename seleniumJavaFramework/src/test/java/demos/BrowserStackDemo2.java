package demos;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserStackDemo2 {
	public static final String AUTOMATE_USERNAME = "aubreyrosecorder_kDNY6A";
	public static final String AUTOMATE_ACCESS_KEY = "bR3P4rMkSge89Mo2DLLT";
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	//public static final WebDriverWait wait = null;
	
	static WebDriver driver = null;
	static WebElement stack;

	@BeforeTest
	public void setBrowserStack () {
		
	}
	
	@Test
	public static void BrowserStackTest () throws Exception {
		
		 ChromeOptions browserOptions = new ChromeOptions();
		    browserOptions.setPlatformName("Windows 10");
		    browserOptions.setBrowserVersion("101");
		    Map<String, Object> sauceOptions = new HashMap<>();
		    browserOptions.setCapability("sauce:options", sauceOptions);
		    
		   driver = new RemoteWebDriver(new URL(URL), browserOptions);
		   
		   driver.get("https://google.com");
		   System.out.println(driver.getTitle());
		   
		   
		   stack = driver.findElement(By.name("q"));
		   stack.sendKeys("Selenium");
		   stack.submit();
		   
	}
	
	@AfterTest
	 public void tearBrowserStack ()  {
		
		driver.close();
		System.out.println("Test Completed - 2");
		
	}
	
	@AfterTest
	public static void markTestStatus(String status, String reason, WebDriver driver) {
		final JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""+ status + "\", \"reason\": \"" + reason + "\"}}");

	}

}
